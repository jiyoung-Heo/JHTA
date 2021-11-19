package jdbc01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 회원가입,전체조회,(삭제,회원검색,수정)기능을 갖는 프로그램 작성
 * 아이디 중복 예외발생됨-> 중복아이디면 사용가능한지아닌지 기능 추가하기
 */
public class Test04 {
	public static void main(String[] args) {
		MyJDBC04 db = new MyJDBC04();
		try {
			int n = db.insert();
			System.out.println(n + "개의 회원 등록 완료!");
//			int n = db.delete();
//			System.out.println(n+" 개의 회원 삭제 완료!");
//			int n = db.update();
//			System.out.println(n + "개의 회원 수정 완료!");
//			db.select();
//			db.selectAll();
		} catch (SQLException e) {
			e.getMessage();
		}
	}
}

class MyJDBC04 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;

	public MyJDBC04() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db접속 성공");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert() throws SQLException {
		boolean flag = false;
		System.out.println("회원추가");
		String id = "";
		while (flag == false) {
			flag = true;
			System.out.println("아이디");
			id = sc.next();
			String all = "select id from myuser";
			try (ResultSet rs = stmt.executeQuery(all);) {
				while (rs.next()) {
					String id2 = rs.getString("id");
					if (id2.equals(id)) {
						System.out.println("중복된 아이디입니다.");
						flag = false;
					}
				}
			}
		}
		System.out.println("비밀번호");
		String pwd = sc.next();
		System.out.println("이메일");
		String email = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		String sql = "insert into myuser values(" + id + "," + pwd + "," + email + "," + phone + ", sysdate)";
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int delete() throws SQLException {
		System.out.println("삭제할아이디");
		String id = sc.next();
		String sql = "delete from myuser where id=" + id;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int update() throws SQLException {
		System.out.println("수정할 아이디");
		System.out.println("아이디");
		String id = sc.next();
		System.out.println("비밀번호");
		String pwd = sc.next();
		System.out.println("이메일");
		String email = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		String sql = "update myuser into pwd = " + pwd + ", email=" + email + ",phone =" + phone + "where id=" + id;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void selectAll() throws SQLException {
		System.out.println("전체 회원목록");
		String all = "select* from myuser";
		try (ResultSet rs = stmt.executeQuery(all);) {
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Date regdate = rs.getDate("regdate");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println(regdate);
				System.out.println();
			}
		}
	}

	public void select() throws SQLException {
		System.out.println("검색할 회원 아이디");
		String id2 = sc.next();
		String all = "select * from myuser where id= '" + id2 + "'";
		try (ResultSet rs = stmt.executeQuery(all);) {
			if (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Date regdate = rs.getDate("regdate");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println(regdate);
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
	}
}

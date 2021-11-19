package jdbc01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		MyJDBC03 db = new MyJDBC03();
		try {
			int n = db.insert();
			System.out.println(n + "명의 회원등록 완료!");
//			int n1 = db.delete();
//			System.out.println(n1 + "명의 회원삭제 완료!");
//			int n2 = db.update();
//			System.out.println(n2 + " 명의 회원정보 수정 완료!");
			// 전체 회원목록 보기
//			db.showMembers();
			// 회원번호 입력받아 해당회원정보 출력하기
//			db.select();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}

class MyJDBC03 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;

	public MyJDBC03() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db접속성공");
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public int insert() throws SQLException {
		System.out.println("회원번호");
		int num = sc.nextInt();
		System.out.println("회원이름");
		String name = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		System.out.println("회원주소");
		String addr = sc.next();
		String sql = "insert into members values(" + num + "," + name + "," + phone + "," + addr + ",sysdate)";
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int delete() throws SQLException {
		System.out.println("삭제할 회원번호 입력");
		int num = sc.nextInt();
		String sql = "delete from members where num=" + num;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void close() {
		try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
			System.out.println("db접속해제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원번호와 수정할 이름,전화,주소를입력받아 해당 회원정보를 수정해보세요
	public int update() throws SQLException {
		System.out.println("수정할 회원번호 입력");
		int num = sc.nextInt();
		System.out.println("수정할 이름");
		String name = sc.next();
		System.out.println("수정할 전화번호");
		String phone = sc.next();
		System.out.println("수정할 주소");
		String addr = sc.next();
		String sql = "update members into name=" + name + ",phone=" + phone + ",addr=" + addr + " where num =" + num;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void showMembers() throws SQLException {
		System.out.println("Members 목록조회");
		String all = "select num,name,phone,addr from members";
		try (ResultSet rd = stmt.executeQuery(all);) {
			while (rd.next()) {
				int num = rd.getInt("num");
				String name = rd.getString("name");
				String phone = rd.getString("phone");
				String addr = rd.getString("addr");
				System.out.println(num);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println();
			}
		}
	}

	// 회원번호 입력받아 해당회원정보 출력하기
	public void select() throws SQLException {
		System.out.println("조회할 회원번호");
		int num1 = sc.nextInt();
		String all = "select num,name,phone,addr from members where num= " + num1;
		try (ResultSet rd = stmt.executeQuery(all);) {
			if (rd.next()) {
				int num = rd.getInt("num");
				String name = rd.getString("name");
				String phone = rd.getString("phone");
				String addr = rd.getString("addr");
				Date regdate = rd.getDate("regdate");
				System.out.println(num);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println(regdate);
			} else {
				System.out.println("조회된 회원정보가 없습니다.");
			}
		}
	}
}

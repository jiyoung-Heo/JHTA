package jdbc02.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
	회원가입,전체조회,(삭제,회원검색,수정)기능을 갖는 프로그램 작성
	--> PreparedStatement 로 사용해서 기능 구현해 보세요.
	<< 테이블 >>
	아이디(PK)
	비밀번호
	이메일
	전화번호
	가입일
	
	drop table myuser;
	create table myuser
	(
		id varchar2(10) primary key,
		pwd varchar2(10),
		email varchar2(15),
		phone varchar2(15),
		regdate date
	);
 */
public class Home01 {
	public static void main(String[] args) {
		MyJDBC01 db = new MyJDBC01();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.회원가입 2.전체조회 3.계정삭제 4.회원검색 5.수정 6.종료");
			int choice = sc.nextInt();
			try {
				switch (choice) {
				case 1:
					db.insert();
					break;
				case 2:
					db.allMyuser();
					break;
				case 3:
					db.delete();
					break;
				case 4:
					db.select();
					break;
				case 5:
					db.update();
					break;
				case 6:
					System.out.println("종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못된 번호입니다.");
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyJDBC01 {
	Connection con = null;
	Scanner sc = new Scanner(System.in);

	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("DB접속성공");
	}

	public void insert() throws SQLException {
		String sql = "insert into myuser values(?,?,?,?,sysdate)";
		String findidsql = "select id from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);
				// 중복테스트할 PreparedStatement객체 생성
				PreparedStatement findpsmt = con.prepareStatement(findidsql);) {
			boolean flag = false;
			while (flag == false) {
				flag = true;
				System.out.println("아이디 입력");
				String id = sc.next();
				psmt.setString(1, id);
				// 중복된 아이디면 다시 입력받기
				findpsmt.setString(1, id);
				ResultSet rs = findpsmt.executeQuery();
				if (rs.next()) {
					System.out.println("동일한 아이디가 존재합니다.");
					flag = false;
				}
			}
			System.out.println("비밀번호 입력");
			psmt.setString(2, sc.next());
			System.out.println("이메일 입력");
			psmt.setString(3, sc.next());
			System.out.println("전화번호 입력");
			psmt.setString(4, sc.next());
			int n = psmt.executeUpdate();
			System.out.println(n + "개가 추가되었습니다.");
		}

	}

	public void delete() throws SQLException {
		String sql = "delete from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("삭제할 아이디 입력");
			psmt.setString(1, sc.next());
			int n = psmt.executeUpdate();
			System.out.println(n + "개가 삭제되었습니다.");
		}
	}

	public void update() throws SQLException {
		String sql = "update myuser set pwd = ?, email = ?, phone = ? where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("아이디 입력");
			String id = sc.next();
			System.out.println("수정 비밀번호");
			psmt.setString(1, sc.next());
			System.out.println("수정 이메일");
			psmt.setString(2, sc.next());
			System.out.println("수정 전화번호");
			psmt.setString(3, sc.next());
			psmt.setString(4, id);
			int n = psmt.executeUpdate();
			System.out.println(n + "개가 수정되었습니다.");
		}
	}

	public void select() throws SQLException {
		String sql = "select id,pwd,email,phone from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("조회할 아이디 입력");
			psmt.setString(1, sc.next());
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
			} else {
				System.out.println("해당아이디가 존재하지 않습니다.");
			}
		}
	}

	public void allMyuser() throws SQLException {
		System.out.println("전체 회원목록");
		String sql = "select id,pwd,email,phone from myuser";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println();
			}
		}
	}

}
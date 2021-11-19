package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		MyJDBC2 db2 = new MyJDBC2();
//		db2.insert();
		// 삭제(회원번호 입력받아 삭제)
//		db2.delete();
		// 수정(이름, 전화번호, 주소 변경해보기)
//		db2.update();
		// 이름으로 조회하기 - 동명이인 있을 수 있음
		db2.select();
	}
}

class MyJDBC2 {
	Connection con = null;
	Scanner sc = new Scanner(System.in);

	public MyJDBC2() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db접속 성공!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// 회원번호, 이름, 전화번호, 주소 입력받아 db에 저장해 보세요(PreparedStatement 사용)
	public void insert() {
		System.out.println("회원번호");
		int num = sc.nextInt();
		System.out.println("이름");
		String name = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		System.out.println("주소");
		String addr = sc.next();
		String sql = "insert into members values(?,?,?,?, sysdate)";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, phone);
			pstmt.setString(4, addr);
			int n = pstmt.executeUpdate();
			System.out.println(n + "개가 추가 되었습니다!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("삭제할 회원번호");
		int num = sc.nextInt();
		String sql = "delete from members where num = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, num);
			int n = pstmt.executeUpdate();
			System.out.println(n + "개가 삭제되었습니다!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void update() {
		System.out.println("수정할 회원번호");
		int num = sc.nextInt();
		String sql = "update members set name=?,phone=?,addr=? where num = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			System.out.println("이름");
			pstmt.setString(1, sc.next());
			System.out.println("전화번호");
			pstmt.setString(2, sc.next());
			System.out.println("주소");
			pstmt.setString(3, sc.next());
			pstmt.setInt(4, num);
			int n = pstmt.executeUpdate();
			System.out.println(n + "개가 수정되었습니다!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// 이름으로 조회하기 - 동명이인 있을 수 있음
	public void select() {
		ResultSet rs = null;
		System.out.println("조회할 이름");
		String name = sc.next();
//		String sql = "select name, phone, addr from members where name =?";
		String sql = "select * from members where name =?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			int up = pstmt.executeUpdate();
			rs = pstmt.executeQuery(sql);
			if (rs.next()) {
//				do {
				String name1 = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				System.out.println(name1);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println();
//				} while (rs.next());		
			} else {
				System.out.println("해당 이름이 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

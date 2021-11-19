package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		MyJDBC02 db = new MyJDBC02();
//		db.insert();
		db.delete();
		db.close();
	}
}

class MyJDBC02 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;

	public MyJDBC02() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			con.setAutoCommit(false);
			System.out.println("db접속성공!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void close() {
		try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert() {
		System.out.println("회원번호");
		int num = sc.nextInt();
		System.out.println("회원이름");
		String name = sc.next();
		System.out.println("회원전화번호");
		String phone = sc.next();
		System.out.println("회원주소");
		String addr = sc.next();
		System.out.println("가입적립금");
		int mpoint = sc.nextInt();
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		String sql1 = "insert into members values(?,?,?,?,sysdate)";
		// 인덱스값 사용해서 번호 증감시켜줌
		String sql2 = "insert into point values(point_seq.nextval,?,?)";
		try {
			pstmt1 = con.prepareStatement(sql1);
			pstmt1.setInt(1, num);
			pstmt1.setString(2, name);
			pstmt1.setString(3, phone);
			pstmt1.setString(4, addr);
			pstmt1.executeUpdate();

			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1, num);
			pstmt2.setInt(2, mpoint);
			pstmt2.executeUpdate();
			System.out.println("회원가입완료");
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오류로 인해 저장할 수 없습니다.");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (pstmt2 != null)
					pstmt2.close();
				if (pstmt1 != null)
					pstmt1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete() {
		String sqlPoint = "delete from point where num = ?";
		String sqlMembers = "delete from members where num = ?";
		String sqlTest = "select num from members where num = ?";
		ResultSet rs = null;
		try (PreparedStatement pstmtP = con.prepareStatement(sqlPoint);
				PreparedStatement pstmtM = con.prepareStatement(sqlMembers);
				PreparedStatement pstmtTest = con.prepareStatement(sqlTest)) {
			boolean flag = false;
			while (flag == false) {
				System.out.println("삭제할 회원번호를 입력해주세요");
				String delNum = sc.next();
				pstmtP.setString(1, delNum);
				pstmtM.setString(1, delNum);
				pstmtTest.setString(1, delNum);
				rs = pstmtTest.executeQuery();

				if (rs.next()) {
					flag = true;
					int nP = pstmtP.executeUpdate();
					int nM = pstmtM.executeUpdate();
					con.commit();
					System.out.println(nM + "개의 정보가 삭제완료되었습니다.");
				} else {
					System.out.println("해당 회원번호가 존재하지 않습니다.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오류로 인해 저장할 수 없습니다.");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
/*
 * CREATE TABLE MEMBERS ( num NUMBER(5) PRIMARY KEY, name VARCHAR2(20) NOT NULL,
 * phone VARCHAR2(20), addr VARCHAR2(50), regdate DATE ); CREATE TABLE POINT (
 * pnum NUMBER(5) PRIMARY KEY, num NUMBER(5) REFERENCES MEMBERS(name), mpoint
 * NUMBER(6) ); CREATE INDEX pointIndex ON POINT(pnum DESC);
 */
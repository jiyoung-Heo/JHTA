package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [트랜잭션]
 * 1. 트랜젝션: 분리되어서는 안되는 연속적으로 수행되어야 할 작업의 묶음
 * 2. JDBC에서의 트랜잭션 처리
 * 	 - JDBC에서는 자동 커밋이 기본으로 설정되어있다. 트랜잭션처리는 Connection객체를 통해서 설정한다.
 * 	 - 방법
 * 		Connection con=DriverManager.getConnectiion(url,user,qwd);
 * 		con.setAutoCommit(false);//자동커밋해제
 * 		...
 * 		con.commit();//커밋하기
 * 		또는
 * 		con.rollback();//롤백하기
 */
public class Test01_Transaction {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db접속성공!");
			con.setAutoCommit(false);
			stmt = con.createStatement();
			String sql = "insert into members values(100,'김자바','011','영등포',sysdate)";
			stmt.executeUpdate(sql);
			String sql1 = "insert into members values(101010,'김순이','012','부산',sysdate)";
			stmt.executeUpdate(sql1);
			System.out.println("요청작업 완료");
			con.commit();// 커밋하기
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("오류로 인해 작업이 취소되었습니다");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
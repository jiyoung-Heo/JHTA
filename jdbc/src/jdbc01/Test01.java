package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [JDBC (Java DataBase Connectivity)]
 *  - JDBC 수행단계
 *  1. 드라이버로딩
 *  2. DB접속 및 Connection객체 얻어오기
 *  3. 원하는 작업 수행(조회, 수정, 삭제, 추가...)
 *  4. DB접속 해제
 */
public class Test01 {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		Connection con = null;// DB접속/해제 기능 java.sql.Connection
		Statement stmt = null;// SQL구문을 실행시키는 기능
		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버로딩 성공!");
			// String url="DB접속방법@DB서버주소:포트번호:SID";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB접속성공!");
//			String sql = "insert into members values(2,'이순이','011','부산',sysdate)";

			String sql = "delete from members where num=2";
			// sql구문을 실행하기 위한 Statement객체 얻어오기
			stmt = con.createStatement();
			// sql구문 실행하기
			int n = stmt.executeUpdate(sql);
			System.out.println(n + "개의 작업이 실행되었습니다...");

			String sql1 = "update members set phone='012', addr='제주' where num=1";
			int n1 = stmt.executeUpdate(sql1);
			System.out.println(n1 + "명의 정보가 수정되었습니다.");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			// db접속해제하기 - 연결된 순서의 역순으로 해제
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
	}
}
package jdbc03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 프로시져 입출력하기
 */
public class Test03_CallableStatement {
	public static void main(String[] args) {
		MyJDBC03 db = new MyJDBC03();
	}
}

//회원번호를 파라미터로 전달받아 삭제하는 프로시져를 만들고 jdbc를 이용해서 프로시져를 실행해보세요
class MyJDBC03 {
	Connection con = null;
	CallableStatement cstmt = null;
	CallableStatement cstmt2 = null;

	public MyJDBC03() {
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
			String sql = "{call addMember(?,?,?,?)}";
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 302);
			cstmt.setString(2, "이하얀1");
			cstmt.setString(3, "11112341");
			cstmt.setString(4, "역삼1");
			// sql구문 실행하기 dml작업할때 행의 갯수를 필요로 한다 그러면 executeUpdate사용 딱히 int값으로 안받아도 된다하면
			// execute로 실행해도된다.
			cstmt.execute();

			String sql2 = "{call delMember(?)}";
			cstmt2 = con.prepareCall(sql2);
			cstmt2.setInt(1, 301);
			cstmt2.execute();
			System.out.println("<<프로시져 실행 완료!>>");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (cstmt != null)
					cstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
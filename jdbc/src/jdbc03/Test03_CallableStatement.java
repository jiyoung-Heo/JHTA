package jdbc03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ���ν��� ������ϱ�
 */
public class Test03_CallableStatement {
	public static void main(String[] args) {
		MyJDBC03 db = new MyJDBC03();
	}
}

//ȸ����ȣ�� �Ķ���ͷ� ���޹޾� �����ϴ� ���ν����� ����� jdbc�� �̿��ؼ� ���ν����� �����غ�����
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
			System.out.println("db���Ӽ���!");
			String sql = "{call addMember(?,?,?,?)}";
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 302);
			cstmt.setString(2, "���Ͼ�1");
			cstmt.setString(3, "11112341");
			cstmt.setString(4, "����1");
			// sql���� �����ϱ� dml�۾��Ҷ� ���� ������ �ʿ�� �Ѵ� �׷��� executeUpdate��� ���� int������ �ȹ޾Ƶ� �ȴ��ϸ�
			// execute�� �����ص��ȴ�.
			cstmt.execute();

			String sql2 = "{call delMember(?)}";
			cstmt2 = con.prepareCall(sql2);
			cstmt2.setInt(1, 301);
			cstmt2.execute();
			System.out.println("<<���ν��� ���� �Ϸ�!>>");
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
package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [JDBC (Java DataBase Connectivity)]
 *  - JDBC ����ܰ�
 *  1. ����̹��ε�
 *  2. DB���� �� Connection��ü ������
 *  3. ���ϴ� �۾� ����(��ȸ, ����, ����, �߰�...)
 *  4. DB���� ����
 */
public class Test01 {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		Connection con = null;// DB����/���� ��� java.sql.Connection
		Statement stmt = null;// SQL������ �����Ű�� ���
		try {
			// 1. ����̹��ε�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹��ε� ����!");
			// String url="DB���ӹ��@DB�����ּ�:��Ʈ��ȣ:SID";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB���Ӽ���!");
//			String sql = "insert into members values(2,'�̼���','011','�λ�',sysdate)";

			String sql = "delete from members where num=2";
			// sql������ �����ϱ� ���� Statement��ü ������
			stmt = con.createStatement();
			// sql���� �����ϱ�
			int n = stmt.executeUpdate(sql);
			System.out.println(n + "���� �۾��� ����Ǿ����ϴ�...");

			String sql1 = "update members set phone='012', addr='����' where num=1";
			int n1 = stmt.executeUpdate(sql1);
			System.out.println(n1 + "���� ������ �����Ǿ����ϴ�.");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			// db���������ϱ� - ����� ������ �������� ����
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
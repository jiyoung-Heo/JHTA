package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [Ʈ�����]
 * 1. Ʈ������: �и��Ǿ�� �ȵǴ� ���������� ����Ǿ�� �� �۾��� ����
 * 2. JDBC������ Ʈ����� ó��
 * 	 - JDBC������ �ڵ� Ŀ���� �⺻���� �����Ǿ��ִ�. Ʈ�����ó���� Connection��ü�� ���ؼ� �����Ѵ�.
 * 	 - ���
 * 		Connection con=DriverManager.getConnectiion(url,user,qwd);
 * 		con.setAutoCommit(false);//�ڵ�Ŀ������
 * 		...
 * 		con.commit();//Ŀ���ϱ�
 * 		�Ǵ�
 * 		con.rollback();//�ѹ��ϱ�
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
			System.out.println("db���Ӽ���!");
			con.setAutoCommit(false);
			stmt = con.createStatement();
			String sql = "insert into members values(100,'���ڹ�','011','������',sysdate)";
			stmt.executeUpdate(sql);
			String sql1 = "insert into members values(101010,'�����','012','�λ�',sysdate)";
			stmt.executeUpdate(sql1);
			System.out.println("��û�۾� �Ϸ�");
			con.commit();// Ŀ���ϱ�
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("������ ���� �۾��� ��ҵǾ����ϴ�");
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
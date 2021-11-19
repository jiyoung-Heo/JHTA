package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * [ PreparedStatement ]
 * - Statement�� ��ӹ��� �������̽��� SQL������ �����ϴ� ����� ��ü
 * - �����
 *  SQL���忡 ������ �� �κ��� ? �� �ְ� ����ÿ� ? �� �����Ǵ� ���� setXXX �޼ҵ�� �����Ѵ�.
 * - Ư¡
 *  1) Statement �� ����ÿ� sql��ɾ �����ؼ� sql������ �����Ѵ�.-->�������� sql������ �ϳ��� Statement��ü�� ������ �� �ִ�.
 *     ��Ÿ�ӽ�?.?
 *  2) PreparedStatement�� ��ü�����ÿ� ������ sql�������� ������ �� �ִ�. -->�����Ͻÿ� ������ sql������ �����ǹǷ� ����ÿ� sql������ ����� �� ����.
 *     �̴� ���Ȼ� �����ϴ�. �����Ͻ� sql������ �����ȴ�.
 */
public class Test01_PreparedStatement {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "scott", "tiger");) {
			System.out.println("db���� ����!");
			String sql = "insert into members values(?,?,?,?,sysdate)";
			// sql ������ �����ϱ� ���� PreparedStatement ��ü ������
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setInt(1, 10);// 1��° ? ��ġ�� 10 �ֱ�
				pstmt.setString(2, "�����");// 2��° ? ��ġ�� '�����'�ֱ�
				pstmt.setString(3, "0101111111");// 3��° ? ��ġ�� '010...'�ֱ�
				pstmt.setString(4, "���� ����");
//			int n = pstmt.executeUpdate();
//			System.out.println(n + "���� ȸ�� ��ϿϷ�!");

			}
			String sql1 = "delete from members where num = ?";
			try (PreparedStatement pstmt1 = con.prepareStatement(sql1);) {
//			pstmt1 = con.prepareStatement(sql1);// sql ���� �־��ֱ�
				pstmt1.setInt(1, 10);
//			int n1 = pstmt1.executeUpdate();// ()�ȿ� ����
//			System.out.println(n1 + "���� ȸ�� ���� �Ϸ�!");
			}

			// �����ϱ�(������ ȸ����ȣ�� ȸ���̸�,��ȭ��ȣ,�ּҸ� ������ ������.)
			String sql2 = "update members set name=?,phone=?,addr=? where num = ?";
			try (PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
				pstmt2.setString(1, "�ȳ�");
				pstmt2.setString(2, "021111111");
				pstmt2.setString(3, "�λ�");
				pstmt2.setInt(4, 2);
				int n3 = pstmt2.executeUpdate();
				System.out.println(n3 + "���� ȸ�� �����Ϸ�!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
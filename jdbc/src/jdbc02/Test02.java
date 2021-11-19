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
		// ����(ȸ����ȣ �Է¹޾� ����)
//		db2.delete();
		// ����(�̸�, ��ȭ��ȣ, �ּ� �����غ���)
//		db2.update();
		// �̸����� ��ȸ�ϱ� - �������� ���� �� ����
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
			System.out.println("db���� ����!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// ȸ����ȣ, �̸�, ��ȭ��ȣ, �ּ� �Է¹޾� db�� ������ ������(PreparedStatement ���)
	public void insert() {
		System.out.println("ȸ����ȣ");
		int num = sc.nextInt();
		System.out.println("�̸�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		System.out.println("�ּ�");
		String addr = sc.next();
		String sql = "insert into members values(?,?,?,?, sysdate)";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, phone);
			pstmt.setString(4, addr);
			int n = pstmt.executeUpdate();
			System.out.println(n + "���� �߰� �Ǿ����ϴ�!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("������ ȸ����ȣ");
		int num = sc.nextInt();
		String sql = "delete from members where num = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, num);
			int n = pstmt.executeUpdate();
			System.out.println(n + "���� �����Ǿ����ϴ�!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void update() {
		System.out.println("������ ȸ����ȣ");
		int num = sc.nextInt();
		String sql = "update members set name=?,phone=?,addr=? where num = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			System.out.println("�̸�");
			pstmt.setString(1, sc.next());
			System.out.println("��ȭ��ȣ");
			pstmt.setString(2, sc.next());
			System.out.println("�ּ�");
			pstmt.setString(3, sc.next());
			pstmt.setInt(4, num);
			int n = pstmt.executeUpdate();
			System.out.println(n + "���� �����Ǿ����ϴ�!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// �̸����� ��ȸ�ϱ� - �������� ���� �� ����
	public void select() {
		ResultSet rs = null;
		System.out.println("��ȸ�� �̸�");
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
				System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
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

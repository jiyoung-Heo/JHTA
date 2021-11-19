package jdbc01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		MyJDBC03 db = new MyJDBC03();
		try {
			int n = db.insert();
			System.out.println(n + "���� ȸ����� �Ϸ�!");
//			int n1 = db.delete();
//			System.out.println(n1 + "���� ȸ������ �Ϸ�!");
//			int n2 = db.update();
//			System.out.println(n2 + " ���� ȸ������ ���� �Ϸ�!");
			// ��ü ȸ����� ����
//			db.showMembers();
			// ȸ����ȣ �Է¹޾� �ش�ȸ������ ����ϱ�
//			db.select();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}

class MyJDBC03 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;

	public MyJDBC03() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db���Ӽ���");
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public int insert() throws SQLException {
		System.out.println("ȸ����ȣ");
		int num = sc.nextInt();
		System.out.println("ȸ���̸�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		System.out.println("ȸ���ּ�");
		String addr = sc.next();
		String sql = "insert into members values(" + num + "," + name + "," + phone + "," + addr + ",sysdate)";
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int delete() throws SQLException {
		System.out.println("������ ȸ����ȣ �Է�");
		int num = sc.nextInt();
		String sql = "delete from members where num=" + num;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void close() {
		try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
			System.out.println("db��������");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ȸ����ȣ�� ������ �̸�,��ȭ,�ּҸ��Է¹޾� �ش� ȸ�������� �����غ�����
	public int update() throws SQLException {
		System.out.println("������ ȸ����ȣ �Է�");
		int num = sc.nextInt();
		System.out.println("������ �̸�");
		String name = sc.next();
		System.out.println("������ ��ȭ��ȣ");
		String phone = sc.next();
		System.out.println("������ �ּ�");
		String addr = sc.next();
		String sql = "update members into name=" + name + ",phone=" + phone + ",addr=" + addr + " where num =" + num;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void showMembers() throws SQLException {
		System.out.println("Members �����ȸ");
		String all = "select num,name,phone,addr from members";
		try (ResultSet rd = stmt.executeQuery(all);) {
			while (rd.next()) {
				int num = rd.getInt("num");
				String name = rd.getString("name");
				String phone = rd.getString("phone");
				String addr = rd.getString("addr");
				System.out.println(num);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println();
			}
		}
	}

	// ȸ����ȣ �Է¹޾� �ش�ȸ������ ����ϱ�
	public void select() throws SQLException {
		System.out.println("��ȸ�� ȸ����ȣ");
		int num1 = sc.nextInt();
		String all = "select num,name,phone,addr from members where num= " + num1;
		try (ResultSet rd = stmt.executeQuery(all);) {
			if (rd.next()) {
				int num = rd.getInt("num");
				String name = rd.getString("name");
				String phone = rd.getString("phone");
				String addr = rd.getString("addr");
				Date regdate = rd.getDate("regdate");
				System.out.println(num);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println(regdate);
			} else {
				System.out.println("��ȸ�� ȸ�������� �����ϴ�.");
			}
		}
	}
}

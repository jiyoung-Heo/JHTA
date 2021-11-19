package jdbc01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * ȸ������,��ü��ȸ,(����,ȸ���˻�,����)����� ���� ���α׷� �ۼ�
 * ���̵� �ߺ� ���ܹ߻���-> �ߺ����̵�� ��밡�������ƴ��� ��� �߰��ϱ�
 */
public class Test04 {
	public static void main(String[] args) {
		MyJDBC04 db = new MyJDBC04();
		try {
			int n = db.insert();
			System.out.println(n + "���� ȸ�� ��� �Ϸ�!");
//			int n = db.delete();
//			System.out.println(n+" ���� ȸ�� ���� �Ϸ�!");
//			int n = db.update();
//			System.out.println(n + "���� ȸ�� ���� �Ϸ�!");
//			db.select();
//			db.selectAll();
		} catch (SQLException e) {
			e.getMessage();
		}
	}
}

class MyJDBC04 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;

	public MyJDBC04() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db���� ����");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert() throws SQLException {
		boolean flag = false;
		System.out.println("ȸ���߰�");
		String id = "";
		while (flag == false) {
			flag = true;
			System.out.println("���̵�");
			id = sc.next();
			String all = "select id from myuser";
			try (ResultSet rs = stmt.executeQuery(all);) {
				while (rs.next()) {
					String id2 = rs.getString("id");
					if (id2.equals(id)) {
						System.out.println("�ߺ��� ���̵��Դϴ�.");
						flag = false;
					}
				}
			}
		}
		System.out.println("��й�ȣ");
		String pwd = sc.next();
		System.out.println("�̸���");
		String email = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		String sql = "insert into myuser values(" + id + "," + pwd + "," + email + "," + phone + ", sysdate)";
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int delete() throws SQLException {
		System.out.println("�����Ҿ��̵�");
		String id = sc.next();
		String sql = "delete from myuser where id=" + id;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public int update() throws SQLException {
		System.out.println("������ ���̵�");
		System.out.println("���̵�");
		String id = sc.next();
		System.out.println("��й�ȣ");
		String pwd = sc.next();
		System.out.println("�̸���");
		String email = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		String sql = "update myuser into pwd = " + pwd + ", email=" + email + ",phone =" + phone + "where id=" + id;
		int n = stmt.executeUpdate(sql);
		return n;
	}

	public void selectAll() throws SQLException {
		System.out.println("��ü ȸ�����");
		String all = "select* from myuser";
		try (ResultSet rs = stmt.executeQuery(all);) {
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Date regdate = rs.getDate("regdate");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println(regdate);
				System.out.println();
			}
		}
	}

	public void select() throws SQLException {
		System.out.println("�˻��� ȸ�� ���̵�");
		String id2 = sc.next();
		String all = "select * from myuser where id= '" + id2 + "'";
		try (ResultSet rs = stmt.executeQuery(all);) {
			if (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Date regdate = rs.getDate("regdate");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println(regdate);
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}

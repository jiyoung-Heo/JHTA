package jdbc02.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
	ȸ������,��ü��ȸ,(����,ȸ���˻�,����)����� ���� ���α׷� �ۼ�
	--> PreparedStatement �� ����ؼ� ��� ������ ������.
	<< ���̺� >>
	���̵�(PK)
	��й�ȣ
	�̸���
	��ȭ��ȣ
	������
	
	drop table myuser;
	create table myuser
	(
		id varchar2(10) primary key,
		pwd varchar2(10),
		email varchar2(15),
		phone varchar2(15),
		regdate date
	);
 */
public class Home01 {
	public static void main(String[] args) {
		MyJDBC01 db = new MyJDBC01();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ȸ������ 2.��ü��ȸ 3.�������� 4.ȸ���˻� 5.���� 6.����");
			int choice = sc.nextInt();
			try {
				switch (choice) {
				case 1:
					db.insert();
					break;
				case 2:
					db.allMyuser();
					break;
				case 3:
					db.delete();
					break;
				case 4:
					db.select();
					break;
				case 5:
					db.update();
					break;
				case 6:
					System.out.println("�����մϴ�.");
					System.exit(0);
				default:
					System.out.println("�߸��� ��ȣ�Դϴ�.");
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyJDBC01 {
	Connection con = null;
	Scanner sc = new Scanner(System.in);

	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("DB���Ӽ���");
	}

	public void insert() throws SQLException {
		String sql = "insert into myuser values(?,?,?,?,sysdate)";
		String findidsql = "select id from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);
				// �ߺ��׽�Ʈ�� PreparedStatement��ü ����
				PreparedStatement findpsmt = con.prepareStatement(findidsql);) {
			boolean flag = false;
			while (flag == false) {
				flag = true;
				System.out.println("���̵� �Է�");
				String id = sc.next();
				psmt.setString(1, id);
				// �ߺ��� ���̵�� �ٽ� �Է¹ޱ�
				findpsmt.setString(1, id);
				ResultSet rs = findpsmt.executeQuery();
				if (rs.next()) {
					System.out.println("������ ���̵� �����մϴ�.");
					flag = false;
				}
			}
			System.out.println("��й�ȣ �Է�");
			psmt.setString(2, sc.next());
			System.out.println("�̸��� �Է�");
			psmt.setString(3, sc.next());
			System.out.println("��ȭ��ȣ �Է�");
			psmt.setString(4, sc.next());
			int n = psmt.executeUpdate();
			System.out.println(n + "���� �߰��Ǿ����ϴ�.");
		}

	}

	public void delete() throws SQLException {
		String sql = "delete from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("������ ���̵� �Է�");
			psmt.setString(1, sc.next());
			int n = psmt.executeUpdate();
			System.out.println(n + "���� �����Ǿ����ϴ�.");
		}
	}

	public void update() throws SQLException {
		String sql = "update myuser set pwd = ?, email = ?, phone = ? where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("���̵� �Է�");
			String id = sc.next();
			System.out.println("���� ��й�ȣ");
			psmt.setString(1, sc.next());
			System.out.println("���� �̸���");
			psmt.setString(2, sc.next());
			System.out.println("���� ��ȭ��ȣ");
			psmt.setString(3, sc.next());
			psmt.setString(4, id);
			int n = psmt.executeUpdate();
			System.out.println(n + "���� �����Ǿ����ϴ�.");
		}
	}

	public void select() throws SQLException {
		String sql = "select id,pwd,email,phone from myuser where id = ?";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			System.out.println("��ȸ�� ���̵� �Է�");
			psmt.setString(1, sc.next());
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
			} else {
				System.out.println("�ش���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

	public void allMyuser() throws SQLException {
		System.out.println("��ü ȸ�����");
		String sql = "select id,pwd,email,phone from myuser";
		try (PreparedStatement psmt = con.prepareStatement(sql);) {
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.println(id);
				System.out.println(pwd);
				System.out.println(email);
				System.out.println(phone);
				System.out.println();
			}
		}
	}

}
package jdbc03.homework;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//<< �������̺� >>
//
//���Ź�ȣ(PK),�����ھ��̵�,��ǰ��,����,����,������
//
//<< �������̺� >>
//
//������ȣ(PK) ���Ź�ȣ(FK) �����ݾ� ��������
//
//
//���� ������ ���� ���̺��� ����� ���ű���� ������ ������.(PreparedStatement�� ����մϴ�.)
//
//[������]
//1. ��ǰ����  2.������������ 3.����������ȸ  4.������� 
//..
//
//��ǰ����:�����ھ��̵�,��ǰ��,����,����,�������� �Է� �޾Ƽ� ����
//����������ȸ:��ü�������� ��ȸ
//������������:��ǰ��,����,����,�����ݾ�,���������� �����մϴ�.
//�������:���������� ���������� ��� �����˴ϴ�.
//
//Ʈ����� ó���� �����ϵ��� ����� ������

public class Home01 {
	public static void main(String[] args) {
		MyJDBC01 db = new MyJDBC01();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1.��ǰ���� 2.������������ 3.����������ȸ 4.�������");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					db.buy();
					break;
				case 2:
					db.update();
					break;
				case 3:
					db.find();
					break;
				case 4:
					db.cancel();
					break;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

class MyJDBC01 {
	Scanner sc = new Scanner(System.in);
	Connection con = null;

	public MyJDBC01() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("db���� ����!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void buy() {
		System.out.println("�����ھ��̵�");
		String id = sc.next();
		System.out.println("��ǰ��");
		String product = sc.next();
		System.out.println("����");
		int price = sc.nextInt();
		System.out.println("����");
		int count = sc.nextInt();
		System.out.println("��������");
		String payMethod = sc.next();
		String sql = "insert into buy(id,product,price,count,sysdate) values(?,?,?,?,?)";
	}

	public void find() {
		String sql = "select num,id,product,price,count,buyday from buy";
		ResultSet rs = null;
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String product = rs.getString("product");
				int price = rs.getInt("price");
				int count = rs.getInt("count");
				Date buyday = rs.getDate("buyday");
				System.out.println(num);
				System.out.println(id);
				System.out.println(product);
				System.out.println(price);
				System.out.println(count);
				System.out.println(buyday);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
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

//	������������:��ǰ��,����,����,�����ݾ�,���������� �����մϴ�.
	public void update() throws SQLException {
		String sql = "update buy set product=?,price=?,count=? where num = ?";
		String sql2 = "update pay set price = ?, payMethod=? where num=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
			System.out.println("���Ź�ȣ�Է�");
			int num = sc.nextInt();
			System.out.println("��ǰ����");
			pstmt.setString(1, sc.next());
			System.out.println("����");
			pstmt.setInt(2, sc.nextInt());
			System.out.println("����");
			pstmt.setInt(3, sc.nextInt());
			pstmt.setInt(4, num);
			System.out.println("�����ݾ�");
			pstmt2.setInt(1, sc.nextInt());
			System.out.println("��������");
			pstmt2.setString(2, sc.next());
			pstmt2.setInt(3, num);
			pstmt.execute();
			pstmt2.execute();
			System.out.println("�����Ϸ�");
		}
	}

//	�������:���������� ���������� ��� �����˴ϴ�.
	public void cancel() throws SQLException {
		String sql = "delete from buy where num = ?";
		String sql2 = "delete from pay where num=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);) {
			System.out.println("���Ź�ȣ�Է�");
			int num = sc.nextInt();
			pstmt2.setInt(1, num);
			pstmt.setInt(1, num);
			pstmt2.execute();
			pstmt.execute();
			System.out.println("�����Ϸ�");
		}
	}
}
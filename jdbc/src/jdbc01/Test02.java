package jdbc01;
//��ȸ�ϱ�

//select all select

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {
	public static void main(String[] args) {
		new MyJDBC02();
	}
}

class MyJDBC02 {
	public MyJDBC02() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����̹��ε� ����!");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Connection con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB���Ӽ���!");
			// ��ȸ
			Statement stmt = con.createStatement();
			String sql = "select * from members";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String num = rs.getString("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date date = rs.getDate("regdate");
				System.out.println(num);
				System.out.println(name);
				System.out.println(phone);
				System.out.println(addr);
				System.out.println(date);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
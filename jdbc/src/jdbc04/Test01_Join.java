package jdbc04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc04.test.bb.DBConnection;

public class Test01_Join {
	public static void main(String[] args) {
		new MyJDBC01();
	}
}

class MyJDBC01 {
	public MyJDBC01() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// Ŀ�ؼ� ������
			con = DBConnection.getCon();
			// �����ȣ,�̸�,�μ���ȣ,�μ����� ��ȸ�ϼ���
			String sql = "select e.empno,e.ename, e.deptno,d.dname from emp e inner join dept d on e.deptno=d.deptno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("�����ȣ ����̸� �μ���ȣ �μ���");
			while (rs.next()) {
//				int empno=rs.getInt("empno");
				int empno = rs.getInt(1);// 1��° �÷��� ������
				String ename = rs.getString(2);// 2��° �÷��� ������
				String deptno = rs.getString("deptno");
				String dname = rs.getString("dname");
				System.out.println(empno + " " + ename + " " + deptno + " " + dname);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}
}

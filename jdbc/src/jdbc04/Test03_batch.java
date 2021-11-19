package jdbc04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import jdbc04.test.bb.DBConnection;

/*
 * ��ġ���α׷�(�ϰ�ó��)
 * - ���� sql������ �ѹ��� ����(dml�� �����Ѵ�.)
 * - ��뷮 ������Ʈ�� �ӵ� ����� ���� BATCH�� ����Ѵ�.
	
	CREATE TABLE BATCHTEST
	(
		ID NUMBER,
		NAME VARCHAR2(1000),
		AGE NUMBER(3)
	);
 */
public class Test03_batch {
	public static void main(String[] args) {
		new MyJDBC03();
	}
}

class MyJDBC03 {
	public MyJDBC03() {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBConnection.getCon();
			con.setAutoCommit(false);
			String sql = "insert into batchtest values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			Random rnd = new Random();
			for (int i = 0; i < 10000; i++) {
				// �и��� �޾ƿ�
				long uid = System.currentTimeMillis();
				String name = "ȫ�浿_" + uid;
				int age = rnd.nextInt(80) + 20;
				pstmt.setLong(1, uid);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.addBatch();// ����� ������ ��ġ�� ���
				if (i % 10000 == 0) {
					pstmt.executeBatch();// ��ġ�� ����� ������ �Ѳ����� �����ϱ�
					pstmt.clearBatch();// ��ġ �ʱ�ȭ�ϱ�
					con.commit();
				}
//				pstmt.executeUpdate();
			}
			pstmt.executeBatch();// ��ġ�� ����� ������ �Ѳ����� �����ϱ�
			pstmt.clearBatch();// ��ġ �ʱ�ȭ�ϱ�
			con.commit();
			System.out.println("�۾��Ϸ�");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}
}
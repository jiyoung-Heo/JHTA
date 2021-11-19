package jdbc04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import jdbc04.test.bb.DBConnection;

/*
 * 배치프로그램(일괄처리)
 * - 많은 sql구문을 한번에 실행(dml에 적용한다.)
 * - 대용량 업데이트시 속도 향상을 위해 BATCH를 사용한다.
	
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
				// 밀리초 받아옴
				long uid = System.currentTimeMillis();
				String name = "홍길동_" + uid;
				int age = rnd.nextInt(80) + 20;
				pstmt.setLong(1, uid);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.addBatch();// 실행될 쿼리를 배치에 담기
				if (i % 10000 == 0) {
					pstmt.executeBatch();// 배치에 저장된 쿼리를 한꺼번에 실행하기
					pstmt.clearBatch();// 배치 초기화하기
					con.commit();
				}
//				pstmt.executeUpdate();
			}
			pstmt.executeBatch();// 배치에 저장된 쿼리를 한꺼번에 실행하기
			pstmt.clearBatch();// 배치 초기화하기
			con.commit();
			System.out.println("작업완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}
}
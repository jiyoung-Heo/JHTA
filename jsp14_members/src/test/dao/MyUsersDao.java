package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.db.DBConnection;

public class MyUsersDao {
	public boolean isMember(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false;
		try {
			con = DBConnection.getCon();
			String sql = "select * from myusers where id = ? and pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return result;
	}
}

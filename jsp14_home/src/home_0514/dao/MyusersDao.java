package home_0514.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import home_0514.db.DBConnection;

public class MyusersDao {
	public boolean insertId(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean result = false;
		String sql = "select id, pwd from myuser where id = ? and pwd=?";
		try {
			con = DBConnection.getCon();
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

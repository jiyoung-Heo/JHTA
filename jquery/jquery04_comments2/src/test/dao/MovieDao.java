package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.db.DBConnection;
import java.sql.ResultSet;

import test.vo.MovieVo;

public class MovieDao {
	private static MovieDao instance=new MovieDao();
	private MovieDao() {}
	public static MovieDao getInstance() {
		return instance;
	}
	public MovieVo getinfo(int mnum) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DBConnection.getCon();
			String sql="select * from movie where mnum=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,mnum);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String title=rs.getString("title");
				String content=rs.getString("content");
				String director=rs.getString("director");
				MovieVo vo=new MovieVo(mnum, title, content, director);
				return vo;
			}else {
				return null;
			}
		}catch(SQLException s) {
			s.printStackTrace();
			return null;
		}finally {
			DBConnection.close(con, pstmt, rs);
		}
	}
}










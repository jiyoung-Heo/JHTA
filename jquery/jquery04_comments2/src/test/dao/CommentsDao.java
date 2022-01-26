package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.db.DBConnection;
import test.vo.CommentsVo;

public class CommentsDao {
	private static CommentsDao instance=new CommentsDao();
	private  CommentsDao() {}
	public static CommentsDao getInstance() {
		return instance;
	}
	public int delete(int num) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="delete from comments where num=?";
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,num);
			return pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			return -1;
		}finally {
			DBConnection.close(con, pstmt,null);
		}
	}
	public int insert(CommentsVo vo) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="insert into comments values(comments_seq.nextval,?,?,?)";
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,vo.getMnum());
			pstmt.setString(2,vo.getId());
			pstmt.setString(3,vo.getComments());
			return pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
			return -1;
		}finally {
			DBConnection.close(con, pstmt,null);
		}
	}
	public ArrayList<CommentsVo> list(int mnum){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from comments where mnum=?";
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,mnum);
			rs=pstmt.executeQuery();
			ArrayList<CommentsVo> clist=new ArrayList<CommentsVo>();
			while(rs.next()) {
				CommentsVo vo=new CommentsVo(
						rs.getInt("num"),
						rs.getInt("mnum"),
						rs.getString("id"), 
						rs.getString("comments"));
				clist.add(vo);
			}
			return clist;
		}catch(SQLException s) {
			s.printStackTrace();
			return null;
		}finally {
			DBConnection.close(con, pstmt, rs);
		}
	}
}



























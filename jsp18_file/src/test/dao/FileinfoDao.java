package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.db.DBConnection;
import test.vo.FileinfoVo;

// 파일정보를 DB에 저장해 보세요 - DAO는 싱글톤객체로 생성되도록 해보세요.
public class FileinfoDao {
	private static FileinfoDao instance=new FileinfoDao();
	private FileinfoDao() {}
	public static FileinfoDao getInstance() {
		return instance;
	}
	public ArrayList<FileinfoVo> list(){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DBConnection.getCon();
			String sql="select * from fileinfo";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			ArrayList<FileinfoVo> alist=new ArrayList<FileinfoVo>();
			while(rs.next()) {
				FileinfoVo vo=new FileinfoVo(
						rs.getInt("filenum"), 
						rs.getString("writer"),
						rs.getString("title"), 
						rs.getString("content"),
						rs.getString("orgfilename"), 
						rs.getString("savefilename"), 
						rs.getLong("filesize"));
				
				alist.add(vo);
			}
			return alist;
		}catch(SQLException se) {
			se.printStackTrace();
			return null;
		}finally {
			DBConnection.close(con, pstmt, rs);
		}
	}
	public FileinfoVo getinfo(int filenum){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DBConnection.getCon();
			String sql="select * from fileinfo where filenum=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,filenum);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				FileinfoVo vo=new FileinfoVo(
						rs.getInt("filenum"), 
						rs.getString("writer"),
						rs.getString("title"), 
						rs.getString("content"),
						rs.getString("orgfilename"), 
						rs.getString("savefilename"), 
						rs.getLong("filesize"));
				return vo;
			}
			return null;
		}catch(SQLException se) {
			se.printStackTrace();
			return null;
		}finally {
			DBConnection.close(con, pstmt, rs);
		}
	}
	public int delete(int filenum) {
		Connection con=null;
		String sql="delete from fileinfo where filenum=?";
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,filenum);
			return pstmt.executeUpdate();
		}catch(SQLException s) {
			s.printStackTrace();
			return -1;
		}finally {
			DBConnection.close(con,pstmt,null);
		}
	}
	public int insert(FileinfoVo vo) {
		Connection con=null;
		String sql="insert into fileinfo values(fileinfo_seq.nextval,?,?,?,?,?,?)";
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,vo.getWriter());
			pstmt.setString(2,vo.getTitle());
			pstmt.setString(3,vo.getContent());
			pstmt.setString(4,vo.getOrgfilename());
			pstmt.setString(5,vo.getSavefilename());
			pstmt.setLong(6,vo.getFilesize());
			return pstmt.executeUpdate();
		}catch(SQLException s) {
			s.printStackTrace();
			return -1;
		}finally {
			DBConnection.close(con,pstmt,null);
		}
	}
	public int update(FileinfoVo vo) {
		Connection con=null;
		String sql="update fileinfo set writer=?,title=?,content=?,orgfilename=?,savefilename=?,filesize=? " +
		           "where filenum=?";
		PreparedStatement pstmt=null;
		try {
			con=DBConnection.getCon();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,vo.getWriter());
			pstmt.setString(2,vo.getTitle());
			pstmt.setString(3,vo.getContent());
			pstmt.setString(4,vo.getOrgfilename());
			pstmt.setString(5,vo.getSavefilename());
			pstmt.setLong(6,vo.getFilesize());
			pstmt.setInt(7,vo.getFilenum());
			return pstmt.executeUpdate();
		}catch(SQLException s) {
			s.printStackTrace();
			return -1;
		}finally {
			DBConnection.close(con,pstmt,null);
		}
	}
}

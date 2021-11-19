package home_0506;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import home_0506.db.DBConnection;
import home_0506.vo.BoardVo;

public class BoardDAO {
	public ArrayList<BoardVo> list() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVo> list = new ArrayList<>();
		String sql = "select * from board";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String writer = rs.getString("writer");
				String email = rs.getString("email");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Date w_date = rs.getDate("w_date");
				BoardVo vo = new BoardVo(num, writer, email, title, content, w_date);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return list;
	}
	
	public int insertList(BoardVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "insert into board values(board_seq.nextval,?,?,?,?,sysdate)";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getTitle());
			pstmt.setString(4, vo.getContent());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
		return result;
	}

	public int delete(String num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "delete from board where num =?";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
		return result;
	}

	public BoardVo selectList(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVo vo = null;
		String sql = "select num,writer,email,title,content,w_date from board where num = ?";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int num1 = rs.getInt("num");
				String writer = rs.getString("writer");
				String email = rs.getString("email");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Date w_date = rs.getDate("w_date");
				vo = new BoardVo(num1, writer, email, title, content, w_date);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return vo;
	}

	 public int update(BoardVo vo) {
		 Connection con = null;
			PreparedStatement pstmt = null;
			int result = 0;
			String sql = "update board set writer=?,email=?,"
					+ "title=?,content=? where num =?";
			try {
				con = DBConnection.getCon();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, vo.getWriter());
				pstmt.setString(2, vo.getEmail());
				pstmt.setString(3, vo.getTitle());
				pstmt.setString(4, vo.getContent());
				pstmt.setInt(5, vo.getNum());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnection.close(con, pstmt, null);
			}
			return result;
	}
}

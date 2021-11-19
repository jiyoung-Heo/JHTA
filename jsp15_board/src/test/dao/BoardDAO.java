package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.db.DBConnection;
import test.vo.BoardVo;

public class BoardDAO {
	// 가장 큰 글번호 얻어오기
	// 시퀀스로 해도 된다.
	public int getMaxNum() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int mnum = -1;
		try {
			con = DBConnection.getCon();
			String sql = "select NVL(max(num),0) mnum from guestboard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			// 첫번째 칼럼 얻어와라 (alias 안쓴경우)
			// mnum = rs.getInt(1);
			// alias 쓴경우
			mnum = rs.getInt("mnum");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return mnum;
	}

	public int getCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int mnum = -1;
		try {
			con = DBConnection.getCon();
			String sql = "select NVL(count(num),0) mnum from guestboard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			mnum = rs.getInt("mnum");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return mnum;
	}

	public int insert(BoardVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		int result = 0;
		String sql = "insert into guestboard values(?,?,?,?,?,?,?)";
		try {
			con = DBConnection.getCon();
			int boardNum = getMaxNum() + 1;// 글번호
			int num = vo.getNum();
			int ref = vo.getRef();
			int lev = vo.getLev();
			int step = vo.getStep();
			if (num == 0) {// 새글인경우
				ref = boardNum;
			} else {// 답글인경우

				String sql1 = "update guestboard set step=step+1 where ref =? and step>?";
				pstmt1 = con.prepareStatement(sql1);
				pstmt1.setInt(1, ref);
				pstmt1.setInt(2, step);
				result = pstmt1.executeUpdate();
				lev += 1;
				step += 1;
			}
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardNum);
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getTitle());
			pstmt.setString(4, vo.getContent());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, lev);
			pstmt.setInt(7, step);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt1);
			DBConnection.close(pstmt);
			DBConnection.close(con);
		}
		return result;
	}

	public ArrayList<BoardVo> boardList(int startRow, int endRow) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVo> list = new ArrayList<>();
		String sql = "select * from (select g.*,rownum rnum from (select * from guestboard whrere order by ref desc,step asc) g)"
				+ "where rnum >=? and rnum<=?";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				String title = rs.getString("title");
				int ref = rs.getInt("ref");
				int lev = rs.getInt("lev");
				int step = rs.getInt("step");
				BoardVo vo = new BoardVo(num, writer, title, content, ref, lev, step);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return list;
	}

	public BoardVo detail(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVo vo = null;
		String sql = "select * from guestboard where num = ?";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				String title = rs.getString("title");
				int ref = rs.getInt("ref");
				int lev = rs.getInt("lev");
				int step = rs.getInt("step");
				vo = new BoardVo(num, writer, title, content, ref, lev, step);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return vo;
	}
}
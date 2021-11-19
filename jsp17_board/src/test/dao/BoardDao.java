package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.db.DBConnection;
import test.vo.MyBoardVo;

/*
 * [싱글톤패턴 객체 만들기]
 * - 객체가 하나만 생성되게 하는 기법 -> 객체를 공유해서 사용한다
 * - 만드는 방법
 * 1. 객체 자신을 static 멤버 변수로 생성한다
 * 2. 외부에서 생성하지 못하도록 생성자를 private로 만든다
 * 3. 1에서 생성된 객체를 리턴하는 static 메소드를 만든다.
 * 
 */
public class BoardDao {// 얘가 임포트 되는 순간 20라인 private static BoardDao instance=new BoardDao();가 만들어짐
	// 1. 객체 자신을 static 멤버변수로 생성한다.
	// static으로 만들면 new로 만들지 않아도 멤버변수 생성 가능
	private static BoardDao instance = new BoardDao(); // 외부에서 사용하려고 외부에서 new를 생성해줄 필요 없음. instance가 클래스를 만드는 순간 생성
	// 외부 : BoardDao a=BoardDao.getInstance(); a.insert(vo); 로 써주면 됨. 왜 new로 생성 하면
	// 안되냐? 안되는건 아니지만 메모리를 많이차지함\
	// 2. private은 외부에서 new로 생성을 못함. 그래서 instance로만 사용할 수 잇게끔 private으로 생성자를 만들어줌

	private BoardDao() {
	}

	// 3. 1에서 생성된 객체를 리턴하는 static 메소드를 만든다.
	public static BoardDao getInstance() {
		return instance; // 외부에서 사용할 수 잇도록 리턴해주는 메소드 만들기 (new로 생성해준 객체 instance를 받기 위해서?)
	}

	public int insert(MyBoardVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into myboard values(myboard_seq.nextval,?,?,?,sysdate)";
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			return pstmt.executeUpdate();
		} catch (SQLException s) {
			s.printStackTrace();
			return -1;
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}

	public int getMaxNum() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getCon();
			String sql = "select NVL(max(num),0) mnum from myboard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			int mnum = rs.getInt("mnum");
			return mnum;
		} catch (SQLException s) {
			s.printStackTrace();
			return -1;
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

	public int getCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getCon();
			String sql = "select NVL(count(num),0) from myboard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			int mnum = rs.getInt(1);
			return mnum;
		} catch (SQLException se) {
			se.printStackTrace();
			return -1; // 글번호가 -1이 들어가지 않을꺼니까 -1주기
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

	public ArrayList<MyBoardVo> list(int startRow, int endRow) {
		String sql = "select * from ("
				+ "select g.*,rownum rnum from "
				+ "(select * from myboard order by num desc) g) "
				+ "where rnum>=? and rnum<=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			ArrayList<MyBoardVo> list = new ArrayList<MyBoardVo>();
			while (rs.next()) {
				int num = rs.getInt("num");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				MyBoardVo vo = new MyBoardVo(num, writer, title, content, null);
				list.add(vo);
			}
			return list;
		} catch (SQLException s) {
			s.printStackTrace();
			return null;
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

	public ArrayList<MyBoardVo> findList(String field, String keyword, int startNum, int endNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MyBoardVo> list = new ArrayList<>();
		try {
			con = DBConnection.getCon();
			String sql = "select * from (select g.*,rownum rnum from((select * from myboard where " + field
					+ " like '%'||?||'%')g)) where rnum>=? and rnum<=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, keyword);
			pstmt.setInt(2, startNum);
			pstmt.setInt(3, endNum);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				MyBoardVo vo = new MyBoardVo(num, writer, title, content, null);
				list.add(vo);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return list;
	}
}

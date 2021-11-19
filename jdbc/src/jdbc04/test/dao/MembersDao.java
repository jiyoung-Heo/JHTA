package jdbc04.test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc04.test.bb.DBConnection;
import jdbc04.test.vo.MembersVo;

/*
 * [DAO (Data Access Object)]
 * -DBMS와 연동하여 CRUD(Create,Read,Update,Delete)작업을 하는 기능의 클래스
 * 
 */
public class MembersDao {
	// 이름으로 조회하기.
	public ArrayList<MembersVo> find(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		/*
		 * [Statement 에서 like연산자 사용] String sql =
		 * "select* from members where name like '%"+name+"%'";
		 */
		/*
		 * [PreparedStatement 에서like연산자 사용] String sql =
		 * "select* from members where name like '%'||?||'%'";
		 */
		try {
			con = DBConnection.getCon();
			ArrayList<MembersVo> list = new ArrayList<>();
			String sql = "select* from members where name like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				do {
					int num = rs.getInt("num");
					String name1 = rs.getString("name");
					String phone = rs.getString("phone");
					String addr = rs.getString("addr");
					Date regdate = rs.getDate("regdate");
					MembersVo vo = new MembersVo(num, name1, phone, addr, regdate);
					list.add(vo);
				} while (rs.next());
				return list;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

	public MembersVo find(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getCon();
			String sql = "select* from members where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date regdate = rs.getDate("regdate");
				MembersVo vo = new MembersVo(num, name, phone, addr, regdate);
				return vo;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

	public ArrayList<MembersVo> findAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getCon();
			String sql = "select * from members";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<MembersVo> list = new ArrayList<>();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date regdate = rs.getDate("regdate");
				MembersVo vo = new MembersVo(num, name, phone, addr, regdate);
				list.add(vo);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
	}

//	회원이름, 전화번호, 주소 수정하기
	public int update(MembersVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBConnection.getCon();
			String sql = "update members set name=?,phone=?,addr=? where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddr());
			pstmt.setInt(4, vo.getNum());
			int n = pstmt.executeUpdate();
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}

	// 파라미터로 삭제할 회원번호를 전달받아 회원을 삭제하는 delete메소드 만들기
	public int delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBConnection.getCon();
			String sql = "delete from members where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			int n = pstmt.executeUpdate();
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}

	public int insert(MembersVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBConnection.getCon();
			String sql = "insert into members values(?,?,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getAddr());
			int n = pstmt.executeUpdate();
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			DBConnection.close(con, pstmt, null);
		}
	}
}

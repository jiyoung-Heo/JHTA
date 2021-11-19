package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.db.DBConnection;
import test.vo.MembersVo;

public class MembersDAO {
	public int insert(MembersVo vo) {
		String sql = "insert into members values(?,?,?,?,sysdate)";
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getAddr());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
		return n;
	}

	public int delete(int num) {
		String sql = "delete from members where num = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
		return n;
	}

	public ArrayList<MembersVo> list() {
		String sql = "select num,name,phone,addr,regdate from members";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MembersVo> arrList = new ArrayList<>();
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date regdate = rs.getDate("regdate");
				MembersVo mv = new MembersVo(num, name, phone, addr, regdate);
				arrList.add(mv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return arrList;
	}

	public MembersVo select(int num) {
		String sql = "select num,name,phone,addr,regdate from members where num = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MembersVo mv = null;
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int num1 = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date regdate = rs.getDate("regdate");
				mv = new MembersVo(num1, name, phone, addr, regdate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, rs);
		}
		return mv;
	}

	public int update(MembersVo vo) {
		String sql = "update members set name = ? ,phone=?, addr=? where num = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = DBConnection.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddr());
			pstmt.setInt(4, vo.getNum());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(con, pstmt, null);
		}
		return n;
	}
}

package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.db.DBConnection;

public class listServlit extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		int n = 0;
		String sql = "select * from members";
		try (Connection con = DBConnection.getCon();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name= rs.getString("name");
				String phone=rs.getString("phone");
				String addr=rs.getString("addr");
				String regdate=rs.getString("regdate");
				pw.print("<p>"+"num:"+num+" name:"+name+" phone:"+phone+" addr:"+addr+" regdate: "+regdate+"<a href='delete.do?num="+num+"'>삭제</a>"+"</p>");
			}
			n =pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

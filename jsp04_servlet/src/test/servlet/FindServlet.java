package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.db.DBConnection;

public class FindServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		
		String sql = "select * from members where name like '%'||?||'%'";
		try (Connection con = DBConnection.getCon();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1,name);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					do {
						int num = rs.getInt("num");
						String name1= rs.getString("name");
						String phone=rs.getString("phone");
						String addr=rs.getString("addr");
						Date regdate=rs.getDate("regdate");
						pw.print("회원번호:"+num+"<br>");
						pw.print("이름:"+name1+"<br>");
						pw.print("전화번호:"+phone+"<br>");
						pw.print("주소:"+addr+"<br>");
						pw.print("가입일:"+regdate+"<br>");
						pw.print("-----------------------------------------<br>");
					}while(rs.next());
				}else {
					pw.print("없음");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

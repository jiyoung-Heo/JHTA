package jsp03_servlet;

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

@WebServlet("/delete.do")
public class DeleteServlit extends HttpServlet{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			String num = req.getParameter("num");
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();
			int n = 0;
			String sql = "delete from members where num =?";
			try (Connection con = DBConnection.getCon();
					PreparedStatement pstmt = con.prepareStatement(sql);){
				pstmt.setString(1, num);
				n =pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (n>0) {
				pw.print("<h1>삭제완료!</h1>");
				resp.sendRedirect("list.do");
			}else {
				pw.print("<h1>삭제실패!</h1>");
				
			}
		}
}

package jsp03_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.db.DBConnection;

@WebServlet("/insert.do")
public class InertServlit extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");

		int n = 0;
		String sql = "insert into members values(?,?,?,?,sysdate)";
		try (Connection con=DBConnection.getCon();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, phone);
			pstmt.setString(4, addr);
			n =pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw=resp.getWriter();
		pw.print("<html>");
		pw.print("<head></head>");
		pw.print("<body>");
		if(n>0) {
			pw.print("<h1>회원등록완료!</h1>");
			pw.print("<a href='list.do'>리스트</a>");
		}else {
			pw.print("<h1>회원등록실패!</h1>");
		}
		pw.print("</body>");
		pw.print("</html>");
	}
}

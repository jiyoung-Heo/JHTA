package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head></head>");
		pw.print("<body>");
		pw.print("<h1>전송된 회원정보</h1>");
		pw.print("<ul>");
		pw.print("<li>회원번호: "+num+"</li>");
		pw.print("<li>회원이름: "+name+"</li>");
		pw.print("<li>전화번호: "+phone+"</li>");
		pw.print("<li>주소: "+addr+"</li>");
		pw.print("</ul>");
		pw.print("</body>");
		pw.print("</html>");
	}
}

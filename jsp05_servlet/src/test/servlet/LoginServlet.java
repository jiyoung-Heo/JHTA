package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  service메소드 - get/post 요청시 호출됨
 *  doPost메소드 - post방식으로 요청시 호출됨
 *  doGet메소드 - get방식으로 요청시 호출됨
 */

public class LoginServlet extends HttpServlet{
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("utf-8");
//		String id = req.getParameter("id");
//		String pwd = req.getParameter("pwd");
//		resp.setContentType("text/html;charset=utf-8");
//		PrintWriter pw = resp.getWriter();
//		if(id.equals("hello")&&pwd.equals("1234")) {
//			pw.print("<h1>회원가입성공</h1>");
//		}else {
//			pw.print("<h1>회원로그인실패!</h1>");
//		}
//	}
	
	//post타입으로 받을경우에만 처리된다.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		if(id.equals("hello")&&pwd.equals("1234")) {
			pw.print("<h1>회원가입성공</h1>");
		}else {
			pw.print("<h1>회원로그인실패!</h1>");
		}
	}
	//get방식으로 요청시 호출된다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("login.jsp");
	}
	
}

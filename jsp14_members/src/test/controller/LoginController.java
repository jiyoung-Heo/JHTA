package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.dao.MyUsersDao;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		MyUsersDao dao = new MyUsersDao();
		if (dao.isMember(id, pwd)) {
			HttpSession session = req.getSession();// 세션객체 얻어오기
			session.setAttribute("id", id);
			resp.sendRedirect("main.jsp");
		} else {
			req.setAttribute("errMsg", "아이디 또는 비번이 일치하지 않아요");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
}

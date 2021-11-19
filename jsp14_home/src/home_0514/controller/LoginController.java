package home_0514.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import home_0514.dao.MyusersDao;

@WebServlet("/loginOk")
public class LoginController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		MyusersDao dao = new MyusersDao();
		if (dao.insertId(id, pwd)) {
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			resp.sendRedirect("main.jsp");
		} else {
			req.setAttribute("errMsg", "아이디 또는 비밀번호가 일치하지 않습니다.");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
}

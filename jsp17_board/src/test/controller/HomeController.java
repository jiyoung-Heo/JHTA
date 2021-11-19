package test.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String top = (String) req.getAttribute("top");
		String content = (String) req.getAttribute("content");
		if (top == null) {// 맨처음 실행할땐 다 null값임 그래서 top, content 실행됨
			top = "/header.jsp";
		}

		if (content == null) {
			content = "/home.jsp";
		}
		req.setAttribute("top", top);
		req.setAttribute("content", content);

		String cp = req.getContextPath();
		ServletContext application = getServletContext();
		// application은 jsp내장객체여서 자바에서 사용불가, servletcontext로 얻어오기(servletcontext는
		// application의 자료형)
		application.setAttribute("cp", cp);

		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}

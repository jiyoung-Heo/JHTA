package home_0514.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home_0514.dao.BoardDao;
import home_0514.vo.BoardVo;

@WebServlet("/write")
public class WriteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String writer = req.getParameter("writer");
		String email = req.getParameter("email");
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		BoardVo vo = new BoardVo(writer, email, title, content);
		BoardDao dao = new BoardDao();

		int n = dao.insertList(vo);
		if (n > 0) {
			resp.sendRedirect("list");
		} else {
			req.getRequestDispatcher("/write.jsp").forward(req, resp);
		}
	}
}

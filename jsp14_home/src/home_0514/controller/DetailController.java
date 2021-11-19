package home_0514.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home_0514.dao.BoardDao;
import home_0514.vo.BoardVo;

@WebServlet("/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num = req.getParameter("num");
		BoardDao dao = new BoardDao();
		BoardVo vo = new BoardVo();
		vo = dao.selectList(Integer.parseInt(num));
		req.setAttribute("vo", vo);
		if (vo != null) {
			req.getRequestDispatcher("/detail.jsp").forward(req, resp);
		} else {
			//오류
		}
	}
}

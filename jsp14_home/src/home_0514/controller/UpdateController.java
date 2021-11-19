package home_0514.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home_0514.dao.BoardDao;
import home_0514.vo.BoardVo;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(req.getParameter("num"));
		String writer = req.getParameter("writer");
		String email = req.getParameter("email");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardDao dao = new BoardDao();
		BoardVo vo = new BoardVo(num,writer,email,title,content,null);
		if(dao.update(vo)>0){
			resp.sendRedirect("list");
		}else{
			req.setAttribute("errMsg", "수정불가. 다시 입력해주세요");
			req.getRequestDispatcher("/list.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDao dao = new BoardDao();
		BoardVo vo = dao.selectList(num);
		if(vo!=null) {
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/update.jsp").forward(req, resp);
		}else {
			//오류
		}
	
	}
}

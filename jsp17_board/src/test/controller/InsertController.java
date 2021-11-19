package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;
import test.vo.MyBoardVo;

@WebServlet("/board/insert")
public class InsertController extends HttpServlet{
	@Override //index.jsp 불러오기
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("top", "/header.jsp");
		req.setAttribute("content", "/board/insert.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String writer=req.getParameter("writer");
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		MyBoardVo vo=new MyBoardVo(0,writer,title, content, null);
		//db저장
		BoardDao bd = BoardDao.getInstance();
		int n=bd.insert(vo);
		if(n>0) {
			req.setAttribute("code", "success");
		}else {
			req.setAttribute("code", "fail");
		}
		req.setAttribute("top", "/header.jsp");
		req.setAttribute("content", "/board/result.jsp");
		req.getRequestDispatcher("/index.jsp").forward(req,resp);
	}
}

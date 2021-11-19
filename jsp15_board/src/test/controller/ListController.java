package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDAO;
import test.vo.BoardVo;

@WebServlet("/list")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String spageNum = req.getParameter("pageNum");
		int pageNum = 1;
		if (spageNum != null) {
			pageNum = Integer.parseInt(spageNum);
		}
		int startRow = pageNum * 10 - 9;
		int endRow = pageNum * 10;
//		int endRow = pageNum * 10;
//		int startRow = endRow - 9;

		BoardDAO dao = new BoardDAO();
		// 해당페이지에 해당하는 글목록 얻어오기
		ArrayList<BoardVo> list = dao.boardList(startRow, endRow);
		// 전체페이지 갯수 구하기 Math.ceil -> 올림해주는 메소드
		int pageCount = (int) Math.ceil(dao.getCount() / 10.0);

		int startPageNum = ((pageNum - 1) / 10 * 10) + 1;
		int endPageNum = startPageNum + 9;
		if (endPageNum > pageCount) {
			endPageNum = pageCount;
		}
		req.setAttribute("list", list);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("startPageNum", startPageNum);
		req.setAttribute("endPageNum", endPageNum);
		req.setAttribute("pageNum", pageNum);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}

package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;
import test.vo.MyBoardVo;

@WebServlet("/board/list")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String field = req.getParameter("field");
		System.out.println(field);
		BoardDao bd = BoardDao.getInstance();
		ArrayList<MyBoardVo> list = new ArrayList<>();
		String spageNum = req.getParameter("pageNum");
		String keyword = null;
		int pageNum = 1;
		if (field == null) {
			if(spageNum!=null) {
				pageNum = Integer.parseInt(spageNum);
			}
			int startRow = 10 * pageNum - 9;
			int endRow = pageNum * 10;
			list = bd.list(startRow, endRow);
		} else {
			keyword = req.getParameter("keyword");
			req.setAttribute("field", field);
			req.setAttribute("keyword", keyword);
			int startRow = 10 * pageNum - 9;
			int endRow = pageNum * 10;
			list = bd.findList(field, keyword, startRow, endRow);
		}
		int pageCount = (int) Math.ceil(bd.getCount() / 10.0);
		int startPageNum = ((pageNum - 1) / 10 * 10) + 1;
		int endPageNum = startPageNum + 9;
		if (endPageNum > pageCount) {
			endPageNum = pageCount; // endPageNum값을 pageCount값으로 초기화
		}
		req.setAttribute("list", list);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("startPageNum", startPageNum);
		req.setAttribute("endPageNum", endPageNum);
		req.setAttribute("pageNum", pageNum);
		req.setAttribute("field", field);
		req.setAttribute("keyword", keyword);
		req.getRequestDispatcher("/board/list.jsp").forward(req, resp);
	}
}

package test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.CommentsDao;
import test.vo.CommentsVo;

@WebServlet("/list.do")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		/http://localhost:8081/ajax03_comments/list.do?mnum=1
		CommentsDao dao = CommentsDao.getInstance();
		int mnum = Integer.parseInt(req.getParameter("mnum"));
		ArrayList<CommentsVo> list = dao.list(mnum);
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.print("<result>");
		for (CommentsVo vo : list) {
			pw.print("<comm>");
			pw.print("<num>" + vo.getNum() + "</num>");
			pw.print("<mnum>" + vo.getMnum() + "</mnum>");
			pw.print("<id>" + vo.getId() + "</id>");
			pw.print("<comments>" + vo.getComments() + "</comments>");
			pw.print("</comm>");
		}
		// pw.print("<startPageNum>"+a+"</startPageNum>");
		// pw.print("<endPageNum>"+b+"</endPageNum>");
		pw.print("</result>");
	}
}

package test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.CommentsDao;
import test.vo.CommentsVo;
@WebServlet("/comments.do")
public class CommentsController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//http://localhost:8081/ajax03_comments/comments.do?mnum=1&id=aaa&comments=good
		req.setCharacterEncoding("utf-8");
		int mnum=Integer.parseInt(req.getParameter("mnum"));
		String id=req.getParameter("id");
		String comments=req.getParameter("comments");
		CommentsVo vo=new CommentsVo(0, mnum, id, comments);
		CommentsDao dao=CommentsDao.getInstance();
		int n=dao.insert(vo);
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter pw=resp.getWriter();
		pw.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.print("<result>");
		if(n>0) {
			pw.print("<code>success</code>");
		}else {
			pw.print("<code>fail</code>");
		}
		pw.print("</result>");			
	}
}











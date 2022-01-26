package test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import test.dao.CommentsDao;
import test.vo.CommentsVo;

@WebServlet("/comments.do")
public class CommentsController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// http://localhost:8081/ajax03_comments/comments.do?mnum=1&id=aaa&comments=good
		req.setCharacterEncoding("utf-8");
		JSONObject json = new JSONObject();
		int mnum = Integer.parseInt(req.getParameter("mnum"));
		String id = req.getParameter("id");
		String comments = req.getParameter("comments");
		CommentsVo vo = new CommentsVo(0, mnum, id, comments);
		CommentsDao dao = CommentsDao.getInstance();
		int n = dao.insert(vo);
		resp.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		if (n > 0) {
			json.put("result", "true");
		} else {
			json.put("result", "false");
		}
		pw.print(json);
	}
}

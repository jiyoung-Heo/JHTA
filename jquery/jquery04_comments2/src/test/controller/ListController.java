package test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import test.dao.CommentsDao;
import test.vo.CommentsVo;

@WebServlet("/list.do")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		/http://localhost:8081/ajax03_comments/list.do?mnum=1
		JSONArray jsonArr = new JSONArray();
		CommentsDao dao = CommentsDao.getInstance();
		int mnum = Integer.parseInt(req.getParameter("mnum"));
		ArrayList<CommentsVo> list = dao.list(mnum);
		resp.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		for (CommentsVo vo : list) {
			JSONObject json = new JSONObject();
			json.put("num", vo.getNum());
			json.put("mnum", vo.getMnum());
			json.put("id", vo.getId());
			json.put("comments", vo.getComments());
			jsonArr.put(json);
		}
		// pw.print("<startPageNum>"+a+"</startPageNum>");
		// pw.print("<endPageNum>"+b+"</endPageNum>");
		pw.print(jsonArr);
	}
}

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

@WebServlet("/delete.do")
public class DeleteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 삭제할 댓글 번호 얻어오기
		int num = Integer.parseInt(req.getParameter("num"));
		CommentsDao dao = CommentsDao.getInstance();
		int n = dao.delete(num);
		resp.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		JSONObject json = new JSONObject();
		if (n > 0) {
			json.put("result", "success");
		} else {
			json.put("result", "fail");
		}
		pw.print(json);
	}
}

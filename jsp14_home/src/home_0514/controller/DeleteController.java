package home_0514.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home_0514.dao.BoardDao;

@WebServlet("/delete")
public class DeleteController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDao dao = new BoardDao();
		if(dao.delete(num)>0){
			resp.sendRedirect("list");
		}else{
			//오류!
		}
	}
}

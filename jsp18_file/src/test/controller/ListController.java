package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FileinfoDao;
@WebServlet("/file/list")
public class ListController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FileinfoDao dao=FileinfoDao.getInstance();
		req.setAttribute("list",dao.list());
		req.getRequestDispatcher("/file1/list.jsp").forward(req, resp);
	}
}






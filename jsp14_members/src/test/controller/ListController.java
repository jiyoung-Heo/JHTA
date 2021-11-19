package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MembersDAO;
import test.vo.MembersVo;

@WebServlet("/list")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MembersDAO dao = new MembersDAO();
		ArrayList<MembersVo> list = new ArrayList<>();
		list = dao.list();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/list.jsp").forward(req, resp);
	}
}

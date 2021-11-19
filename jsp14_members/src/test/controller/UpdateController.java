package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MembersDAO;
import test.vo.MembersVo;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		MembersDAO dao = new MembersDAO();
		MembersVo vo = new MembersVo();
		vo = dao.select(num);
		req.setAttribute("vo", vo);
		if (vo != null) {
			req.getRequestDispatcher("/update.jsp").forward(req, resp);
		} else {
			req.setAttribute("result", "fail");
			req.getRequestDispatcher("/showResult.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(req.getParameter("num"));
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		MembersDAO dao = new MembersDAO();
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		int n = dao.update(vo);
		if (n > 0) {
			req.getRequestDispatcher("/list").forward(req, resp);
		} else {
			req.setAttribute("result", "fail");
			req.getRequestDispatcher("/showResult.jsp").forward(req, resp);
		}
	}
}

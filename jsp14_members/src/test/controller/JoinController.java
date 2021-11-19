package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.MembersDAO;
import test.vo.MembersVo;

@WebServlet("/join")
public class JoinController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("join.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라미터에 전송된 정보를 db에 저장하고 결과를 응답함
		// 파라미터로 전송된 정보 읽어오기
		req.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(req.getParameter("num"));
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		// 전송된 사용자 정보 db에 저장하기
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		MembersDAO dao = new MembersDAO();
		int n = dao.insert(vo);

		// 결과값을 가지고 뷰페이지로 이동하기
		if (n > 0) {
			req.setAttribute("result", "success");
		} else {
			req.setAttribute("result", "fail");
		}
		req.getRequestDispatcher("/showResult.jsp").forward(req, resp);

	}
}

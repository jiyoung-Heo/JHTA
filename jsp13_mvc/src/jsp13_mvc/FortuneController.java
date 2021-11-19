package jsp13_mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 컨트롤러
 * 1. 클라이언트의 요청에 따른 비즈니스로직을 처리하기 위한 모델객체 호출
 * 2. 모델객체가 보내온 결과값을 가지고 뷰페이지로 이동
 */
@WebServlet("/fortune.do")
public class FortuneController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result = "동쪽으로 가면 귀인을 만난다";
		// 스코프에 결과값 담기
		req.setAttribute("result", result);
		// 결과값을 가지고 뷰페이지로 이동하기(request스코프에 담았으므로 포워드 방식으로 페이지 이동해야함)
		RequestDispatcher rd = req.getRequestDispatcher("/showResult.jsp");
		rd.forward(req, resp);
	}
}

package jsp16_path;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/join")
public class JoinServlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("joinservlet...");
		// 포워드 방식으로 이동시에는 컨텍스트명은 쓰지 않는다.
		// ct로부터의 요청은 모두 컨텍스트path쓴다. 포워드는 내부이동이니까 안씀
		String url = "/1/joinOk.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
}

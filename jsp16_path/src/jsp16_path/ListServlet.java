package jsp16_path;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class ListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 포워드방식으로 list.jsp로 이동해보세요.(절대경로)
		String url = "/list.jsp";
		req.getRequestDispatcher(url).forward(req, resp);
	}
}

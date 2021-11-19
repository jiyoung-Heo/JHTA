package jsp03_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * [서블릿]
 * - 웹어플리케이션에서 실행되는 자바클래스
 * - 클라이언트의 요청을 받고 클라이언트에 응답할 수 있다.
 * - 만드는방법
 *  1) HttpServlet 클래스를 상속받는다.
 *  2) service메소드를 오버라이딩한후 요청과 응답에 관련된 기능을 구현한다.
 *  3) 서블릿을 호출할 매핑경로를 설정한다.
 */
@WebServlet("/join.do")//서블릿을 호출할 매핑경로
public class JoinServlet extends HttpServlet{
	/*
	 * req : 요청에 관련된 기능을 갖는다.
	 * resp : 응답에 관련된 기능을 갖는다.
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트가보내온 정보 읽어오기
		req.setCharacterEncoding("utf-8");
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		//클라이언트 웹브라우져에 응답하기
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head></head>");
		pw.print("<body>");
		pw.print("<h1>전송된 회원정보</h1>");
		pw.print("<ul>");
		pw.print("<li>회원번호: "+num+"</li>");
		pw.print("<li>회원이름: "+name+"</li>");
		pw.print("<li>전화번호: "+phone+"</li>");
		pw.print("<li>주소: "+addr+"</li>");
		pw.print("</ul>");
		pw.print("</body>");
		pw.print("</html>");
	}
}

package test.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{
	//서블릿이 생성될때 딱 한번 호출됨-서블릿이 실행되기 위한 초기화 작업구현
	@Override
	public void init() throws ServletException {
		System.out.println("init메소드 호출......");
		// servletconfig: 서블릿 초기화 파라미터 받아올 수 있는 클래스
		// servletContext: 서블릿 초기화 파라미터 받아올 수 있는 클래스
		ServletConfig config = getServletConfig();
		//web.xml의 members 서블릿에 설정된 파라미터값 받아오기
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		
		//web.xml에 설정된 context설정값 얻어오기
		ServletContext sc = getServletContext();
		String url = sc.getInitParameter("url");
		
		System.out.println("testservlet...");
		System.out.println("url: "+url);
		System.out.println("user: "+user);
		System.out.println("password: "+password);
	}
	//서블릿이 호출될 때 마다 호출됨
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service메소드 호출됨...");
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print("<h1>TestServlet실행!!!!</h1>");
	}
	//서블릿이 소멸될 때 딱 한번 호출됨- 서블릿이 사용한 자원반납 등의 마무리 작업 구현
	//서블릿이 소멸되는 시점- 일정시간(특정한요청이없으면 기본30분)동안 요청이 없거나 웹서버가 종료될때
	@Override
	public void destroy() {
		System.out.println("destroy메소드 호출");
	}
}

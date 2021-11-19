package test.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersServlet extends HttpServlet{
	String url;
	String user;
	String password;
	@Override
	public void init() throws ServletException {
		// servletconfig: 서블릿 초기화 파라미터 받아올 수 있는 클래스
		ServletConfig config = getServletConfig();
		//web.xml의 members 서블릿에 설정된 파라미터값 받아오기
		user = config.getInitParameter("user");
		password = config.getInitParameter("password");
		//web.xml에 설정된 context설정값 얻어오기
		ServletContext sc = getServletContext();
		url = sc.getInitParameter("url");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("db 접속정보...");
		System.out.println("url: "+url);
		System.out.println("user: "+user);
		System.out.println("password: "+password);
	}
	
}

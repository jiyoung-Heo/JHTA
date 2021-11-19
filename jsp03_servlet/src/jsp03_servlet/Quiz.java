package jsp03_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sum.do")
public class Quiz extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("<head></head>");
		pw.write("<body>");
		pw.write(num1+"+"+num2+"="+(Integer.parseInt(num1)+Integer.parseInt(num1)));
		pw.write("</body>");
		pw.write("</html>");
	}
}

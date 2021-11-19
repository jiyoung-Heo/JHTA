package jsp13_mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weather.do")
public class WeatherController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String day = req.getParameter("day");
		if (day.equals("1")) {
			req.setAttribute("weather", "오늘의 날씨: 더움");
		} else if (day.equals("2")) {
			req.setAttribute("weather", "내일의 날씨: 비옴");
		}
		req.getRequestDispatcher("/showWeather.jsp").forward(req, resp);
	}
}

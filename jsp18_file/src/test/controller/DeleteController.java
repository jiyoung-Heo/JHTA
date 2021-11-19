package test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import test.dao.FileinfoDao;
import test.vo.FileinfoVo;
@WebServlet("/file/delete")
public class DeleteController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int filenum=Integer.parseInt(req.getParameter("filenum"));
		String uploadPath=getServletContext().getRealPath("/upload");
		FileinfoDao dao=FileinfoDao.getInstance();
		FileinfoVo vo=dao.getinfo(filenum);
		String filename=vo.getSavefilename();
		try {
			// File f=new File("c:\\aa\\1.jpg");
			// 실제파일삭제
			File f=new File(uploadPath +"\\" + filename);
			boolean n=f.delete();
			// db에서 삭제하기
			int n1=dao.delete(filenum);
			if(n==false || n1<1) {
				throw new Exception("오류발생!");
			}
			resp.sendRedirect(req.getContextPath() +"/file/list");
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("code","오류로 인해 파일을 삭제하지 못하였습니다..");
			req.getRequestDispatcher("/file1/result.jsp").forward(req, resp);
		}
	}
}









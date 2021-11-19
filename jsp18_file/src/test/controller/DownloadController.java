package test.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FileinfoDao;
import test.vo.FileinfoVo;

@WebServlet("/file/download")
public class DownloadController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 다운로드할 파일경로 db에서 얻어오기
		int filenum = Integer.parseInt(req.getParameter("filenum"));
		FileinfoDao dao = FileinfoDao.getInstance();
		FileinfoVo vo = dao.getinfo(filenum);
		String orgfilename = vo.getOrgfilename();
		String savefilename = vo.getSavefilename();
		long filesize = vo.getFilesize();

		// 다운로드창으로 응답하기
		// 파일명이 한글인경우 깨지지않도록 인코딩하기
		String filename = URLEncoder.encode(orgfilename, "utf-8");
		// utf-8로 인코딩시 공백문자가 +로 바뀐다
		// 공백문자에 해당하는값:\\+ 공백문자에해당하는 유니코드값:%20
		// replaceAll뒤에 정규표현식으로 들어가야한다.
		filename = filename.replaceAll("\\+", "%20");
		// 다운로드창으로 응답하기
		resp.setContentType("application/octet-system");
		resp.setContentLengthLong(filesize);
		// 한글이 깨지지 않게 인코딩된 파일명을 다운로드 창에 보이기
		resp.setHeader("Content-Disposition", "attachement;filename=" + filename);

		// 파일 다운로드하기(클라이언트에 파일데이터 보내기)
		String dir = getServletContext().getRealPath("/upload");
		FileInputStream fis = new FileInputStream(dir + "\\" + savefilename);
		OutputStream os = resp.getOutputStream();
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] b = new byte[1024];
		int n = 0;
		while ((n = bis.read(b)) != -1) {
			bos.write(b, 0, n);
		}
		bos.close();
		bis.close();
	}
}

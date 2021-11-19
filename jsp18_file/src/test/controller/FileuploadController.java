package test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import test.dao.FileinfoDao;
import test.vo.FileinfoVo;

@WebServlet("/file/upload")
public class FileuploadController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//upload폴더의 실제 경로 구하기
		String saveDir=getServletContext().getRealPath("/upload");
		MultipartRequest mr=new MultipartRequest(req, // request객체
				saveDir,  //업로드할 디렉토리 경로
				1024*1024*5, // 최대 업로드 크기(바이트)
				"utf-8", //인코딩방식
				new DefaultFileRenamePolicy()//동일한 파일명이 존재할시 파일명뒤에 일련번호(1,2,3,..)을 붙여서 파일 생성
		);
		System.out.println("업로드 경로:" + saveDir);
		String writer=mr.getParameter("writer");
		String title=mr.getParameter("title");
		String content=mr.getParameter("content");
		String orgFileName=mr.getOriginalFileName("file1");//전송된 파일명
		String saveFileName=mr.getFilesystemName("file1");//서버에 저장된 파일명
		System.out.println("writer:" + writer);
		System.out.println("title:" + title);
		System.out.println("content:" + content);
		System.out.println("orgFileName:" + orgFileName);
		System.out.println("saveFileName:" + saveFileName);
		
		//db에 파일정보 저장하기
		FileinfoDao dao=FileinfoDao.getInstance();
		//File f=mr.getFile("file1"); //업로드된 파일에 대한 정보를 갖는 파일객체 
		File f=new File(saveDir +"\\" + saveFileName);
		long filesize=f.length();
		FileinfoVo vo=new FileinfoVo(0, writer, title, content, orgFileName, saveFileName, filesize);
		int n=dao.insert(vo);
		if(n>0) {
			req.setAttribute("code","success");
		}else {
			req.setAttribute("code","fail");
		}
		req.getRequestDispatcher("/file1/result.jsp").forward(req, resp);
	}
}












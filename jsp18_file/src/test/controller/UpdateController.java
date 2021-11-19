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

@WebServlet("/file/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int filenum=Integer.parseInt(req.getParameter("filenum"));
		FileinfoDao dao=FileinfoDao.getInstance();
		FileinfoVo vo=dao.getinfo(filenum);
		req.setAttribute("vo",vo);
		req.getRequestDispatcher("/file1/update.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 수정된 파일 업로드
		String saveDir=getServletContext().getRealPath("/upload");
		MultipartRequest mr=new MultipartRequest(req, 
				saveDir, 
				1024*1024*5, 
				"utf-8",
				new DefaultFileRenamePolicy()
		);
		FileinfoDao dao=FileinfoDao.getInstance();		
		int filenum=Integer.parseInt(mr.getParameter("filenum"));
		FileinfoVo vo=dao.getinfo(filenum);
		String writer=mr.getParameter("writer");
		String title=mr.getParameter("title");
		String content=mr.getParameter("content");
		String orgFileName=mr.getOriginalFileName("file1");//전송된 파일명	
		int n=0;
		if(orgFileName!=null) {//수정될 파일이 전송된 경우 
			// 기존파일 삭제
			String savefilename=vo.getSavefilename();
			File f=new File(saveDir +"\\" + savefilename);
			f.delete();
			// 전송된 파일 정보
			String saveFileName=mr.getFilesystemName("file1");//서버에 저장된 파일명
			File f1=mr.getFile("file1");
			long filesize = f1.length();
			// db에서 업데이터
			FileinfoVo vo1=new FileinfoVo(filenum, writer, title, content, orgFileName, saveFileName, filesize);
			n=dao.update(vo1);		
		}else { //수정할 파일이 전송이 안된경우 
			// db에서 업데이트
			FileinfoVo vo2=new FileinfoVo(filenum, writer, title, content, vo.getOrgfilename(),
						vo.getSavefilename(), vo.getFilesize());
			n=dao.update(vo2);	
		}
		if(n>0) {
			req.setAttribute("code","success");
		}else {
			req.setAttribute("code","fail");
		}
		req.getRequestDispatcher("/file1/result.jsp").forward(req, resp);
	
	}
}
























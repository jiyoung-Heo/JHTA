package day15.file;

import java.io.File;

public class Test01_File {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		if (f.exists()) {
			System.out.println("존재하는 디렉토리입니다..");
			if (f.delete()) {
				f.delete();
				System.out.println("폴더삭제성공");
			} else {
				System.out.println("폴더삭제실패");// 폴더안에파일이있으면 폴더삭제 실패한다.
			}
		} else {
			f.mkdirs();// 디렉토리만들기
			System.out.println("폴더가 생성되었습니다.");
		}
//		File f1 = new File("D:\\hta_JAVA\\자료\\eclipse-jee-2020-12-R-win32-x86_64.zip");
//		long filesize = f1.length();// 파일크기구하기
//		System.out.println(f1.getName() + "파일의 크기, " + filesize + "bytes");
	}
}

package day15.file;

import java.io.File;

public class Test06 {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		if (removeDir(f)) {
			System.out.println("폴더삭제성공");
		} else {
			System.out.println("폴더삭제실패");
		}
	}

	public static boolean removeDir(File f) {
		File[] list = f.listFiles();
		// 자신 폴더의 하위 파일 디렉토리 삭제
		for (File f1 : list) {
			if (f1.isFile()) {// 파일이면 삭제
				f1.delete();
			} else {// 폴더이면 제귀메소드호출해서 폴더안의 목록 삭제
				removeDir(f1);
			}
		}
		return f.delete();// 자신폴더 삭제
	}
}
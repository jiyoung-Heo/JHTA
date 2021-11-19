package day15.file;

import java.io.File;

public class Test02_File {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		String[] slist = f.list();
		for (String s : slist) {
			System.out.println(s);
		}
		System.out.println("====================");
		File[] f1 = f.listFiles();
		for (File a : f1) {
			if (a.isDirectory()) {
				// a.getAbsolutePath(): 절대경로값 얻어오기
				System.out.println("d: " + a.getName());
			} else {
				System.out.println("f: " + a.getAbsolutePath() + a.length() + "bytes");
			}
		}
	}
}

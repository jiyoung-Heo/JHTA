package day15.file;

import java.io.File;

//c:\\aa������ �����غ�����
public class Test04_Quiz {
	public static void main(String[] args) {
		File f = new File("D:\\hta_JAVA\\aa");
		File[] flist = f.listFiles();
		for (File ff : flist) {
			if (ff.isFile()) {
				ff.delete();
			}
		}
		f.delete();
	}
}

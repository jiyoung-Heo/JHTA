package day15.file;

import java.io.File;

// 폴더의 크기를 구해 보세요
public class Test07_Quiz {
	public static void main(String[] args) {
		File f = new File("C:\\대학");
//		System.out.println(size(f));
		System.out.println("디렉토리크기: " + size(f) + "size");
	}

	public static long size(File f) {
		File[] list = f.listFiles();
		long sum = 0;
		for (File roop : list) {
			if (roop.isFile()) {
				sum += roop.length();
			} else {
				sum += size(roop);
			}
		}
		return sum;
	}
}

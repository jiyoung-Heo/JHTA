package day16.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test04_Thread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileCopyThread fc = new FileCopyThread();
		DirSizeTread dst = new DirSizeTread();
		while (true) {
			System.out.println("1. 파일복사 2. 종료 3. 디렉토리 크기 구하기");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				FileCopyThread fct = new FileCopyThread();
				fct.start();
				break;
			case 2:
				System.out.println("종료");
				System.exit(0);
			case 3:
				DirSizeTread dst1 = new DirSizeTread();
				dst1.start();
				break;
			}
		}
	}
}

class FileCopyThread extends Thread {
	static int cnt = 1;

	@Override
	public void run() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\hta_JAVA\\자료\\jdk-11.0.10_windows-x64_bin.exe");
			String copyFileName = "jdk-11.0.10_windows-x64_bin.exe" + (cnt++);
			fos = new FileOutputStream("D:\\\\hta_JAVA\\\\자료\\\\" + copyFileName);
			byte[] b = new byte[10];
			int n1 = 0;
			while ((n1 = fis.read(b)) != -1) {
				fos.write(b, 0, n1);
			}
			fos.close();
			System.out.println(copyFileName + "복사본 생성완료");
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class DirSizeTread extends Thread {
	@Override
	public void run() {
		File f = new File("D:\\hta_JAVA\\자료\\");
		long size = dirSize(f);
		System.out.println("크기: " + size + "bytes");
	}

	public static long dirSize(File f) {
		long size = 0;
		File[] file = f.listFiles();
		for (File ff : file) {
			if (ff.isFile()) {
				size += ff.length();
			} else {
				size += dirSize(ff);
			}
		}
		return size;
	}
}
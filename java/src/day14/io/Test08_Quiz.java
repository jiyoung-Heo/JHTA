package day14.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * bufferedOutputStream, BufferedInputStream 클래스를 사용해서 파일복사하는 프로그램을 만들어보세요.
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("아리랑.txt"), 1024);
			bos = new BufferedOutputStream(new FileOutputStream("아리랑copy.txt"));
			byte[] one = new byte[1024];
			int n = 0;
			long fileSize = 0;
			while ((n = bis.read(one)) != -1) {
				bos.write(one, 0, n);
				fileSize += n;
			}
//			while (true) {
//				int n = bis.read();
//				if (n == -1) {
//					break;
//				}
//			bos.write(b,0,n);
//			}
//			bis.close();
			System.out.println(fileSize + "byte크기의 파일 복사완료!");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bis != null) {
					bis.close();
					bos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}

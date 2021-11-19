package day13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream: 파일에서 1바이트 단위로 데이터를 읽어오기 위한 스트림클래스
public class Test05_FileInputStream {
	public static void main(String[] args) {
		// public FileInputStream(String name) throws FileNotFoundException
		try {
			FileInputStream fis = new FileInputStream("D:\\hta_JAVA\\abc.txt");
			while (true) {
				int n = fis.read();
				if (n == -1)
					break;
				System.out.println((char) n);

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다..." + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

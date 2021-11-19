package day14.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
	public static void main(String[] args) {
		try {
//			InputStream is = System.in;// 키보드로부터 읽어오기 위한 스트림
			InputStream is = new FileInputStream("test.dat");// 키보드로부터 읽어오기 위한 스트림
			while (true) {
				int n = is.read();
				if (n == -1)
					break;
				System.out.print((char) n);
			}
			is.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

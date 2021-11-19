package day14.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
	public static void main(String[] args) {
		byte[] b = { 65, 66, 67, 68, 69, 70 };
//		OutputStream os = System.out;// 화면과 연결된 출력스트림
		try {
			OutputStream os = new FileOutputStream("test.dat");
			os.write(b);// b배열 출력하기
			os.flush();
			os.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

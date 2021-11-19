package day13.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02_Reader {
	public static void main(String[] args) {
		// public InputStrimReader (InputStream in)
		InputStream in = System.in;
		Reader r = new InputStreamReader(in);
		try {
//			System.out.println("글자하나 입력!");
//			//public int read() throws IOException
//			int ch = r.read();
//			System.out.println("입력된 문자: "+(char)ch);
			System.out.println("한문장입력하세요");
			char[] cbuf = new char[100];
			int n = r.read(cbuf);
			System.out.println("읽어온 바이트 크기: " + n);
			System.out.println(cbuf);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

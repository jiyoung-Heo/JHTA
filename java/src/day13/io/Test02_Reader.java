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
//			System.out.println("�����ϳ� �Է�!");
//			//public int read() throws IOException
//			int ch = r.read();
//			System.out.println("�Էµ� ����: "+(char)ch);
			System.out.println("�ѹ����Է��ϼ���");
			char[] cbuf = new char[100];
			int n = r.read(cbuf);
			System.out.println("�о�� ����Ʈ ũ��: " + n);
			System.out.println(cbuf);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

package day14.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {
	public static void main(String[] args) {
//		public BufferedReader(Reader in);
//		public InputStreamReader(InputStream in);
//		InputStream is = System.in;
//		InputStream ir = System.in;
//		Reader in = new InputStreamReader(ir);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�ѹ����� �Է��غ�����");
			String line = br.readLine();
			System.out.println("�Էµȹ���:" + line);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

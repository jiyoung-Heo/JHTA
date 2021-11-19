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
			System.out.println("한문장을 입력해보세요");
			String line = br.readLine();
			System.out.println("입력된문장:" + line);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

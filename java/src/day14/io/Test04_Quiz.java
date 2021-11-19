package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader를 사용해서 아리랑.txt파일을 읽어와 화면에 출력해보세요.
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("아리랑.txt"));
//			for (int i = 0; i < 3; i++) {
//				System.out.println(br.readLine());
//			}
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
//			while (true) {
//				String line = br.readLine();
//				if (line == null)
//					break;
//				System.out.println(line);
//			}
//			while (br.ready()) {
//				System.out.println(br.readLine());
//			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

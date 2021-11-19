package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader�� ����ؼ� �Ƹ���.txt������ �о�� ȭ�鿡 ����غ�����.
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("�Ƹ���.txt"));
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

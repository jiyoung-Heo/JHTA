package day13.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 다섯명 학생의 이름과 전화번호를 입력받아(Scanner)
 * phone.txt파일로 저장(FileWriter)해보세요
 * 
 * 예)
 * -- phone.txt
 * 홍길동, 010-213-1234
 * 김순이, 010-000-0000
 * ... 
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("phone.text");
			for (int i = 0; i < 5; i++) {
				System.out.println("이름을 입력하세요");
				fw.write(sc.next() + ", ");
				System.out.println("전화번호를 입력하세요");
				fw.write(sc.next() + "\n");
			}
//			for (int i = 0; i < 5; i++) {
//				System.out.println("이름입력:");
//				String name = sc.next();
//				System.out.println("전화번호입력:");
//				String num = sc.next();
//				fw.write(name + "," + num + "\n");
//			}
//			}
			fw.close();
			FileReader fr = new FileReader("phone.text");
//			BufferedReader br = new BufferedReader(fr);
			while (true) {
				int a = fr.read();
				if (a == -1)
					break;
				System.out.print((char) a);
			}
//			while (true) {
//				String result = br.readLine();
//				if (result == null) {
//					break;
//				}
//				System.out.println(result);
//				br.readLine();
//			}
			char[] cbuf = new char[100];
			while (true) {
				// int read(char[] cbuf) throws IOException
				// int n = fr.read(cbuf);
				int n = fr.read(cbuf);
				if (n == -1)
					break;
				// java.lang.String.String(char[],cbuf, int offset,intcount)
				String s = new String(cbuf, 0, n);// cbuf에 저장된 만큼만 가져오도록 하는 코드
//				System.out.println(cbuf);
				System.out.println(s);
			}
			// int read(char[] cbuf) throws IOException
//			fr.read(cbuf);
//			System.out.println(cbuf);
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}

package day13.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �ټ��� �л��� �̸��� ��ȭ��ȣ�� �Է¹޾�(Scanner)
 * phone.txt���Ϸ� ����(FileWriter)�غ�����
 * 
 * ��)
 * -- phone.txt
 * ȫ�浿, 010-213-1234
 * �����, 010-000-0000
 * ... 
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("phone.text");
			for (int i = 0; i < 5; i++) {
				System.out.println("�̸��� �Է��ϼ���");
				fw.write(sc.next() + ", ");
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				fw.write(sc.next() + "\n");
			}
//			for (int i = 0; i < 5; i++) {
//				System.out.println("�̸��Է�:");
//				String name = sc.next();
//				System.out.println("��ȭ��ȣ�Է�:");
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
				String s = new String(cbuf, 0, n);// cbuf�� ����� ��ŭ�� ���������� �ϴ� �ڵ�
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

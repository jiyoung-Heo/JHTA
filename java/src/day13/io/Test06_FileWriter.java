package day13.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test06_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.text");
			fw.write("�ȳ��ϼ���.\n");
			fw.write("�ݰ����ϴ�.\n");
			fw.close();
			System.out.println("���Ϸ� ����Ϸ�!");
			FileReader fr = new FileReader("hello.text");
			while (true) {
				int a = fr.read();
				if (a == -1) {
					break;
				}
				System.out.println((char) a);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

package day13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream: ���Ͽ��� 1����Ʈ ������ �����͸� �о���� ���� ��Ʈ��Ŭ����
public class Test05_FileInputStream {
	public static void main(String[] args) {
		// public FileInputStream(String name) throws FileNotFoundException
		try {
			FileInputStream fis = new FileInputStream("D:\\hta_JAVA\\abc.txt");
			while (true) {
				int n = fis.read();
				if (n == -1)
					break;
				System.out.println((char) n);

			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã���� �����ϴ�..." + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

package day13.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream: ���Ͽ��� 1����Ʈ������ �����͸� ����ϴ� ��Ʈ��

public class Test04_FileOutputStream {
	public static void main(String[] args) {
		try {
			// public FileOutputStream(String name) throws FileNotFoundException
			FileOutputStream fos = new FileOutputStream("D:\\hta_JAVA\\abc.txt");
			int b = 65;
			// public void write(int b) throws IOException
			fos.write(b);
			fos.write(++b);
			fos.write(++b);
//			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

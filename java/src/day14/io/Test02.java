package day14.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
	public static void main(String[] args) {
		try {
//			InputStream is = System.in;// Ű����κ��� �о���� ���� ��Ʈ��
			InputStream is = new FileInputStream("test.dat");// Ű����κ��� �о���� ���� ��Ʈ��
			while (true) {
				int n = is.read();
				if (n == -1)
					break;
				System.out.print((char) n);
			}
			is.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

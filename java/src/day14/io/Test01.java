package day14.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
	public static void main(String[] args) {
		byte[] b = { 65, 66, 67, 68, 69, 70 };
//		OutputStream os = System.out;// ȭ��� ����� ��½�Ʈ��
		try {
			OutputStream os = new FileOutputStream("test.dat");
			os.write(b);// b�迭 ����ϱ�
			os.flush();
			os.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

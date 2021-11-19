package day14.io;

import java.io.BufferedOutputStream;
import java.io.IOException;

//BufferedOutputStream: ������ ����� �����ϴ� ����� ���� Ŭ����
public class Test07_BufferedOutputStream {
	public static void main(String[] args) {
		try {
//			BufferedOutputStream(OutputStream out, int size)
			// ������ ũ�⸦ 100����Ʈ�� ���� ��½�Ʈ����ü ����
			BufferedOutputStream bos = new BufferedOutputStream(System.out, 1024);// ���۰� �� ���� ��µ�. 5 �Ⱦ��� �ƹ��͵��ȳ���
			byte[] b = { 65, 66, 67, 68, 69, 70 };
			bos.write(b);
			bos.close();// ���ۿ� �ִ°� �� �������

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

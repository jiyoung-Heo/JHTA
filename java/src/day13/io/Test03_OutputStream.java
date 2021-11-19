package day13.io;

import java.io.IOException;
import java.io.OutputStream;

/*
 * [OutputStream]
 * - 1����Ʈó�� ��½�Ʈ��(��½�Ʈ���� �ֻ��� Ŭ����)
 * - �߻�Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
 * - ȭ�鿡 ����ϱ� ���� ��Ʈ����ü ������
 *    OutputStream os=System.out;
 */
public class Test03_OutputStream {
	public static void main(String[] args) {
		OutputStream os = System.out;
//		public void write(byte[] b) throws IOException
		try {
			int b = 65;
			os.write(b);
			os.flush();// ���۰� �� ���� �ʾƵ� �����͸� ��������.(����ϱ�)
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

package day13.io;

import java.io.IOException;
import java.io.InputStream;

/*
 * [�ڹ��� IO]
 * - �����͸� �о���ų� ��¿� ���õ� �۾�
 * - �ڹٿ��� �����͸� ����� �Ҷ��� ��Ʈ���� ����Ѵ�.(��Ʈ���� �������� �帧)
 * - 1����Ʈó����Ʈ���� 2����Ʈó����Ʈ���� �ִ�.
 * <InputStream Ŭ����>
 * - �Է½�Ʈ���� �ֻ��� �߻�Ŭ����
 * - 1����Ʈó����Ʈ��
 */
public class Test01 {
	public static void main(String[] args) {
		// public static final InputStrim in
		InputStream is = System.in;
		try {
			// public abstract int read() throws IOException: Ű����� 1����Ʈ ������ �о����
			System.out.println("�� �ѱ��ڸ� �Է��ϼ���");
			int a = is.read();
			System.out.println("�Էµ� ����: " + (char) a);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

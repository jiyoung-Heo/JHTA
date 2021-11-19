package day14.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// DataInputStream: �⺻�ڷ��� �����͸� �о���� ���� ��Ʈ��
public class Test10_DataInputStream {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("abc.data"));
			// ����� �ڷ��� �״�� �о����
			int a = dis.readInt();
			double b = dis.readDouble();
			boolean c = dis.readBoolean();
			String d = dis.readUTF();
			System.out.println("<�����о���� ����!!!>");
			dis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

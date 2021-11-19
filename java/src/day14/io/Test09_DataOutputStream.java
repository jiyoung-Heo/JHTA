package day14.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// DataOutputStream: �⺻�ڷ����� ����ϴ� ����� ��Ʈ��
public class Test09_DataOutputStream {
	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("abc.data"));
			int a = 100;
			double b = 3.6;
			boolean c = true;
			String d = "hello";
			dos.writeInt(a);
			dos.writeDouble(b);
			dos.writeBoolean(c);
			dos.writeUTF(d);
			dos.close();
			System.out.println("���Ϸ� ����Ϸ�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

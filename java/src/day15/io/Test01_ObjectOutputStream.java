package day15.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

// ObjectOutputStream : ��ü�� �о���� ���� ��Ʈ��
public class Test01_ObjectOutputStream {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
			oos.writeObject(new String("hello"));
			oos.writeObject(new Integer("100"));
			oos.writeObject(new Date());
			oos.close();
			System.out.println("���Ϸ� ���� �Ϸ�");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

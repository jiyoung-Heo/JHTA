package day15.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//Test02_ObjectInputStream : 객체를 읽어오기 위한 스트림
public class Test02_ObjectInputStream {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("test.ser"));
			Object a = ois.readObject();
			Object b = ois.readObject();
			Object c = ois.readObject();
			System.out.println(a);
			String d = (String) a;
			String result = d.toUpperCase();
			System.out.println(b);
			System.out.println(c);
			System.out.println(result);
			ois.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

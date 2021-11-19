package day15.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import day15.test.Person;

public class Test03 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", "1234", 10);
		try {
			ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("person.ser"));
			oss.writeObject(p);
			oss.close();
			System.out.println("파일로 저장완료!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

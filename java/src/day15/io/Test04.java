package day15.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day15.test.Person;

/*
 * person.ser에 저장된 person객체에 저장된 정보를 읽어와 화면에 이름, 주민번호, 나이 출력
 */
public class Test04 {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
			Person p = (Person) ois.readObject();
			System.out.println(p.getName() + " " + p.getSnum() + " " + p.getAge());
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

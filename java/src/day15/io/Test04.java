package day15.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day15.test.Person;

/*
 * person.ser�� ����� person��ü�� ����� ������ �о�� ȭ�鿡 �̸�, �ֹι�ȣ, ���� ���
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

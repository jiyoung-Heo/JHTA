package day15.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day15.test.Student;

/*
 * test05�� ����
 * ���Ͽ� ����� �л������� �о�ͼ� ���� ���ؼ� ����غ�����
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = null;
			ois = new ObjectInputStream(new FileInputStream("student.ser"));
			while (true) {
				try {
					Student std = (Student) ois.readObject();
					int sum = std.getKor() + std.getEng();
					System.out.println(
							"�л���ȣ: " + std.getNum() + "����: " + std.getKor() + "����: " + std.getEng() + "�հ�: " + sum);
				} catch (EOFException e) {
					break;
				}
			}
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
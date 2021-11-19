package day15.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day15.test.Student;

/*
 * test05를 통해
 * 파일에 저장된 학생정보를 읽어와서 총점 구해서 출력해보세요
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
							"학생번호: " + std.getNum() + "국어: " + std.getKor() + "엉어: " + std.getEng() + "합계: " + sum);
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
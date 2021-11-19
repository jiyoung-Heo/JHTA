package day15.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 학생번호, 국어점수, 영어점수를 저장하는 STudent클래스를 만들어 3명의 정보를 student.ser파일로 저장해보세요
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Student st = new Student(1, 90, 80);
		Student st2 = new Student(2, 78, 81);
		Student st3 = new Student(3, 50, 30);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
			oos.writeObject(st);
			oos.writeObject(st2);
			oos.writeObject(st3);
//			oos.writeObject(new Student(1, 90, 80));
//			oos.writeObject(new Student(1, 78, 81));
//			oos.writeObject(new Student(1, 50, 30));
			oos.close();
			System.out.println("파일로 저장 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
package day11.collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 학생번호, 이름, 전화번호에 대한 정보를 갖는 Student 클래스를 만들고 ArrayList에 저장하고 전체 데이터를 모두 출력해 보세요.
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Test05_Quiz_Student st = new Test05_Quiz_Student(1, "허지영", "010-5219-9755");
		Test05_Quiz_Student st1 = new Test05_Quiz_Student(2, "허지영2", "011-5219-9755");
		Test05_Quiz_Student st2 = new Test05_Quiz_Student(3, "허지영3", "012-5219-9755");
		ArrayList<Test05_Quiz_Student> list = new ArrayList<Test05_Quiz_Student>();
		list.add(st);
		list.add(st1);
		list.add(st2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("학생번호: " + list.get(i).getNum() + "\t학생이름: " + list.get(i).getName() + "\t전화번호: "
					+ list.get(i).getCall());
		}
		/*
		 * 학생 번호를 입력받아 해당 학생의 이름과 전화번호를 출력해보세요 예) 학생번호입력:2 이름: 이길동 전화번호:010-222-2222
		 * 해당하는 학생번호가 없으면 해당번호는 존재하지 않습니다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("학생번호를 입력하세요: ");
		int result = sc.nextInt();
		boolean cnt = false;
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student s = list.get(i);
			if (s.getNum() == result) {
				System.out.println("이름: " + s.getName() + "\n전화번호: " + s.getCall());
				cnt = true;
			}
		}
		if (!cnt) {
			System.out.println("해당번호는 존재하지 않습니다.");
		}
		// 삭제할 학생번호를 입력받아 ArrayList에서 삭제해보세요
		System.out.print("삭제할 학생번호를 입력하세요: ");
		int remove = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student tqs = list.get(i);
			if (tqs.getNum() == remove) {
				list.remove(tqs);
				cnt = true;
				System.out.println(remove + "번 학생 삭제완료!");
			}
		}
		if (!cnt) {
			System.out.println("해당번호는 존재하지 않습니다.");
		}
		System.out.println("<최종 학생 목록>");
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student tqs = list.get(i);
			System.out.println(+tqs.getNum() + " " + tqs.getName() + " " + tqs.getCall());
		}
	}
}
package day12.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * HashMap에 3명학생정보를 저장하고 (key값은 학생번호, value는 student객체)
 * 1. 학생번호를 입력받아 해당 학생정보를 조회해보세요
 * 2. 학생번호를 입력받아 해당 학생정보를 삭제해보세요
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student(1, "가");
		Student st2 = new Student(2, "나");
		Student st3 = new Student(3, "다");
		HashMap<Integer, Student> hs = new HashMap<Integer, Student>();
		hs.put(st.isNum(), st);
		hs.put(st2.isNum(), st2);
		hs.put(st3.isNum(), st3);
		System.out.println("조회할 학생번호를 입력하세요");
		int input = sc.nextInt();
		Student find = hs.get(input);
		if (find != null) {
			System.out.println(find);
		} else {
			System.out.println("해당번호가 존재하지 않습니다.");
		}
		System.out.println("삭제할 학생번호를 입력하세요");
		int delete = sc.nextInt();
		Student del = hs.get(delete);
		if (del != null) {
			hs.remove(delete);
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당번호가 존재하지 않습니다.");
		}
		// 전체정보 출력하기
//		Collection<Student> co = hs.values();
//		System.out.println(co);

		Collection<Student> co = hs.values();
		Iterator<Student> it = co.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student {
	private int num;
	private String name;

	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int isNum() {
		return num;
	}

	public String isName() {
		return name;
	}

	@Override
	public String toString() {
		return "학생번호:" + num + " 학생이름: " + name;
	}
}
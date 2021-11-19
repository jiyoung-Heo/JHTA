package day12.collection;

import java.util.ArrayList;

/*
 * [ 향상된 for문 ]
 * -형식
 *  for (자료형 변수명: 배열 또는 컬렉션){
 *  	반복문장;
 *  	..
 *  }
 */
public class Test08_for {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		for (int n : a) {// a배열의 요소를 순차적으로 꺼내와서 n에 저장
			System.out.print(n + " ");
		}
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		list.add("개나리");
		list.add("진달래");
		list.add("무궁화");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		// Student객체 3개를 ArrayList에 저장하고 향상된 for문을 이용해서 출력해보세요
		Student st = new Student(1, "가");
		Student st2 = new Student(2, "나");
		Student st3 = new Student(3, "다");
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(st);
		list2.add(st2);
		list2.add(st3);
		for (Student result3 : list2) {
			System.out.println(result3);
		}
	}

}

package day17.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

import day17.test.Student;

public class Test05_sort {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("개나리");
		list1.add("진달래");
		list1.add("무궁화");
		Collections.sort(list1);// list1정렬하기
		System.out.println("정렬 후 데이터 출력");
		list1.forEach(s -> System.out.println(s));

		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student(1, "일길동", 100));
		list2.add(new Student(2, "이길동", 80));
		list2.add(new Student(3, "삼길동", 90));
		Collections.sort(list2);
		list2.forEach(s -> System.out.println(s));

		System.out.println("<점수순으로 정렬>");
		Stream<Student> a = Stream.of(new Student(1, "일길동", 100), new Student(2, "이길동", 80), new Student(3, "삼길동", 90));
//		a.sorted().forEach(s -> System.out.println(s));
		// 2개만 뽑아온다. limit에 1넣으면 1개만 뽑아온다.
		a.sorted().limit(2).forEach(s -> System.out.println(s));

//		System.out.println("번호순으로 정렬");
		Stream<Student> a2 = Stream.of(new Student(1, "일길동", 100), new Student(2, "이길동", 80),
				new Student(3, "삼길동", 90));
//		a2.sorted(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Integer.compare(o1.getNum(), o2.getNum());
//			}
//		}).forEach(s -> System.out.println(s));

		System.out.println("<<이름으로 내림차순정렬>>");
		a2.sorted((o1, o2) -> {
			return o1.getName().compareTo(o2.getName()) * -1;// 문자열로 비교하기(내림차순)
		}).forEach(s -> System.out.println(s));
	}

}

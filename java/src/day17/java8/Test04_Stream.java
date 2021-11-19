package day17.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

import day17.test.Person;
import day17.test.Student;

/*
 * Stream
 * - jdk 1.8버전부터 제공되는 기능
 * - Collection객체들의 for문이나 iterator를 사용하는 것을 추상화했다->통일된 방식으로 처리 가능
 * - 자주 사용되는 데이터처리기능들을 정의해 놓음
 */
public class Test04_Stream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("길동이");
		list.add("순이");
		list.add("영희");
		Stream<String> s1 = list.stream();// 스트림 얻어오기
		s1.forEach((t) -> System.out.println(t));
		System.out.println();
		System.out.println("<정렬해서 출력하기>");
		Stream<String> s2 = list.stream();
		s2.sorted().forEach(t -> System.out.println(t));

		// arraylist
		System.out.println();
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student(1, "길동", 80));
		list1.add(new Student(2, "영희", 100));
		list1.add(new Student(3, "순이", 70));
		list1.add(new Student(4, "순자", 20));
		Stream<Student> s3 = list1.stream();
		s3.forEach(s -> System.out.println(s));

		// stream으로 중간연산하기
		Stream<Student> s4 = list1.stream();
//		s4.filter(new Predicate<Student>() {
//			public boolean test(Student t) {
//				if (t.getNum() % 2 == 0) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		}).forEach(s -> System.out.println(s));
		// 람다로바꾸기
		System.out.println("람다로 바꿔서 출력하기");
		s4.filter((ta) -> ta.getNum() % 2 == 0).forEach(s -> System.out.println(s));

		System.out.println("\narraylist요소에 저장된 student객체 요소값 중에 이름만 추출해오기");
		Stream<Student> s6 = list1.stream();
//		s6.map(new Function<Student, String>() {// t는 파라미터타입, r은 리턴타입
//			public String apply(Student t) {
//				return t.getName();
//			}
//		}).forEach(a -> {
//			System.out.println(a);
//		});
		s6.map(a -> a.getName()).forEach(s -> System.out.println(s));

		// Person객체를 arrayList에 담고 stream을 사용해서 나이가 30세 이상인사람들만 출력되도록
		System.out.println("\nPerson객체를 arrayList에 담고 stream을 사용해서 나이가 30세 이상인사람들만 출력하기");
		ArrayList<Person> listPer = new ArrayList();
		listPer.add(new Person("가", "10"));
		listPer.add(new Person("나", "30"));
		listPer.add(new Person("다", "40"));
		Stream<Person> stPer = listPer.stream();
//		stPer.filter(new Predicate<Person>() {
//			public boolean test(Person p) {
//				if (Integer.parseInt(p.getAge()) >= 30) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		}).forEach(s -> System.out.println(s));
		stPer.filter((t) -> {
			int a = Integer.parseInt(t.getAge());
			return a >= 30;
		}).forEach(p -> System.out.println(p));
	}
}

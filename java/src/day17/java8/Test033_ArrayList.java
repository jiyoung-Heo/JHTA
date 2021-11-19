package day17.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import day17.test.Person;

public class Test033_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("개나리");
		list1.add("민들레");
		list1.add("무궁화");
//		list1.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		list1.forEach((t) -> System.out.println(t));

		// arrayList에 Person객체 2명을 담고 forEach메소드를 사용해서 출력해보세요
		Person a = new Person("홍길동", "20");
		Person a1 = new Person("홍길이", "24");
		ArrayList<Person> list = new ArrayList<>();
		list.add(a);
		list.add(a1);
		list.forEach((t) -> System.out.println("이름: " + t.getName() + "나이: " + t.getAge()));
		list.forEach(new Consumer<Person>() {
			public void accept(Person a) {
				System.out.println("이름: " + a.getName());
				System.out.println("나이: " + a.getAge());

			}
		});
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "나염");
		map.put(2, "가이");
		map.put(3, "다이");
		map.forEach(new BiConsumer<Integer, String>() {
			public void accept(Integer t, String u) {
				System.out.println(t + u);
			}
		});

		map.forEach((Integer aa, String b) -> System.out.println(aa + b));
		// hashset에 3명의 아이디를 저장후 forEach메소드를 사용해서 출력해보세요
		HashSet<String> set = new HashSet<>();
		set.add("admin");
		set.add("uset");
		set.add("user");
		set.forEach((p) -> System.out.println(p));
		System.out.println();
		set.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println();
		set.forEach(t -> System.out.println(t));
	}
}

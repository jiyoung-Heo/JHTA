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
		list1.add("������");
		list1.add("�ε鷹");
		list1.add("����ȭ");
//		list1.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		list1.forEach((t) -> System.out.println(t));

		// arrayList�� Person��ü 2���� ��� forEach�޼ҵ带 ����ؼ� ����غ�����
		Person a = new Person("ȫ�浿", "20");
		Person a1 = new Person("ȫ����", "24");
		ArrayList<Person> list = new ArrayList<>();
		list.add(a);
		list.add(a1);
		list.forEach((t) -> System.out.println("�̸�: " + t.getName() + "����: " + t.getAge()));
		list.forEach(new Consumer<Person>() {
			public void accept(Person a) {
				System.out.println("�̸�: " + a.getName());
				System.out.println("����: " + a.getAge());

			}
		});
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		map.forEach(new BiConsumer<Integer, String>() {
			public void accept(Integer t, String u) {
				System.out.println(t + u);
			}
		});

		map.forEach((Integer aa, String b) -> System.out.println(aa + b));
		// hashset�� 3���� ���̵� ������ forEach�޼ҵ带 ����ؼ� ����غ�����
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

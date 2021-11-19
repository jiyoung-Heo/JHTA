package day17.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

import day17.test.Student;

public class Test05_sort {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("������");
		list1.add("���޷�");
		list1.add("����ȭ");
		Collections.sort(list1);// list1�����ϱ�
		System.out.println("���� �� ������ ���");
		list1.forEach(s -> System.out.println(s));

		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student(1, "�ϱ浿", 100));
		list2.add(new Student(2, "�̱浿", 80));
		list2.add(new Student(3, "��浿", 90));
		Collections.sort(list2);
		list2.forEach(s -> System.out.println(s));

		System.out.println("<���������� ����>");
		Stream<Student> a = Stream.of(new Student(1, "�ϱ浿", 100), new Student(2, "�̱浿", 80), new Student(3, "��浿", 90));
//		a.sorted().forEach(s -> System.out.println(s));
		// 2���� �̾ƿ´�. limit�� 1������ 1���� �̾ƿ´�.
		a.sorted().limit(2).forEach(s -> System.out.println(s));

//		System.out.println("��ȣ������ ����");
		Stream<Student> a2 = Stream.of(new Student(1, "�ϱ浿", 100), new Student(2, "�̱浿", 80),
				new Student(3, "��浿", 90));
//		a2.sorted(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Integer.compare(o1.getNum(), o2.getNum());
//			}
//		}).forEach(s -> System.out.println(s));

		System.out.println("<<�̸����� ������������>>");
		a2.sorted((o1, o2) -> {
			return o1.getName().compareTo(o2.getName()) * -1;// ���ڿ��� ���ϱ�(��������)
		}).forEach(s -> System.out.println(s));
	}

}

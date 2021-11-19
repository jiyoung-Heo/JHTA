package day17.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

import day17.test.Person;
import day17.test.Student;

/*
 * Stream
 * - jdk 1.8�������� �����Ǵ� ���
 * - Collection��ü���� for���̳� iterator�� ����ϴ� ���� �߻�ȭ�ߴ�->���ϵ� ������� ó�� ����
 * - ���� ���Ǵ� ������ó����ɵ��� ������ ����
 */
public class Test04_Stream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�浿��");
		list.add("����");
		list.add("����");
		Stream<String> s1 = list.stream();// ��Ʈ�� ������
		s1.forEach((t) -> System.out.println(t));
		System.out.println();
		System.out.println("<�����ؼ� ����ϱ�>");
		Stream<String> s2 = list.stream();
		s2.sorted().forEach(t -> System.out.println(t));

		// arraylist
		System.out.println();
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student(1, "�浿", 80));
		list1.add(new Student(2, "����", 100));
		list1.add(new Student(3, "����", 70));
		list1.add(new Student(4, "����", 20));
		Stream<Student> s3 = list1.stream();
		s3.forEach(s -> System.out.println(s));

		// stream���� �߰������ϱ�
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
		// ���ٷιٲٱ�
		System.out.println("���ٷ� �ٲ㼭 ����ϱ�");
		s4.filter((ta) -> ta.getNum() % 2 == 0).forEach(s -> System.out.println(s));

		System.out.println("\narraylist��ҿ� ����� student��ü ��Ұ� �߿� �̸��� �����ؿ���");
		Stream<Student> s6 = list1.stream();
//		s6.map(new Function<Student, String>() {// t�� �Ķ����Ÿ��, r�� ����Ÿ��
//			public String apply(Student t) {
//				return t.getName();
//			}
//		}).forEach(a -> {
//			System.out.println(a);
//		});
		s6.map(a -> a.getName()).forEach(s -> System.out.println(s));

		// Person��ü�� arrayList�� ��� stream�� ����ؼ� ���̰� 30�� �̻��λ���鸸 ��µǵ���
		System.out.println("\nPerson��ü�� arrayList�� ��� stream�� ����ؼ� ���̰� 30�� �̻��λ���鸸 ����ϱ�");
		ArrayList<Person> listPer = new ArrayList();
		listPer.add(new Person("��", "10"));
		listPer.add(new Person("��", "30"));
		listPer.add(new Person("��", "40"));
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

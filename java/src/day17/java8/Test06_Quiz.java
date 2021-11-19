package day17.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ȸ�����̵�, �̸�, �̸��������� ���� Ŭ������ ���弼��(comparable�������̽� �������̵�, ���̵� �������� �������� �����ϱ�)
 * 
 * ArrayList�� ȸ�������� ��� stream�� ����ؼ� ����غ�����.
 * 
 * ArrayList�� ȸ�������� ��� Stream�� ����ؼ� �̸��� �������� �������� �����ؼ� ����ϼ���.
 */
public class Test06_Quiz {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		list.add(new Member("admin", "ȫ�浿", "a.naver.com"));
		list.add(new Member("zest", "��ȳ�", "b.naver.com"));
		list.add(new Member("togo", "������", "c.naver.com"));

		Stream<Member> st = list.stream();
		System.out.println("<<ArrayList�� ȸ�������� ��� stream�� ����ؼ� ���(���̵���� ��������)>>");
		st.sorted().forEach(s -> System.out.println(s));

		Stream<Member> st1 = list.stream();
		System.out.println("<<�̸��� �������� �������� ����>>");
		st1.sorted((Member o1, Member o2) -> o1.getName().compareTo(o2.getName())).forEach(s -> System.out.println(s));
	}
}

class Member implements Comparable<Member> {
	private String id;
	private String name;
	private String email;

	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "���̵�: " + id + ", �̸�: " + name + ", �̸���: " + email;
	}

	@Override
	public int compareTo(Member o) {
		return id.compareTo(o.getId());
	}
}
package day12.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * HashMap�� 3���л������� �����ϰ� (key���� �л���ȣ, value�� student��ü)
 * 1. �л���ȣ�� �Է¹޾� �ش� �л������� ��ȸ�غ�����
 * 2. �л���ȣ�� �Է¹޾� �ش� �л������� �����غ�����
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student(1, "��");
		Student st2 = new Student(2, "��");
		Student st3 = new Student(3, "��");
		HashMap<Integer, Student> hs = new HashMap<Integer, Student>();
		hs.put(st.isNum(), st);
		hs.put(st2.isNum(), st2);
		hs.put(st3.isNum(), st3);
		System.out.println("��ȸ�� �л���ȣ�� �Է��ϼ���");
		int input = sc.nextInt();
		Student find = hs.get(input);
		if (find != null) {
			System.out.println(find);
		} else {
			System.out.println("�ش��ȣ�� �������� �ʽ��ϴ�.");
		}
		System.out.println("������ �л���ȣ�� �Է��ϼ���");
		int delete = sc.nextInt();
		Student del = hs.get(delete);
		if (del != null) {
			hs.remove(delete);
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.out.println("�ش��ȣ�� �������� �ʽ��ϴ�.");
		}
		// ��ü���� ����ϱ�
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
		return "�л���ȣ:" + num + " �л��̸�: " + name;
	}
}
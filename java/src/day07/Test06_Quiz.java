package day07;

import java.util.Scanner;

public class Test06_Quiz {
	public static void main(String[] args) {
		Student[] st = new Student[3];
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			st[i].input();
		}
		for (int i = 0; i < st.length; i++) {
			st[i].output();
		}

	}
}

class Student {
	private String name;
	private int kor;
	private int eng;

	// �Է¸޼ҵ�
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��̸�");
		name = sc.next();
		System.out.println("��������");
		kor = sc.nextInt();
		System.out.println("��������");
		eng = sc.nextInt();
		System.out.println();
	}

	// ��¸޼ҵ�
	public void output() {
		System.out.println("�л��̸�: " + name);
		System.out.println("�����̸�: " + kor);
		System.out.println("�����̸�: " + eng);
		System.out.println("����: " + (kor + eng));
		System.out.println("���: " + (kor + eng) / 2.0);
		System.out.println("========================");
	}

}

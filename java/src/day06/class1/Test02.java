package day06.class1;

import java.util.Scanner;

/*
 * �л��� ��ȣ, ��������, �������� �Է¹ް� ��ȣ �������� �������� ���� ��� ����ϱ�
 */
public class Test02 {
	// Student Ŭ����Ÿ���� ��ü�� ������ �� ������ �� �����͸� ����غ�����
	public static void main(String[] args) {
		Student st = new Student();
		st.input();
		st.calc();
		st.output();
	}
}

class Student {
	private int num;
	private int kor;
	private int eng;
	private int tot;
	private double ave;

	public void input() {// �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�л���ȣ �Է�");
		num = sc.nextInt();
		System.out.println("�������� �Է�");
		kor = sc.nextInt();
		System.out.println("�������� �Է�");
		eng = sc.nextInt();
	}

	public void calc() {// ����, ��� ����ϱ�
		tot = kor + eng;
		ave = tot / 2.0;
	}

	public void output() {
		System.out.println("�л���ȣ " + num);
		System.out.println("��������: " + kor);
		System.out.println("��������: " + eng);
		System.out.println("����: " + tot);
		System.out.println("���: " + ave);
	}
}

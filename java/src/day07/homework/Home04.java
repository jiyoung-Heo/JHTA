package day07.homework;

import java.util.Scanner;

//4  �л��̸�,����,����,���������� �Է¹޾� ����,���,������ ����ϴ�
//Ŭ������ ����� ����� ������.
//�л����� 5��(��ü �迭 ���)
//���� ���  90�̻� A
//              80�̻� B
//...
public class Home04 {
	public static void main(String[] args) {
		Student.input();
		Student.output();
	}
}

class Student {
	private static String name;
	private static int kor;
	private static int eng;
	private static int math;
	private static String grade;

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
	}

	public static void output() {
		System.out.println("����: " + (kor + eng + math));
		System.out.println("���: " + (kor + eng + math) / 3);
		if ((kor + eng + math) / 3 >= 90) {
			grade = "A";
		} else if ((kor + eng + math) / 3 >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println("����: " + grade);
	}
}

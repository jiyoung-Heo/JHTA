package day02;

import java.util.Scanner;

public class Test09Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л���ȣ: ");
		int stuNum = sc.nextInt();
		System.out.print("��������: ");
		int kor = sc.nextInt();
		System.out.print("��������: ");
		int eng = sc.nextInt();
		int sum = kor + eng;
		System.out.println("�л���ȣ" + stuNum + "�� �л��� ����,���, �����Դϴ�.");
		System.out.println("����: " + sum);
		System.out.println("���: " + sum / 2.0);
		int grade = (int) (sum / 2.0 / 10);
		switch (grade) {
		case 10:
		case 9:
			System.out.println("����: A");
			break;
		case 8:
			System.out.println("����: B");
			break;
		case 7:
			System.out.println("����: C");
			break;
		case 6:
			System.out.println("����: D");
			break;
		default:
			System.out.println("����: E");
		}
	}
}
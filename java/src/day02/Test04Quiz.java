package day02;

import java.util.Scanner;

public class Test04Quiz {
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
		if (sum / 2 >= 90) {
			System.out.println("����: A");
		} else if (sum / 2 >= 80) {
			System.out.println("����: B");
		} else if (sum / 2 >= 70) {
			System.out.println("����: C");
		} else if (sum / 2 >= 60) {
			System.out.println("����: D");
		} else if (sum / 2 < 60) {
			System.out.println("����: E");
		}
	}
}
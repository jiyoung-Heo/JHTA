package day01.test.aa;

import java.util.Scanner;

public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int kor = sc.nextInt();
		System.out.print("����: ");
		int eng = sc.nextInt();
		double sum = kor + eng;
		System.out.println("---------------------------");
		System.out.println("[��°��]\n��������: " + kor + "\n��������: " + eng + "\n����: " + sum + "\n���: " + sum / 2);

	}
}

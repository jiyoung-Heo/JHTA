package day06.method;

import java.util.Scanner;

/*
 * �� ������ �Է¹޾� �� ���� ū���� �޼ҵ带 ����� ���غ�����
 * �� ������ �Է¹޾� �� ������ ���� �޼ҵ带 ����� ���غ�����
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int b = sc.nextInt();
		bigOne(a, b);
		System.out.println("ù��° ������ �Է��ϼ���");
		int fir = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int sec = sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���");
		int thir = sc.nextInt();
		System.out.println(sum(fir, sec, thir));
	}

	public static void bigOne(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}

	public static int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
}

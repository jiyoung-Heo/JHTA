package day02;

import java.util.Scanner;

/*
 * 1. �� ������ �Է¹޾� �� ���� ū ���� if���� ����Ͽ� ���غ�����.
 */
public class Test02Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 < num2) {
			System.out.println(num2);
		} else {
			System.out.println("�� ���� �����մϴ�.");
		}
//		int max = num1;
//		if (max < num2) {
//			max = num2;
//		}
//		System.out.println("ū��" + max);

	}
}
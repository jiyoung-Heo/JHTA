package day05.array;

import java.util.Scanner;

/*
 * [�迭]
 * - ���� �ڷ����� ������ ������ �ʿ��� ��� �������� ������ �����͸� �����Ͽ� �����ϴ� �ڷᱸ��
 * 1) 1�����迭
 * - ÷�ڰ� �ϳ��� �迭
 * ����)
 * �ڷ���[] �迭�� =new �ڷ���[�迭ũ��]
 */
public class Test01_Array {
	public static void main(String[] args) {
//		int[] a = new int[3];
//		a[0] = 100;
//		a[1] = 50;
//		a[2] = 80;
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a[i]);
//		}
//		int[] aa = { 100, 50, 80 };
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a[i]);
//		}
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int tot = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "��° �л� ���� �Է�");
			a[i] = sc.nextInt();
			tot += a[i];
		}
		double ave = tot / 5.0;
		System.out.println("<<�Էµ��л�����>>");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
		System.out.print("��ü����: " + tot);
		System.out.print("��ü���: " + ave);
	}
}

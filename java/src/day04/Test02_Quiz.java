package day04;

import java.util.Scanner;

/*
 * 1. 1���� 100���� ���� 3�� ��� ����ϰ� 3�� ����� ���ϱ�
 * 
 * 2. �� �Է¹޾� �ش� ������ ����ϱ�
 * -->while�� ���
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			if (a % 3 == 0) {
				System.out.print(a);
				sum += a;
			}
			a++;
		}
		System.out.println("\n3�� �����" + sum);
		System.out.println("============");
		System.out.println("���� �Է��ϼ���");
		int num = sc.nextInt();
		int cnt = 1;
		while (cnt < 10) {
			int result = num * cnt;
			System.out.println(num + "*" + cnt + "=" + result);
			cnt++;
		}
	}
}

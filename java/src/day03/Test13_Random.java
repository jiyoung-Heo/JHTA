package day03;

import java.util.Random;
import java.util.Scanner;

public class Test13_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();// ������ �߻���Ű�� ��ü
//		for (int i = 1; i <= 10; i++) {
//			int n = rnd.nextInt(10);// ������ ����
//			System.out.println(i + "��° �߻��� ����: " + n);
//		}
		int num = rnd.nextInt(10) + 1;// 1���� 10������ ���� ������
		int cnt = 0;
		for (;;) {
			System.out.println("����Ǵ� ���ڸ� �Է��� ������");
			int userNum = sc.nextInt();
			cnt++;
			if (num == userNum) {
				System.out.println("����!");
				System.out.println(cnt + "������ ���߼̽��ϴ�");
				break;
			}
			System.out.println("�Է�Ƚ��: " + cnt);
		}
	}
}

package day04;

import java.util.Random;
import java.util.Scanner;

/*
 * �Ʒ��� ���� ������� ���α׷��� ����ǵ��� �غ�����.
 * ��)
 * 1+2=3
 * 2+3=5
 * ...
 * --> ���� ������ �� ���� ������ �����̰� ����ڰ� ���� �Է��� �����.
 * 	������ �� 10�����̰� ������ 1������ 10���̴�.
 * 	
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num1 = rnd.nextInt(10) + 1;
			int num2 = rnd.nextInt(10) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if ((num1 + num2) == result) {
				System.out.println("����!");
				cnt++;
			}
		}
		System.out.println("���᰹��: " + cnt + "��");

	}
}

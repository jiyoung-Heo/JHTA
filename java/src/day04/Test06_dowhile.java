package day04;

import java.util.Scanner;

/*
 * [do~while��]
 * - ����
 * do{
 * 		���๮��;
 * 		..
 * }while(���ǽ�);
 * 
 * 	-���ǽ��� ������ ������ �ݺ��ؼ� ������ ����
 * 	-while���� ���ǽ��� ���� �Ǻ������� do~while�� ���� ������ �����ϰ� ������ �Ǻ��Ѵ�.
 */
public class Test06_dowhile {
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//		do {
//			sum += i;
//			i++;
//		} while (i <= 100);
//		System.out.println("1���� 100������ ��" + sum);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("�� �Է�");
			n = sc.nextInt();
		} while (!(n >= 2 && n <= 9));
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));

		}
	}
}

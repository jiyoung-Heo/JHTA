package day03;

import java.util.Scanner;

/*
 * [�� �Է¹޾� ������ ����ϱ�]
 * ��)
 * ���Է�
 * 3
 * 
 * 3��
 * 3*1=3
 * ...
 * 3*9=27
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int dan = sc.nextInt();
		System.out.println();
		System.out.println(dan + "��");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}

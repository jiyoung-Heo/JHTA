package day03.homework;

import java.util.Scanner;

//3. ������ ���� �Է¹޾� for���� ����ؼ� ���丮���� ���� ������.
//���� : 4�� ���丮���� 4*3*2*1 �̴�.
//��)
//�����Է�:4
//4!=24
public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		int fac = 1;
		for (int i = num; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(num + "!" + "=" + fac);
	}
}

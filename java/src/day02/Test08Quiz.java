package day02;

import java.util.Scanner;

/*
 * �� ���ÿ� ��Ģ������ �� �ϳ��� �Է¹޾� �ش� ������ ����ǵ��� ���α׷� �����ϱ�
 * switch���
 * ��)
 * ������ù��° ����
 * 1
 * �����ҵι�° ����
 * ������(+,-,*,/)
 * [���]
 * 1-2=-1
 */
public class Test08Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ��");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ��");
		int num2 = sc.nextInt();
		System.out.println("������");
		String mix = sc.next();
		switch (mix) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("������ �Է¿���");
		}
	}
}

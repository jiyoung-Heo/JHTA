package day01.test.bb;

import java.util.Scanner;

/*
 * [��������]
 * ! (not) : ��� ���� ���̸� ����, �����̸� ������ �ٲ�
 * && (and): �����Ǵ� ���� ��� ���̸� ��, �ƴϸ� ����
 * || (or) : �����Ǵ� ���� ��� �����̸� ����, �ƴϸ� ��
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է�");
		int interview = sc.nextInt();
		System.out.println("�������� �Է�");
		int eng = sc.nextInt();
		if (interview >= 90 || eng >= 80) {
			System.out.println("����� �հ�");
		} else {
			System.out.println("����� ���հ�");
		}
	}
}

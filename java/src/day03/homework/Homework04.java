package day03.homework;

import java.util.Scanner;

//4. ������ ������ �Է¹޾� �Ҽ����� �ƴ��� ����� ������.
//�Ҽ�:1�� �ڽ����θ� ���������� ��(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31....)
//
//(��Ʈ : for������ �Էµ� ������ 100�̸� 2���� 99���� ��������)
public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		int result = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result += 1;
			}
		}
		if (result == 0) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}
}

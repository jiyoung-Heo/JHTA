package day02.homework;

import java.util.Scanner;

//2. ������ ������ �Է¹޾� ���밪�� ���غ�����.(if�� ���)
//��)
//�����Է� : 10
//��� 10�� ���밪 :10
//---------------------
//�����Է� :-10
//��� -10�� ���밪 :10
public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num);
		} else if (num < 0) {
			System.out.println(-num);
		} else {
			System.out.println("0�Դϴ�");
		}

	}
}
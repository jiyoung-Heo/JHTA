package day10.share;

import java.util.Scanner;

public class Cy_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// ��ĳ�� �ڷ� �Է�
		String[] tall = new String[5];// ��Ʈ�� �迭�� 5���� ���� ����
		double tot = 0;// �������� ���� ��ü

		for (int i = 0; i < tall.length; i++) {// for���� ���� tall[]�� ���� �־���.
			System.out.println("���� �Է� : ");
			tall[i] = sc.next();
			double tall1 = Double.parseDouble(tall[i]);// String�� ����� �ٲ��ְ�
			tot += tall1;// �� �ٲ��� ���� ������

		}
		System.out.println();// �ٹٲ�
		System.out.println("��� :" + Math.round(tot / tall.length));// round �Լ� + ��ü�� ���ڸ�ŭ �����ְ� ���

	}
}
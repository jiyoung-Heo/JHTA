package day10.share;

import java.util.Calendar;
import java.util.Scanner;

public class Cy_02 {
	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();// Calendar ��ü ����

		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");// ������ �Է¹ޱ�
		int y = sc.nextInt();
		System.out.println("���� �Է��ϼ���");// ���� �Է� �ޱ�
		int m = sc.nextInt();
		String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };// ����� ���ϵ�

		cd.set(y, m - 1, 1);// 5���� �ް�;� ���� 5�� �Է��ߴٸ� 5���� �ƴ϶� �ε�����ȣ 5�� 6���� �Ǳ⿡ -1
		int a = cd.get(Calendar.DAY_OF_WEEK);// ������ �������� �����ֱ�
		int mm = cd.get(Calendar.MONTH) + 1; // �� ���/set -1 �������ϱ� +1 �������
		int yy = cd.get(Calendar.YEAR);// �� ���
		int cnt = a;// ī��Ʈ���� ���� �����ٲ���

		System.out.println(yy + "�� " + mm + "��");
		for (int i = 1; i <= 7; i++) {// ��ȭ��������� ���
			System.out.print(days[i - 1] + "\t");
		}
		System.out.println();
		for (int i = 1; i < a; i++) {// ���۳�¥ ���� ���� ���
			System.out.print("\t");
		}
		for (int i = 1; i <= 31; i++) {// �����ϱ�! 31�� ����
			System.out.print(i + "\t");

			if (cnt == 7) {// 7�� �Ǹ� ������ ��á���� ���� �����ֱ�
				cnt = 0;
				System.out.println();
			}
			cnt++;// �ϳ� ����� ������ 1�� �����ֱ�

		}
	}
}

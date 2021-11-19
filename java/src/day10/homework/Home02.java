package day10.homework;

import java.util.Calendar;
import java.util.Scanner;

public class Home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ���");
		int month = sc.nextInt();
		System.out.println("------------------\n" + year + "�� " + month + "��\n------------------");
		System.out.println("��	��	ȭ	��	��	��	��");
		Calendar cl = Calendar.getInstance(); // Calendar��ü ����
		cl.set(Calendar.YEAR, year); // �� �����ϱ�
		cl.set(Calendar.MONTH, month - 1); // �� �����ϱ�
		int lastday = cl.getActualMaximum(Calendar.DAY_OF_MONTH); // �ش� ���� �������� �޾ƿ���
		// ����� ���ϸ��
		String[] days = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };

		for (int i = 1; i <= lastday; i++) {
			// �Է��� ��, ��, i��° �� �����ؼ� �ش� ���� ���ϱ�
			cl.set(year, month - 1, i);
			int now = cl.get(Calendar.DAY_OF_WEEK);// ���ϱ��ϱ�
			// 1���� �����Ϻ��� �����̸� ���� ��, ��, ȭ�� ������ �������� �ϱ� ������ for�� ���鼭 \t����
			if (i == 1) {
				for (int j = 1; j <= now - 1; j++) {
					System.out.print("\t");
				}
			}

			// �ش��� ����ϱ�
			System.out.print(i);

			// ���� �ش����� �Ͽ����̸� ���� �ٲ��ְ� �ƴϸ� \t����
			if (days[now - 1] == days[6]) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
}

//2. �⵵�� ���� �Է¹޾� �޷�����ϱ�
//��) 
//�⵵ : 2010
//�� : 11
//
//---------------------------
// 2010�� 11��
//---------------------------
//�� �� ȭ �� �� �� ��
//   1  2 3  4  5  6
//..

package day02;

import java.util.Scanner;

/*
 * ������������ ���������� Ű����� �Է¹޾� �޿��� ����ϴ� ���α׷� ����� ����
 * ��)
 * �ٹ����� �Է�: ������
 * �����Է�: 1000000
 * �����Է�: 100000
 * �޿�: 1100000��
 * �ٹ����� �Է�: ��������
 * �ٹ��ð�: 10
 * �ð��� �޿�: 30000
 * �޿�: 300000��
 * 
 * ����������޿�: ����+����
 * ������������޿�: �ٹ��ð�*�ð���޿�
 */
public class Test06Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ�����: ");
		String name = sc.next();
		if (name.equals("������")) {
			System.out.print("�����Է�: ");
			int bb = sc.nextInt();
			System.out.print("�����Է�: ");
			int mo = sc.nextInt();
			int result = bb + mo;
			System.out.print("�� �޿��� " + result + "�� �Դϴ�.");
		} else if (name.equals("��������")) {
			System.out.print("�ٹ��ð�: ");
			int time = sc.nextInt();
			System.out.print("�ð��� �޿�: ");
			int mo = sc.nextInt();
			int result = time * mo;
			System.out.print("�� �޿��� " + result + "�� �Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
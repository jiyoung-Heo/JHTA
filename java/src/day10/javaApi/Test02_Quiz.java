package day10.javaApi;

import java.util.Scanner;

/*
 * �ֹε�Ϲ�ȣ�� �Է¹޾� �Ʒ��� �۾��� �� �� �ֵ��� �ۼ��� ������.
 * ��) �ֹε�Ϲ�ȣ �Է�: 8012112342111
 * 	[���]
 *   �������: 80�� 12�� 12��
 *   ����: ��
 *   
 *   ����
 *   - �� �ԷµǸ� �ȵ�(indexOf)
 *   ��� ���ڷθ� �ԷµǾ�� ��(charAt)
 *   13�ڸ����� �˻�(length)
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�ֹε�Ϲ�ȣ �Է�: ");
			String pri = sc.next();
			System.out.println("[���]");
			if (pri.indexOf("-") != -1) {
				System.out.println("-�� �Է��ϽǼ� �����ϴ�.");
				continue;
			}
			if (pri.length() != 13) {
				System.out.println("�ֹε�Ϲ�ȣ�� 13�ڸ������մϴ�.");
				continue;
			}
			System.out.println(
					"�������: " + pri.substring(0, 2) + "�� " + pri.substring(2, 4) + "�� " + pri.substring(4, 6) + "��");
			if (pri.charAt(6) == '2' || pri.charAt(6) == '4') {
				System.out.println("����: ��");
			} else if (pri.charAt(6) == '1' || pri.charAt(6) == '3') {
				System.out.println("����: ��");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;
		}

	}
}

package day04;

import java.util.Scanner;

/*
 * ���̵�� ��й�ȣ�� �Է¹޾� ������ [ȸ���� ȯ���մϴ�.]
 * Ʋ����[���̵� �Ǵ� ��й�ȣ�� ���� �ʾƿ�]��� ����Ѵ�.
 * ����- �Է±�ȸ�� 3���̰� 3�� ��� Ʋ���� [�Է¿���!]��� ����ϰ� ���α׷������Ѵ�.(System.exit(0); �̳� return;)
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chance = 3;
		while (chance > 0) {
			System.out.println("���̵� �Է��ϼ���");
			String id = sc.next();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String pw = sc.next();
			if (id.equals("user") && pw.equals("1234")) {
				System.out.println("[ȸ���� ȯ���մϴ�.]");
			} else {
				System.out.println("[���̵� �Ǵ� ��й�ȣ�� ���� �ʾƿ�]");
				chance--;
			}
		}
		if (chance == 0) {
			System.out.println("[�Է¿���, ���α׷� ����]");
			return;
		}
	}
}

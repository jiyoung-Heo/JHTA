package day02.homework;

import java.util.Scanner;

//5. ���ʽ��� �����Ϸ����Ѵ�. �ٹ��ð��� ������ �Է¹޾�
// �ٹ��ð��� ���� ���ʽ��� ����Ͽ� ������ ���Ͽ� ����ϴ�
// ���α׷��� �ۼ�
// --------------------------------------------
// �ٹ��ð� ���ʽ�
// --------------------------------------------
//
// 25�ð��̻� ������ 100%
// 20�ð��̻� ������ 80%
// 18�ð��̻� ������ 50%
// 18�ð��̸� ����
// ---------------------------------------------
// [��°��]
// �ٹ��ð��Է�:20
// �����Է�:1000000
// ===============
// ���ʽ�:xx
// ���޵� �޿�:xx
//
//
public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ��ð�: ");
		int time = sc.nextInt();
		System.out.print("����: ");
		int money = sc.nextInt();
		int plus = 0;
		if (time >= 25) {
			plus = money;
		} else if (time >= 20) {
			plus = money * 80 / 100;
		} else if (time >= 18) {
			plus = money * 50 / 100;
		} else if (time < 18) {
		}
		System.out.println("==========\n���ʽ�: " + plus + "\n���޵� �޿�: " + (money + plus));
	}
}
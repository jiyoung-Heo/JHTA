package day11.collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * �л���ȣ, �̸�, ��ȭ��ȣ�� ���� ������ ���� Student Ŭ������ ����� ArrayList�� �����ϰ� ��ü �����͸� ��� ����� ������.
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Test05_Quiz_Student st = new Test05_Quiz_Student(1, "������", "010-5219-9755");
		Test05_Quiz_Student st1 = new Test05_Quiz_Student(2, "������2", "011-5219-9755");
		Test05_Quiz_Student st2 = new Test05_Quiz_Student(3, "������3", "012-5219-9755");
		ArrayList<Test05_Quiz_Student> list = new ArrayList<Test05_Quiz_Student>();
		list.add(st);
		list.add(st1);
		list.add(st2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("�л���ȣ: " + list.get(i).getNum() + "\t�л��̸�: " + list.get(i).getName() + "\t��ȭ��ȣ: "
					+ list.get(i).getCall());
		}
		/*
		 * �л� ��ȣ�� �Է¹޾� �ش� �л��� �̸��� ��ȭ��ȣ�� ����غ����� ��) �л���ȣ�Է�:2 �̸�: �̱浿 ��ȭ��ȣ:010-222-2222
		 * �ش��ϴ� �л���ȣ�� ������ �ش��ȣ�� �������� �ʽ��ϴ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�л���ȣ�� �Է��ϼ���: ");
		int result = sc.nextInt();
		boolean cnt = false;
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student s = list.get(i);
			if (s.getNum() == result) {
				System.out.println("�̸�: " + s.getName() + "\n��ȭ��ȣ: " + s.getCall());
				cnt = true;
			}
		}
		if (!cnt) {
			System.out.println("�ش��ȣ�� �������� �ʽ��ϴ�.");
		}
		// ������ �л���ȣ�� �Է¹޾� ArrayList���� �����غ�����
		System.out.print("������ �л���ȣ�� �Է��ϼ���: ");
		int remove = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student tqs = list.get(i);
			if (tqs.getNum() == remove) {
				list.remove(tqs);
				cnt = true;
				System.out.println(remove + "�� �л� �����Ϸ�!");
			}
		}
		if (!cnt) {
			System.out.println("�ش��ȣ�� �������� �ʽ��ϴ�.");
		}
		System.out.println("<���� �л� ���>");
		for (int i = 0; i < list.size(); i++) {
			Test05_Quiz_Student tqs = list.get(i);
			System.out.println(+tqs.getNum() + " " + tqs.getName() + " " + tqs.getCall());
		}
	}
}
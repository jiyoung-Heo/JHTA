package day10.javaApi;

import java.util.Calendar;

/*
 * Calendar Ŭ����
 * - ��¥�� �ð��� ���õ� ������ ���� Ŭ����
 * - �߻�Ŭ�����̹Ƿ� ��ü�� ������ �� ����. �Ʒ��� ���� ������� Calender��ü�� ���� �� �ִ�.
 * Calendar rightNow = Calendar.getInstance();
 */
public class Test04_Calendar {
	public static void main(String[] args) {
		// public static Calendar getInstance{}
		Calendar cd = Calendar.getInstance();// ���� ��¥�� �ð��� ���� ������ ���� calendar��ü ������
//		cd.set(2020, 1, 1);// 2020�� 2�� 1�Ϸ� ��¥ ����
		cd.set(Calendar.YEAR, 2022);
		System.out.println(cd);
		cd.add(Calendar.DAY_OF_MONTH, 30);// 30�� ������ ��¥ ���� ������
		System.out.println(cd);
		// public int get(int field)
		int y = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH) + 1;// 1���� 0�� ����
		int date = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println(y + "��" + month + "��" + date + "��");
		int day = cd.get(Calendar.DAY_OF_WEEK);// ���ϱ��ϱ�
		String w = "";
		switch (day) {
		case Calendar.SUNDAY:
			w = "�Ͽ���";
			break;
		case Calendar.MONDAY:
			w = "������";
			break;
		case Calendar.TUESDAY:
			w = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			w = "������";
			break;
		case Calendar.THURSDAY:
			w = "�����";
			break;
		case Calendar.FRIDAY:
			w = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			w = "�����";
			break;
		}
		System.out.println("������ " + w + "�Դϴ�.");
		String[] days = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		String w2 = days[day - 1];
		System.out.println("������ " + w2 + "�Դϴ�.");
		int lastDay = cd.getActualMaximum(Calendar.DAY_OF_MONTH);// �ش� ���� ������ ��¥ ���ϱ�
		System.out.println("�̹����� ������ ���� " + lastDay + "�� �Դϴ�.");
		// ���� �ð��� ����� ������. xxx�� xxx�� xxx��
		int time = cd.get(Calendar.HOUR);// 12�ð�����
		int min = cd.get(Calendar.MINUTE);
		int am = cd.get(Calendar.AM_PM);
		if (am == Calendar.AM) {
			System.out.println("����");
		} else if (am == Calendar.PM) {
			System.out.println("����");
		}
		System.out.print(time + "�� ");
		System.out.print(min + "�� ");
		System.out.print(cd.get(Calendar.SECOND) + "��");
	}
}

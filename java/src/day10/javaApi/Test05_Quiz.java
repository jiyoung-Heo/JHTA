package day10.javaApi;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �ڽ��� ��������� �Է¹޾� �¾ ������ ����غ�����.
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� �Է��ϼ���");
		String num = sc.next();
		String year = num.substring(0, 4);
		String month = num.substring(4, 6);
		String day = num.substring(6, 8);
		Calendar cd = Calendar.getInstance();
		cd.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
		int now = cd.get(Calendar.DAY_OF_WEEK);
		String[] days = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		String w2 = days[now - 1];
		System.out.println("������ " + w2 + "�Դϴ�.");
	}
}

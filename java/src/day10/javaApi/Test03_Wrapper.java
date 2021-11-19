package day10.javaApi;

import java.util.Scanner;

/*
 * [Wrapper Ŭ����]
 * - �⺻�ڷ���(int, char, double,...}�� Ŭ������ ������ ������
 * - �⺻�ڷ����� ���õ� �Ӽ��� �޼ҵ带 ���´�.
 * 
 * int ---------> Integer
 * char ---------> Character
 * long ---------> Long
 * double ---------> Double
 */
public class Test03_Wrapper {
	public static void main(String[] args) {
		// public static int parseInt(String s) throws NumberFormatException
		String s1 = "100";
		// s1�� int�� �ٲ㺸����
		int a = Integer.parseInt(s1);
		System.out.println(Integer.parseInt(s1) + 10);
		System.out.println(a + 10);
		// public static String toBinaryString(int i)
		// 100�� 2�������� ����غ�����.
		System.out.println(Integer.toBinaryString(100));
		Integer i1 = new Integer(10);
		int c = i1;
		Integer i2 = c;
		System.out.println(i2);
		String s3 = "3.24";
		double d = Double.parseDouble(s3);
		System.out.println(d);
		char ff = '1';
		if (Character.isDigit(ff)) {
			System.out.println("�����Դϴ�");
		}
		// ���ڿ��� Ű����� �Է¹޾� �Էµ� ���ڿ��� �빮�ڰ��� �ҹ��ڰ��� ������ ������ ����غ�����
		/*
		 * aBCD e �빮�ڰ���: 3 �ҹ��ڰ���: 2 �����ǰ���: 1
		 */
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int big = 0;
		int small = 0;
		int space = 0;
		for (int i = 0; i < num.length(); i++) {
			char re = num.charAt(i);
			if (Character.isUpperCase(re)) {
				big += 1;
			} else if (Character.isLowerCase(re)) {
				small += 1;
			} else if (Character.isWhitespace(re)) {
				space += 1;
			}
		}
		System.out.println("�빮�ڰ���: " + big);
		System.out.println("�ҹ��ڰ���: " + small);
		System.out.println("���鰳��: " + space);
	}
}

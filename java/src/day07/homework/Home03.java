package day07.homework;

import java.util.Scanner;

//3. java.lang��Ű���� MathŬ������ max�޼ҵ�� min�޼ҵ带 ����ؼ�
//�μ��� ū��,�μ��� �������� ���� ������.
public class Home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("�μ��� ������" + Math.min(num1, num2));
		System.out.println("�μ��� ū��" + Math.max(num1, num2));
	}
}

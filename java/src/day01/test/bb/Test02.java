package day01.test.bb;

import java.util.Scanner;

/*
 * [������]
 * 1. ���׿�����
 * 		++, --, !
 * 2. ���������
 * 		+,-,*,/,%(��������)
 * 3. ���迬����
 * 		>,>=,==,!=,<=
 * 4. ��������
 * 		!,&&,||
 * 5. ���ǿ�����
 * 		(���ǽ�)?��1:��2;
 * 6. ���Կ�����
 * 		=, +=, -=, *=, %=,...
 * 
 * [if��]
 * ����)
 * if(���ǽ�){
 * 		������ ���϶� ������ ����;
 * 		..
 * }else{
 * 		������ ������ �� ������ ����;
 * 		..
 * }
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �Է�");
		int n = sc.nextInt();
//		int a = n % 2;
//		System.out.println(a);
//		if (n % 2 == 0) {
//			System.out.println(n + "�� ¦�� �Դϴ�");
//		} else {
//			System.out.println(n + "�� Ȧ�� �Դϴ�");
//		}
		String result = (n % 2 == 0) ? "�� ¦�� �Դϴ�" : "�� Ȧ�� �Դϴ�";
		System.out.println(n + result);
	}
}

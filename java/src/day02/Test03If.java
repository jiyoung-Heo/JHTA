package day02;

import java.util.Scanner;

/*
 * 3. if~elseif ��
 *   - ������ �������� ���
 *   ����)
 *   if(���ǹ�1){
 *   	���ǹ�1�� ���϶� ������ ����;
 *   	..	
 * 	 }else if(���ǹ�2){
 * 		���ǹ�1�� ���϶� ������ ����;
 *   	..	
 * 	 }else if(���ǹ�3){
 * 		���ǹ�1�� ���϶� ������ ����;
 *   	..	
 *   }else{
 *   	������ ��� ���� ���� �� ������ ����;
 *   	..
 *   }
 */
public class Test03If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("������ ���� �Է�");
//		int num = sc.nextInt();
//		if (num > 0) {
//			System.out.println(num + "�� ����Դϴ�.");
//		} else if (num < 0) {
//			System.out.println(num + "�� �����Դϴ�.");
//
//		} else {
//			System.out.println(num + "�� ���Դϴ�.");
//		}
//�� ������ �Է¹޾� �μ��� ū �� ���ϱ�(�������̸� �μ��� ���ٶ�� ����ϱ�)
		System.out.println("ù��° ������ �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("ù��° ����" + num1 + "��(��) �� Ů�ϴ�");
		} else if (num1 < num2) {
			System.out.println("ù��° ����" + num2 + "��(��) �� Ů�ϴ�");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}
}

package day03;

import java.util.Scanner;

/*
 * <for���� ��������>
 * 
 * - ���ѷ��� ->�ݸ��� ���ѹݺ��Ѵ�.
 *  for(;;){
 *  	�ݺ������ҹ���;
 *  	...
 *  }
 *  
 *  - ���̺� �����ϱ�
 *  AA:for(;;){
 *  	for(;;){
 *  		...
 *  		break AA;
 *  	}
 *  }
 */
public class Test12_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for (;;) { // ���ѷ���
//			System.out.print("���̵� �Է�: ");
//			String id = sc.next();
//			System.out.print("��й�ȣ �Է�: ");
//			String pw = sc.next();
//			if (id.equals("user") && pw.equals("1234")) {
//				System.out.println(id + "ȸ���� ȯ���մϴ�");
//				break;
//			} else {
//				System.out.println("���̵� �Ǵ� ��й�ȣ�� ���� �ʾƿ�.");
//			}
//		}
		for (;;) {
			System.out.println("���Է�(�����Ϸ��� 0�� �Է��ϼ���)");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println("<" + n + "��>");
			for (int i = 1; i <= 9; i++) {
				System.out.println(n + "*" + i + "=" + (n * i));
			}
		}
	}
}

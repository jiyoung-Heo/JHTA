package day04;

import java.util.Scanner;

/*
 * [����while��]
 * -����)
 * while(���ǽ�){
 * 	while(���ǽ�){
 * 		�ݺ������� ����;
 * 		...
 * 	}
 * }
 */
public class Test03_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			System.out.println("���Է�(����:0)");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (n < 2 || n > 9) {
				System.out.println("2���� 9������ ���� �Է��ϼ���.");
				continue;// �ʱ��� ������(19����)���� �б�
			}
			while (i <= 9) {
				System.out.println(n + "*" + i + "=" + n * i);
				i++;
			}
		}
	}
}

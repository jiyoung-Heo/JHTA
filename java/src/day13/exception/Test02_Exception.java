package day13.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("ù��° �� �Է�(����:0)");
				int n1 = sc.nextInt();
				if (n1 == 0)
					break;
				System.out.println("�ι�° �� �Է�");
				int n2 = sc.nextInt();
				int n3 = n1 / n2;
				System.out.println(n1 + "/" + n2 + "=" + n3);

			} catch (ArithmeticException e) {
				System.out.println("0���� ������ �����.");
				System.out.println("�����޼���: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��� �ּ���.");
				System.out.println("�����޼���: " + e.getMessage());
				sc.next();// �߸��Էµ� ���� �о�ͼ� ������
			} finally {
				System.out.println("���ܿ� ������� ������ ����");
			}

		}
	}
}

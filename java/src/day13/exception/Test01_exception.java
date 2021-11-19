package day13.exception;

import java.util.Scanner;

/*
 * [ ����(Exception) ]
 * - ���� : ���α׷� �����߿� �߻��ϴ� ����� ����
 * - ����ó�� : ���ܰ� �߻��Ǿ����� �̿� ���� ������ ó���� �ϴ°�
 * - ����)
 *   try{
 *   	���ܰ� �߻��ɼ� �ִ� ���๮��;
 *      ..
 *   }catch(����Ÿ�� ��������){
 *     ���ܰ� �߻��Ǿ����� ������ ����;
 *     ..
 *   }catch(����Ÿ�� ��������){
 *     ���ܰ� �߻��Ǿ����� ������ ����;
 *     ..
 *   }finally{
 *   	���ܿ� ������� ������ �����ؾ� �� ����
 *   }
 *   ==> ���ܰ� �߻��� �� �ִ� ������ try{}������� ���� catch������ ���ܿ� ���� ������ ó���� �Ѵ�.
 */
public class Test01_exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ù��° �� �Է�(����:0)");
			int n1 = sc.nextInt();
			if (n1 == 0)
				break;
			System.out.println("�ι�° �� �Է�");
			int n2 = sc.nextInt();
			try {
				int n3 = n1 / n2;
				System.out.println(n1 + "/" + n2 + "=" + n3);

			} catch (ArithmeticException e) {
				System.out.println("0���� �������� �����ϴ�.");
				System.out.println("�����޼���" + e.getMessage());
			}
		}
	}
}

package day03;

/*
 * 1���� 100���� ���� 3�� ����� ����ϰ� 3�� ����յ� ���ؼ� ����غ�����
 * 3 6 9 ..99
 * 3�� �����:xx
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for (num = 1; num <= 100; num++) {
			if (num % 3 == 0) {
				sum += num;
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("��: " + sum);
	}
}

package day03;

/*
 * for���� ����Ͽ� 1���� 100���� ���� ¦����, Ȧ������ ���� ���ؼ� ����غ�����
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}

		System.out.println("¦��" + sum);
		System.out.println("Ȧ��" + sum2);
	}
}

package day03;

/*
 * [�ݺ����]
 * -for��
 * ����)
 * for(�ʱ��;���ǽ�;������){
 * 		�ݺ������ҹ���;
 * 		..
 * }
 * - ���ǽ��� �������� ���������� �ݺ������� ������ �ݺ�������
 */
public class Test01_for {
	public static void main(String[] args) {

		// 1���� 100���� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1���� 100������ ��: " + sum);
		int sum2 = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum2 = sum2 + i;
		}
		System.out.println("1���� 100������ Ȧ����: " + sum2);
	}
}

package day06.method;

/*
 * [�޼ҵ��� ��������]
 * -�Ű������� ���Ϲ��� �������� �ְ� �������� ����
 * - ���Ϲ��� ������ ����Ÿ���� void�� ǥ���Ѵ�.
 */
public class Test03 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		printArray(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
//		}
//		System.out.println();
		int[] b = { 11, 12, 13, 14, 15, 16, 17 };
		printArray(b);

		// �迭�� ���� ���ϴ� �޼ҵ带 ����� ����� ��µɼ� �ֵ��� �ϼ��� ������.
		int s = getSum(a);
		System.out.println("�迭��: " + s);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}

	public static int getSum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

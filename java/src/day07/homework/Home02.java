package day07.homework;

//2. �Ʒ��� ���� ���α׷��� ����� �� �ֵ��� MyArrayŬ������ ����� ������.
public class Home02 {
	public static void main(String[] args) {
		int[] a = { 4, 6, 29, 10, 30 };
		int s = MyArray.sum(a); // �迭�� �� ���ϱ�
		System.out.println("�迭��:" + s);
		MyArray.printArray(a); // �迭��Ҹ� ���
		int max = MyArray.max(a); // �迭����� ���� ū���� ����
		System.out.println("�迭����߰���ū��:" + max);
	}
}

class MyArray {
	private static int sum2;
	private static int bigger;

	public static int sum(int[] a) {
		for (int i = 0; i < a.length; i++) {
			sum2 += a[i];
		}
		return sum2;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int max(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (bigger < a[i]) {
				bigger = a[i];
			}
		}
		return bigger;
	}
}

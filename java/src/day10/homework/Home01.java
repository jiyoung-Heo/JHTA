package day10.homework;

import java.util.Scanner;

public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ټ����� ������ �Է��ϼ���");
		String data = sc.next();
		// �Է¹��� ����� ,�� �������� �߶� �迭�� �ֱ�
		String[] arr = data.split(",");
		double sum = 0;
		// for���� �迭ũ�⸸ŭ ���鼭 ����� ����ȯ���� �� �հ� ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			// ���� �� ���� Ȯ�ΰ� �־�׾��
			System.out.print(arr[i] + " ");
			sum += Double.parseDouble(arr[i]);
		}
//		System.out.println("\n������ ��" + sum);
		// �ݿø����ִ� MathŬ������ round �޼ҵ� ���.
		System.out.println("\n��ս���: " + Math.round(sum / 5.0));
	}
}

//�Ʒ��� ���� ���·� �ټ����� ������ �Է¹޾� ��ս����� ���� ������.
//��)
//�ټ����� ������ ���ʷ� �Է�
//180.6,198.2,170.3,175.0,172.9 ==> String data=scan.next();
//�ټ����� ��ս���:xxx
//��ս����� �ݿø��ؼ� ����Ѵ�. Math Ŭ������ round�޼ҵ� ��� (public static long round(double a))
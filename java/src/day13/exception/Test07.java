package day13.exception;

import java.util.Scanner;

//������ ���� �߻���Ű��
//����-throw ���ܰ�ü;
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("���α���");
			int x = sc.nextInt();
			System.out.println("���α���");
			int y = sc.nextInt();
			int area = boxArea(x, y);
			System.out.println("�簢������: " + area);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int boxArea(int x, int y) throws Exception {
		if (x <= 0 || y <= 0) {
//			throw new Exception("�����Է¿���");
			Exception e = new Exception("���̿���!");
			throw e;

		}
		int area = x * y;
		return area;
	}
}

package day05.homework1;

import java.util.Random;

//2. ������ ���� 6���� �߻����� �迭�� �����ϰ� ����� ������.
//������ ������ 1���� 45����
//Random rnd=new Random();
//int n=rnd.nextInt(45)+1;
//[���]
//�̹��� �ζ� ��ȣ
//2 17 45 22 13 4
public class Homework2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = rnd.nextInt(45) + 1;
			System.out.print(num[i] + " ");
		}

	}
}

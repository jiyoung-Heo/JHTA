package day05.homework2;

import java.util.Random;

//2. ������ ���� 6���� �߻����� �迭�� �����ϰ� ����� ������. ( �ߺ����� �߻����� �ʵ��� �ϼ���)
//������ ������ 1���� 45����
//Random rnd=new Random();
//int n=rnd.nextInt(45)+1;
public class Homework02 {
	public static void main(String[] args) {
		Random rd = new Random();
//		int n = rd.nextInt(45) + 1;
		int[] result = new int[6];
		for (int i = 0; i < 6; i++) {
			result[i] = rd.nextInt(45) + 1;
		}
		for (int j = 0; j < 6; j++) {
			System.out.print(result[j] + " ");
		}

	}
}

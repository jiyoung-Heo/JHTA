package day03.homework;

//2. 1���� 100���� ���� 3�� ����� ������ ����� ������.
//���:3�ǹ�� ����:XX��
public class Homework02 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				cnt++;
			}
		}
		System.out.println("3�� ����� ����: " + cnt);
	}
}

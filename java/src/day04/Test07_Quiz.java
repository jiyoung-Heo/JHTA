package day04;

/*
 * do while �� ����Ͽ� 1���� 100���� ����ϱ�
 * ���ٿ� 10���� ��µǵ���
 * 
 * 1,2,3,4,...10
 * 11,12...
 * ...
 * 91...100
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.print(num + " ");
			if (num % 10 == 0)
				System.out.println();
			num++;
		} while (num <= 100);
	}
}

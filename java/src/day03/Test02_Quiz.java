package day03;

/*
 * for문을 사용하여 1부터 100까지 수중 짝수합, 홀수합을 각각 구해서 출력해보세요
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

		System.out.println("짝수" + sum);
		System.out.println("홀수" + sum2);
	}
}

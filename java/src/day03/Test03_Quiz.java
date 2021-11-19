package day03;

/*
 * 1부터 100까지 수중 3의 배수를 출력하고 3의 배수합도 구해서 출력해보세요
 * 3 6 9 ..99
 * 3의 배수합:xx
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for (num = 1; num <= 100; num++) {
			if (num % 3 == 0) {
				sum += num;
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("합: " + sum);
	}
}

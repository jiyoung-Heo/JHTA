package day03;

/*
 * for문 이용해서 아래처럼 출력되도록 하세요
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

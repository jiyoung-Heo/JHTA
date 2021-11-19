package day03;

public class Test05_Quiz {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
				n++;
				if (n % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}

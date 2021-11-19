package day05.array;

public class Test08_Quiz {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 0 }, { 4, 5, 6, 0 }, { 7, 8, 9, 0 } };
		System.out.println("실행결과");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][3] += a[i][j];
			}
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}

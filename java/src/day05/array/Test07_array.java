package day05.array;

/*
 * [2차원 배열]
 * - 첨자가 두개인 배열
 * - 형식
 *  자료형[][] 배열 = new 자료형[행첨자][열첨자];
 *  예)
 *  int[][] a = new int[3][4];
 *  a[0][0]=1;
 *  a[0][1]=2;
 *  ...
 */
public class Test07_array {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
}
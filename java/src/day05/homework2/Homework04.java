package day05.homework2;
//4. 각 열의 합을 마지막 행에 저장되도록 하고 전체 배열 요소를 출력해 보세요

//int[][] b={	{1,2,3},
//             {4,5,6},
//             {7,8,9},
//            {0,0,0}};

public class Homework04 {
	public static void main(String[] args) {
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0, 0, 0 } };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[3][i] += b[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < b[i].length; k++) {
				System.out.print(b[i][k] + " ");
			}
			System.out.println();
		}
	}
}

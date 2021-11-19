package day05.array;

import java.util.Scanner;

/*
 * 학생답안을입력받아 학생의 점수를 출력해보세요
 * 정답은 아래와 같습니다. 문제 1개당 10점
 * 
 * int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
 * 예)
 * 학생답안10개입력
 * 1번답입력: 1
 * ...
 * 
 * 학생점수: xx점
 * -->학생이 3명인경우(2차원배열사용
 * [출력결과]
 * 1 2 ... 90
 * ... 100
 * ... ...
 * 
 */
public class Test11_Quiz {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[3][11];
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번 학생 ");
			stu[i][10] = 0;
			for (int j = 0; j < 10; j++) {
				System.out.print((j + 1) + "번 답 입력: ");
				stu[i][j] = sc.nextInt();
				if (stu[i][j] == a[j]) {
					stu[i][10] += 10;
				}
			}
		}
		System.out.println("[출력결과]");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(stu[i][j] + " ");
			}
			System.out.println();
		}

	}
}

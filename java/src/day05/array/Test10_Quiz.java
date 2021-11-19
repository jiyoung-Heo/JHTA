package day05.array;

import java.util.Scanner;

/*
 * 3명의 학생의 번호, 국어, 영어, 수학점수 입력받아 총점, 평균 구해서 출력하기
 */
public class Test10_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[3][6];
		int sum = 0;
		String[] sub = { "국어", "영어", "수학" };
		for (int i = 0; i < stu.length; i++) {
			System.out.println("번호를 입력하세요");
			stu[i][0] = sc.nextInt();
			for (int j = 1; j < 4; j++) {
				System.out.println(sub[j - 1] + "점수입력");
				stu[i][j] = sc.nextInt();
				if (stu[i][j] < 1 || stu[i][j] > 100) {
					System.out.println("잘못 입력하셨습니다.");
					j--;
				}
			}
		}
		for (int i = 0; i < stu.length; i++) {
			for (int j = 1; j < 4; j++) {
				sum += stu[i][j];
			}
			System.out.println(stu[i][0] + "번 학생의" + "합계: " + sum);
			System.out.println(stu[i][0] + "번 학생의" + "평균: " + sum / 3.0);
			sum = 0;
		}
	}
}

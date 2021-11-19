package day05.array;

import java.util.Scanner;

/*
 * 10명학생점수를입력받아배열에저장하고전체입력된점수를 출력해보세요
 * 점수가 80저이상의 학생수를 구해서 출력하세요
 * 
 * 예)
 * 10명학생점수입력
 * ...
 * [입력된학생점수]
 * 100 90 70 ...
 * 점수가 80점이상인 학생수 : 2명
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[10];
		int cnt = 0;
		for (int i = 0; i < stu.length; i++) {
			System.out.print((i + 1) + "번 학생 점수 입력: ");
			stu[i] = sc.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i] + " ");
			if (stu[i] >= 80) {
				cnt++;
			}
		}
		System.out.println();
		System.out.println("점수가 80점 이상인 학생수: " + cnt);
	}
}

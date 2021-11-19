package day05.homework2;

import java.util.Scanner;

//1. 학생5명의 이름과 점수를 입력받아 배열에 저장하고
//가장 높은 점수와 학생이름,가장 낮은 점수와 학생이름을 구해서 출력해 보세요.
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stu = new String[5];
		int[] num = new int[5];
		int a = 0;
		String astu = "";
		// 입력받기
		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생의 이름을 입력하세요");
			stu[i] = sc.next();
			System.out.println(stu[i] + "학생의 점수를 입력하세요");
			num[i] = sc.nextInt();
		}
		// 가장 높은점수 출력
		for (int i = 0; i < num.length; i++) {
			if (num[i] > a) {
				a = num[i];
				astu = stu[i];
			}
		}
		System.out.println("가장 높은 점수: " + a + " ->" + astu + "학생");
		// 가장 낮은점수 출력
		for (int i = 0; i < num.length; i++) {
			if (num[i] < a) {
				a = num[i];
				astu = stu[i];
			}
		}
		System.out.println("가장 낮은 점수: " + a + " ->" + astu + "학생");
	}

}

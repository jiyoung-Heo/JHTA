package day05.homework1;

import java.util.Scanner;

//1. 학생5명의 점수를 배열에 저장하고 전체총점,전체평균,가장 높은점수,가장 낮은 점수를 구해보세요 ( while문 사용)
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] std = new int[5];
		int sum = 0;
		int high = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 학생의 점수:");
			std[i] = sc.nextInt();
		}

		int i = 0;
		while (i < 5) {
			sum += std[i];
			if (high < std[i]) {
				high = std[i];
			}
			i++;
		}
		int low = high;
		i = 0;
		while (i < 5) {
			if (low > std[i]) {
				low = std[i];
			}
			i++;
		}

		System.out.println("전체총점" + sum);
		System.out.println("전체평균" + sum / 5.0);
		System.out.println("가장높은점수" + high);
		System.out.println("가장낮은점수" + low);
	}
}

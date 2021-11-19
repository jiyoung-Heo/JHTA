package day05.homework1;

import java.util.Scanner;

//3. 점수를 입력받아 분포도를 구해보세요. 점수대 학생의 수를 구해보세요.
//예)
//10개의 점수를 입력하세요
//100
//90
//99
//70
//8
//..
//
//[결과]
//1점대:1명
//10점대:0명
//..
//70점대:1명
//80점대:0명
//90점대:2명
//100점대:1명
public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int[] result = new int[11];
		System.out.println("10개의 점수를 입력하세요");
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("[결과]");
		int stu = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (num[j] / 10 == i) {
					result[i]++;
				}
			}
			System.out.println(i * 10 + "점대: " + result[i] + "명");
			stu = 0;
		}
	}

}

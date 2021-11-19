package day10.share;

import java.util.Calendar;
import java.util.Scanner;

public class Cy_02 {
	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();// Calendar 객체 생성

		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");// 연도를 입력받기
		int y = sc.nextInt();
		System.out.println("월을 입력하세요");// 월을 입력 받기
		int m = sc.nextInt();
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };// 출력할 요일들

		cd.set(y, m - 1, 1);// 5월을 받고싶어 숫자 5를 입력했다면 5월이 아니라 인덱스번호 5인 6월이 되기에 -1
		int a = cd.get(Calendar.DAY_OF_WEEK);// 요일의 번지수를 구해주기
		int mm = cd.get(Calendar.MONTH) + 1; // 월 출력/set -1 해줬으니까 +1 해줘야함
		int yy = cd.get(Calendar.YEAR);// 연 출력
		int cnt = a;// 카운트세서 단을 내려줄꺼임

		System.out.println(yy + "년 " + mm + "월");
		for (int i = 1; i <= 7; i++) {// 월화수목금토일 출력
			System.out.print(days[i - 1] + "\t");
		}
		System.out.println();
		for (int i = 1; i < a; i++) {// 시작날짜 전에 공백 출력
			System.out.print("\t");
		}
		for (int i = 1; i <= 31; i++) {// 시작하기! 31일 까지
			System.out.print(i + "\t");

			if (cnt == 7) {// 7이 되면 요일이 다찼으니 단을 내려주기
				cnt = 0;
				System.out.println();
			}
			cnt++;// 하나 출력할 때마다 1씩 더해주기

		}
	}
}

package day10.homework;

import java.util.Calendar;
import java.util.Scanner;

public class Home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		System.out.println("------------------\n" + year + "년 " + month + "월\n------------------");
		System.out.println("일	월	화	수	목	금	토");
		Calendar cl = Calendar.getInstance(); // Calendar객체 생성
		cl.set(Calendar.YEAR, year); // 년 지정하기
		cl.set(Calendar.MONTH, month - 1); // 월 지정하기
		int lastday = cl.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 월의 마지막날 받아오기
		// 출력할 요일목록
		String[] days = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		for (int i = 1; i <= lastday; i++) {
			// 입력한 년, 월, i번째 일 지정해서 해당 요일 구하기
			cl.set(year, month - 1, i);
			int now = cl.get(Calendar.DAY_OF_WEEK);// 요일구하기
			// 1일이 수요일부터 시작이면 앞쪽 일, 월, 화는 공백을 만들어줘야 하기 때문에 for문 돌면서 \t수행
			if (i == 1) {
				for (int j = 1; j <= now - 1; j++) {
					System.out.print("\t");
				}
			}

			// 해당일 출력하기
			System.out.print(i);

			// 만약 해당일이 일요일이면 줄을 바꿔주고 아니면 \t수행
			if (days[now - 1] == days[6]) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
}

//2. 년도와 월을 입력받아 달력출력하기
//예) 
//년도 : 2010
//월 : 11
//
//---------------------------
// 2010년 11월
//---------------------------
//일 월 화 수 목 금 토
//   1  2 3  4  5  6
//..

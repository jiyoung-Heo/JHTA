package day10.javaApi;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 자신의 생년월일을 입력받아 태어난 요일을 출력해보세요.
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일을 입력하세요");
		String num = sc.next();
		String year = num.substring(0, 4);
		String month = num.substring(4, 6);
		String day = num.substring(6, 8);
		Calendar cd = Calendar.getInstance();
		cd.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
		int now = cd.get(Calendar.DAY_OF_WEEK);
		String[] days = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String w2 = days[now - 1];
		System.out.println("생일은 " + w2 + "입니다.");
	}
}

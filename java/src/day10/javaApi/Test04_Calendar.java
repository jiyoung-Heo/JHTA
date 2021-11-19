package day10.javaApi;

import java.util.Calendar;

/*
 * Calendar 클래스
 * - 날짜와 시간에 관련된 정보를 갖는 클래스
 * - 추상클래스이므로 객체를 생성할 수 없다. 아래와 같은 방법으로 Calender객체를 얻어올 수 있다.
 * Calendar rightNow = Calendar.getInstance();
 */
public class Test04_Calendar {
	public static void main(String[] args) {
		// public static Calendar getInstance{}
		Calendar cd = Calendar.getInstance();// 현재 날짜와 시간에 대한 정보를 갖는 calendar객체 얻어오기
//		cd.set(2020, 1, 1);// 2020년 2월 1일로 날짜 설정
		cd.set(Calendar.YEAR, 2022);
		System.out.println(cd);
		cd.add(Calendar.DAY_OF_MONTH, 30);// 30일 이후의 날짜 정보 얻어오기
		System.out.println(cd);
		// public int get(int field)
		int y = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH) + 1;// 1월은 0값 리턴
		int date = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println(y + "년" + month + "월" + date + "일");
		int day = cd.get(Calendar.DAY_OF_WEEK);// 요일구하기
		String w = "";
		switch (day) {
		case Calendar.SUNDAY:
			w = "일요일";
			break;
		case Calendar.MONDAY:
			w = "월요일";
			break;
		case Calendar.TUESDAY:
			w = "화요일";
			break;
		case Calendar.WEDNESDAY:
			w = "수요일";
			break;
		case Calendar.THURSDAY:
			w = "목요일";
			break;
		case Calendar.FRIDAY:
			w = "금요일";
			break;
		case Calendar.SATURDAY:
			w = "토요일";
			break;
		}
		System.out.println("오늘은 " + w + "입니다.");
		String[] days = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String w2 = days[day - 1];
		System.out.println("오늘은 " + w2 + "입니다.");
		int lastDay = cd.getActualMaximum(Calendar.DAY_OF_MONTH);// 해당 월의 마지막 날짜 구하기
		System.out.println("이번달의 마지막 날은 " + lastDay + "일 입니다.");
		// 현재 시간을 출력해 보세요. xxx시 xxx분 xxx초
		int time = cd.get(Calendar.HOUR);// 12시간단위
		int min = cd.get(Calendar.MINUTE);
		int am = cd.get(Calendar.AM_PM);
		if (am == Calendar.AM) {
			System.out.println("오전");
		} else if (am == Calendar.PM) {
			System.out.println("오후");
		}
		System.out.print(time + "시 ");
		System.out.print(min + "분 ");
		System.out.print(cd.get(Calendar.SECOND) + "초");
	}
}

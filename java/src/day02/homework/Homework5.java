package day02.homework;

import java.util.Scanner;

//5. 보너스를 지급하려고한다. 근무시간과 본봉을 입력받아
// 근무시간에 따라 보너스를 계산하여 본봉과 합하여 출력하는
// 프로그램을 작성
// --------------------------------------------
// 근무시간 보너스
// --------------------------------------------
//
// 25시간이상 본봉의 100%
// 20시간이상 본봉의 80%
// 18시간이상 본봉의 50%
// 18시간미만 없음
// ---------------------------------------------
// [출력결과]
// 근무시간입력:20
// 본봉입력:1000000
// ===============
// 보너스:xx
// 지급될 급여:xx
//
//
public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		System.out.print("본봉: ");
		int money = sc.nextInt();
		int plus = 0;
		if (time >= 25) {
			plus = money;
		} else if (time >= 20) {
			plus = money * 80 / 100;
		} else if (time >= 18) {
			plus = money * 50 / 100;
		} else if (time < 18) {
		}
		System.out.println("==========\n보너스: " + plus + "\n지급될 급여: " + (money + plus));
	}
}
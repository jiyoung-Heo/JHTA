package day02;

import java.util.Scanner;

/*
 * 비정규직인지 정규직인지 키보드로 입력받아 급여를 계산하는 프로그램 만들어 보기
 * 예)
 * 근무형태 입력: 정규직
 * 본봉입력: 1000000
 * 수당입력: 100000
 * 급여: 1100000원
 * 근무형태 입력: 비정규직
 * 근무시간: 10
 * 시간당 급여: 30000
 * 급여: 300000원
 * 
 * 정규직사원급여: 본봉+수당
 * 비정규직사원급여: 근무시간*시간당급여
 */
public class Test06Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무형태: ");
		String name = sc.next();
		if (name.equals("정규직")) {
			System.out.print("본봉입력: ");
			int bb = sc.nextInt();
			System.out.print("수당입력: ");
			int mo = sc.nextInt();
			int result = bb + mo;
			System.out.print("총 급여는 " + result + "원 입니다.");
		} else if (name.equals("비정규직")) {
			System.out.print("근무시간: ");
			int time = sc.nextInt();
			System.out.print("시간당 급여: ");
			int mo = sc.nextInt();
			int result = time * mo;
			System.out.print("총 급여는 " + result + "원 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
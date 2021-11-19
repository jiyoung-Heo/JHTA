package day03;

import java.util.Random;
import java.util.Scanner;

public class Test13_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();// 난수를 발생시키는 객체
//		for (int i = 1; i <= 10; i++) {
//			int n = rnd.nextInt(10);// 임의의 난수
//			System.out.println(i + "번째 발생된 난수: " + n);
//		}
		int num = rnd.nextInt(10) + 1;// 1부터 10사이의 난수 얻어오기
		int cnt = 0;
		for (;;) {
			System.out.println("예상되는 숫자를 입력해 보세요");
			int userNum = sc.nextInt();
			cnt++;
			if (num == userNum) {
				System.out.println("정답!");
				System.out.println(cnt + "번만에 맞추셨습니다");
				break;
			}
			System.out.println("입력횟수: " + cnt);
		}
	}
}

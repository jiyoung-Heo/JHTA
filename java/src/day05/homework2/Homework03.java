package day05.homework2;

import java.util.Random;
import java.util.Scanner;

//3. 가위바위보 게임
//예) 가위:1 바위:2 보자기:3
//  가위바위보를 내세요:1
//
// [결과]
// 나:가위
// 컴퓨터:바위
// ==> 컴퓨터가 이겼습니다.
//출력
//랜덤 
public class Homework03 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String[] ga = { "가위", "바위", "보" };

		System.out.println("가위:1 바위:2 보자기:3");
		System.out.print("가위바위보를 내세요: ");
		int result = sc.nextInt();
		int com = rd.nextInt(3) + 1;
		System.out.println("\n[결과]");
		System.out.println("나: " + ga[result - 1]);
		System.out.println("컴퓨터: " + ga[com - 1]);

		for (int i = 0; i < ga.length; i++) {
			if (com < result || (com == 3 && result == 1)) {
				System.out.println("컴퓨터가 졌습니다.");
				break;
			}
		}
		if (!(com < result || (com == 3 && result == 1))) {
			System.out.println("컴퓨터가 이겼습니다.");
		}

	}
}

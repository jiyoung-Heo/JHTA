package day10.javaApi;

import java.util.Scanner;

/*
 * 주민등록번호를 입력받아 아래의 작업을 할 수 있도록 작성해 보세요.
 * 예) 주민등록번호 입력: 8012112342111
 * 	[출력]
 *   생년월일: 80년 12월 12일
 *   성별: 여
 *   
 *   조건
 *   - 이 입력되면 안됨(indexOf)
 *   모두 숫자로만 입력되어야 함(charAt)
 *   13자리인지 검사(length)
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("주민등록번호 입력: ");
			String pri = sc.next();
			System.out.println("[출력]");
			if (pri.indexOf("-") != -1) {
				System.out.println("-는 입력하실수 없습니다.");
				continue;
			}
			if (pri.length() != 13) {
				System.out.println("주민등록번호는 13자리여야합니다.");
				continue;
			}
			System.out.println(
					"생년월일: " + pri.substring(0, 2) + "년 " + pri.substring(2, 4) + "월 " + pri.substring(4, 6) + "일");
			if (pri.charAt(6) == '2' || pri.charAt(6) == '4') {
				System.out.println("성별: 여");
			} else if (pri.charAt(6) == '1' || pri.charAt(6) == '3') {
				System.out.println("성별: 남");
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

	}
}

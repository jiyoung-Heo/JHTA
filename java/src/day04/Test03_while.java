package day04;

import java.util.Scanner;

/*
 * [다중while문]
 * -형식)
 * while(조건식){
 * 	while(조건식){
 * 		반복수행할 문장;
 * 		...
 * 	}
 * }
 */
public class Test03_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			System.out.println("단입력(종료:0)");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (n < 2 || n > 9) {
				System.out.println("2에서 9사이의 수를 입력하세요.");
				continue;// 초기의 조건절(19라인)으로 분기
			}
			while (i <= 9) {
				System.out.println(n + "*" + i + "=" + n * i);
				i++;
			}
		}
	}
}

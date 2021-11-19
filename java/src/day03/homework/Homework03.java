package day03.homework;

import java.util.Scanner;

//3. 임의의 수를 입력받아 for문을 사용해서 팩토리얼값을 구해 보세요.
//참고 : 4의 팩토리얼값은 4*3*2*1 이다.
//예)
//정수입력:4
//4!=24
public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int fac = 1;
		for (int i = num; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(num + "!" + "=" + fac);
	}
}

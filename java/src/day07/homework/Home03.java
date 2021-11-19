package day07.homework;

import java.util.Scanner;

//3. java.lang패키지의 Math클래스의 max메소드와 min메소드를 사용해서
//두수중 큰값,두수중 작은값을 구해 보세요.
public class Home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("두수중 작은값" + Math.min(num1, num2));
		System.out.println("두수중 큰값" + Math.max(num1, num2));
	}
}

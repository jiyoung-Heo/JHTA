package day06.method;

import java.util.Scanner;

/*
 * 가로세로길이 입력받아 사각형 넓이 구하기
 */
public class Test02_method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로길이입력");
		double w = sc.nextDouble();
		System.out.println("세로길이입력");
		double h = sc.nextDouble();
		// 사각형의 넓이를 구하는 getBox 메소드를 완성해서 프로그램이 실행되도록 해보세요
		double area = getBox(w, h);
		System.out.println("넓이" + area);
//		System.out.println("넓이" + getBox(w, h));
		System.out.println("반지름입력");
		double ban = sc.nextDouble();
		System.out.println("원의 넓이" + result(ban));

	}

	public static double getBox(double w, double h) {
		double nul = w * h;
		return nul;
	}

	public static double result(double ban) {
		double nul = ban * ban * 3.14;
		return nul;
	}
}

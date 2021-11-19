package day10.javaApi;

import java.util.Scanner;

/*
 * [Wrapper 클래스]
 * - 기본자료형(int, char, double,...}을 클래스로 포장해 놓은것
 * - 기본자료형에 관련된 속성과 메소드를 갖는다.
 * 
 * int ---------> Integer
 * char ---------> Character
 * long ---------> Long
 * double ---------> Double
 */
public class Test03_Wrapper {
	public static void main(String[] args) {
		// public static int parseInt(String s) throws NumberFormatException
		String s1 = "100";
		// s1을 int로 바꿔보세요
		int a = Integer.parseInt(s1);
		System.out.println(Integer.parseInt(s1) + 10);
		System.out.println(a + 10);
		// public static String toBinaryString(int i)
		// 100의 2진수값을 출력해보세요.
		System.out.println(Integer.toBinaryString(100));
		Integer i1 = new Integer(10);
		int c = i1;
		Integer i2 = c;
		System.out.println(i2);
		String s3 = "3.24";
		double d = Double.parseDouble(s3);
		System.out.println(d);
		char ff = '1';
		if (Character.isDigit(ff)) {
			System.out.println("숫자입니다");
		}
		// 문자열을 키보드로 입력받아 입력된 문자열에 대문자갯수 소문자갯수 공백의 갯수를 출력해보세요
		/*
		 * aBCD e 대문자갯수: 3 소문자갯수: 2 공백의갯수: 1
		 */
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int big = 0;
		int small = 0;
		int space = 0;
		for (int i = 0; i < num.length(); i++) {
			char re = num.charAt(i);
			if (Character.isUpperCase(re)) {
				big += 1;
			} else if (Character.isLowerCase(re)) {
				small += 1;
			} else if (Character.isWhitespace(re)) {
				space += 1;
			}
		}
		System.out.println("대문자개수: " + big);
		System.out.println("소문자개수: " + small);
		System.out.println("공백개수: " + space);
	}
}

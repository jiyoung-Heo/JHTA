package day13.exception;

import java.util.Scanner;

//강제로 예외 발생시키기
//형식-throw 예외객체;
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("가로길이");
			int x = sc.nextInt();
			System.out.println("세로길이");
			int y = sc.nextInt();
			int area = boxArea(x, y);
			System.out.println("사각형넓이: " + area);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int boxArea(int x, int y) throws Exception {
		if (x <= 0 || y <= 0) {
//			throw new Exception("길이입력오류");
			Exception e = new Exception("길이오류!");
			throw e;

		}
		int area = x * y;
		return area;
	}
}

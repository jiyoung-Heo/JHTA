package day06.class1;

import java.util.Scanner;

/*
 * 반지름을 입력받아 원의 넓이를 구하는 기능을 클래스를 만들어서 구현해 보세요.
 */
public class Test03_Quiz {
	public static void main(String[] args) {
		Circle cc = new Circle();

		cc.input();
		cc.math();
		cc.show();

	}
}

class Circle {
	private int half;
	private double result;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		this.half = sc.nextInt();
	}

	public void math() {
		result = half * half * 3.14;
	}

	public void show() {
		System.out.println("입력결과" + result);
	}
}

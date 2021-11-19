package day09.homework;

import java.util.Scanner;

//아래의 인터페이스를 상속받아 도형의 넓이를 클래스를 만들고 사용해 보세요.
public class Home01 {
	public static void main(String[] args) {
		Rect33 rc = new Rect33();
		rc.input();
		rc.printArea();
	}
}

interface MyArea {
	void input();// 데이터 키보드로 입력받는 기능

	void printArea();// 넓이 구해서 출력하는 기능
}

class Rect33 implements MyArea {
	private int x;
	private int y;

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	public void printArea() {
		int a = 0;
		a = x * y;
		System.out.println(a);
	}
}
package day06.class1;

/*
 * [객체지향 프로그래밍]
 * - 모든 작업을 객체화해서 프로그래밍하는 기법
 * - 객체지향 프로그래밍에서는 모든 작업을 클래스로 구현한다.
 * - 클래스 만드는 형식
 *  class 클래스명{
 *  	멤버변수 선언;
 *  	멤버메소드(){
 *  		..
 *  	}
 *  }
 *  - 클래스를 사용하기 위해서는 객체(인스턴스)를 생성해야 한다.
 *  - 객체를 생성하기 위한 형식
 *   클래스명 객체명 new 클래스명();
 */
//public class Test01 {
//	public static void main(String[] args) {
//	}
//
//}
public class Test01 {
	public static void main(String[] args) {
		Box b = new Box();
		b.setPosition(100, 200);
		b.draw();
		b.setColor("RED");
		b.paint();
		Box c = new Box();
		c.setPosition(200, 300);
		c.draw();

	}
}

class Box {
	private int x;
	private int y;
	private String color;

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println(x + "," + y + "의 위치에 사각형 그리기");
	}

	public void paint() {
		System.out.println(color + "색상으로 사각형 칠하기");
	}
}

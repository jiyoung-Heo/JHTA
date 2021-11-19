package day09;

public class Test03_Quiz {
	public static void main(String[] args) {
		Rect2 rc = new Rect2(100, 200);
		System.out.println(rc.getArea());
	}
}

abstract class MyArea {
	protected int x;
	protected int y;

	public MyArea(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract int getArea();
}

class Rect2 extends MyArea {
	public Rect2(int x, int y) {
		super(x, y);
	}

	public int getArea() {
		return x * y;
	}
}
//myArea클래스의 getArea메소드를 추상클래스로 만들어보세요
//MyArea클래스를 상속받아 사각형 넓이를 구하는 자식클래스를 만들고 사용해보세요

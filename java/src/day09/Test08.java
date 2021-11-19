package day09;

public class Test08 {
	public static void main(String[] args) {
		Rect4 r = new Rect4();
		r.draw();
		r.paint();
		r.resize();
		r.setPoint(100, 200);
	}
}

//rect3을 상속받는 클래스 Rect2를 만들고 사용해보세요

interface Shape5 {
	void draw();

	void paint();
}

interface Point {
	void setPoint(int x, int y);
}

interface Rect3 extends Shape5, Point {// 인터페이스까지 상속할때는 extends를 사용한다.
	void resize();
}

class Rect4 implements Rect3 {
	public void draw() {
		System.out.println("사각형");
	}

	public void paint() {
		System.out.println("빨간색");
	}

	public void setPoint(int x, int y) {
		System.out.println(x + " " + y + "좌표");
	}

	public void resize() {
		System.out.println("다시정하기");
	}

}

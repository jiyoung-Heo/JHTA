package day09;

/*
 * [추상클래스]
 * - 추상메소드를 포함하는 클래스
 * - 객체를 생성할수는 없고 오로지 상속의 목적으로 만든다.
 * - 만드는 형식: 클래스명에 abstract를 붙여서 만든다.
 * [추상메소드]
 * - body(몸체)를 갖지 않는 메소드 
 * - 추상메소드는 자식클래스에서 반드시 오버라이딩해야 한다.★★★
 * - 만드는형식: 메소드명앞에 abstract를 붙이고 body부분을 만들지 않는다.
 * 예)
 * class MyClass{//추상클래스
 * 		public abstract void print();//추상메소드
 * }
 * 
 * - 만드는 이유: 자식클래스에서 공통으로 반드시 구현해야 할 기능의 메소드를 가져야 할 경우 추상메소드를 만든다.
 * 
 */
public class Test02_abstract {
	public static void main(String[] args) {
		Rect rt = new Rect(100, 200);
		rt.draw();
		// Shape s = new Shape(); 에러-> 추상클래스는 객체생성을 할 수 없음
		Shape s = rt;// 자식객체 참조는 가능
		rt.draw();
	}
}

//shape를 상속받아 draw메소드를  오버라이딩하는 Rect 클래스를 만들어 보세요.
//draw메소드는 x,y좌표에 사각형을 그려요 라고 출력되도록
abstract class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract void draw();
}

class Rect extends Shape {
	public Rect(int x, int y) {
		super(x, y);
	}

	public void draw() {
		System.out.println(getX() + "," + getY() + "좌표에 사각형을 그려요");
	}
}

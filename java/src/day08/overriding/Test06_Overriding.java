package day08.overriding;

/*
 * [오버라이딩(***)]
 * - 부모클래스의 메소드를 자식클래스에서 수정하고자 할때 오버라이딩을 한다.
 * - 만드는 방법
 * 	 부모클래스의 메소드명, 파라미터갯수, 타입 모두 일치해야한다.
 * - 오버라이딩할때 접근지정자는 부모의 접근지정자보다 범위가 좁아지면 안된다.
 * 예)
 * 	class AA{
 * 		public void show(){
 * 	}
 * 	class BB extends AA{
 * 		public void show(){}//오버라이딩
 * 		public void show(String a){}//오버로딩
 */
public class Test06_Overriding {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		r.draw();// 자식에서 오버라이딩된 메소드 호출
		r.draw("빨강");
		Circle c = new Circle();
		c.setXY(300, 400);
		c.draw();
	}
}

class Shape {
	protected int x;
	protected int y;

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println("x: " + x + "y: " + y + " 위치에 도형 그리기");
	}
}

class Rect extends Shape {
	public void draw() {// 오버라이딩
		System.out.println("x: " + x + "y: " + y + " 위치에 사각형 그리기");
	}

	public void draw(String color) {// 오버로딩
		System.out.println("x: " + x + ",y: " + y + "위치에 " + color + " 색상의 사각형 그리기");
	}
}

class Circle extends Shape {
	public void draw() {// 오버라이딩
		System.out.println("x: " + x + "y: " + y + " 위치에 사각형 그리기");
	}
}
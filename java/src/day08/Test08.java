package day08;

/*
 * [클래스간의 형변환]
 * - 클래스간에는 형변환이 안되지만 상속관계에서는 형변환이 가능하다.
 * - 부모클래스는 자식클래스를 참조할 수 있지만 자식클래스에서 추가된 멤버는 참조할 수 없다.
 *   단 오버라이딩된 메소드는 참조가 가능하다.
 * - 자식클래스에서 부모클래스를 참조할 수는 있지만 이때는 강제형변환을 해야 한다.
 */
public class Test08 {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		r.draw();
		Shape s = r;// 가능
		s.setXY(300, 300);
		s.draw();// 자식에서 오버라이딩된 메소드가 호출됨.
//		s.paintRect("Red");//에러->자식에서 추가된 메소드는 접근못함
		Circle c = new Circle();
		c.setXY(500, 600);
		c.draw();
		Shape s1 = c;
		s1.draw();
		Circle c1 = (Circle) s1;// 자식객체가 부모객체를 참조할때는 반드시 강제형변환 해야 한다.
		c1.draw();
		c1.paintCircle("blue");
//		Circle c2 = r;//에러
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

	public void paintRect(String color) {
		System.out.println(color + "색상으로 사각형 칠하기");
	}
}

class Circle extends Shape {
	public void draw() {// 오버라이딩
		System.out.println("x: " + x + "y: " + y + " 위치에 타원 그리기");
	}

	public void paintCircle(String color) {
		System.out.println(color + "색상으로 타원 칠하기");
	}
}
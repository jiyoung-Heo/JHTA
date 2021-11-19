package day08;

public class Test09 {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		Circle c = new Circle();
		c.setXY(300, 400);
		printer(r);
		printer(c);
		boolean a = r instanceof Rect;// r이 Rect의 객체 타입인가? true/false
		System.out.println("a: " + a);
		if (r instanceof Shape) {
			System.out.println("변수 r 은 Shape 타입입니다");
		}
		if (c instanceof Shape) {
			System.out.println("변수 c 은 Shape 타입입니다");
		}
		// 프린터로 도형을 칠하는 paint메소드를 만들어보세요.
		paint(r);// paint메소드에서 paintRect또는 paintCircle이 호출되도록
		paint(c);
	}

	public static void paint(Shape a) {
		if (a instanceof Rect) {
			Rect c1 = (Rect) a;
			c1.paintRect("red");
		}
		if (a instanceof Circle) {
			Circle c1 = (Circle) a;
			c1.paintCircle("blue");
		}
	}

	public static void printer(Shape a) {
		System.out.println("프린터로 아래 도형출력하기");
		a.draw();
	}
}

package day09;

/*
 * [인터페이스(***)]
 * - 자식클래스들이 가져야 할 기능들을 목록을 제시(뼈대, 기본틀 제공)
 * - 상수와 추상메소드로 이루어짐
 * 만드는형식)
 *  interface 인터페이스명{
 * 		상수;
 * 		추상메소드();
 *  }
 *  - 인터페이스는 객체를 생성할 수 없다.(자식객체 참조는 가능)
 *  - 사용이유
 *  	1. 자식클래스가 가져야 할 기능들의 뼈대를 제공
 *  	2. 클래스는 다중상속이 지원되지 않지만 인터페이스를 활용하여 다중상속을 지원한다.
 *  	3. 인터페이스를 적절히 사용함으로써 유지보수가 수월해 진다.
 */
public class Test05_interface {
	public static void main(String[] args) {
		Box1 b1 = new Box1();
		b1.draw();
		b1.paint();
		Circle1 c1 = new Circle1();
		c1.draw();
		c1.paint();
		Shape2 s = c1;
		s.draw();
		s.paint();
	}
}

interface Shape2 {
	double PI = 3.14;// 상수이다. public static final이 생략됨

	public abstract void draw();

	void paint();// public abstract 생략가능
}

class Box1 implements Shape2 {
	public void draw() {
		System.out.println("사각형 그리기");
	}

	public void paint() {// public 안써주면 default로 적용된다. public보다 default가 좁은 개념이기 때문에 자식에게 사용할 수 없다.-자식이 더
							// 넓은거면 괜찮음
		System.out.println("사각형 칠하기");
	}
}

class Circle1 implements Shape2 {
	public void draw() {
		System.out.println("타원 그리기");
	}

	public void paint() {
		System.out.println("타원 칠하기");
	}
}

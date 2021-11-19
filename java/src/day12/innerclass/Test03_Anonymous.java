package day12.innerclass;

/*
 * 익명의 내부클래스(*)
 * - 이름이 없는 클래스
 * - 추상클래스나 인터페이스를 상속받아 만든 클래스가 딱 한번만 사용되고 더이상 사용되지 않을때 익명의
 * 	 내부클래스를 만들어 사용한다.
 * - 만드는 방법
 *   인터페이스명(또는 추상클래스명) 객체명 = new 인터페이스명(또는추상클래스명)(){
 *   	추상메소드오버라이딩(){}
 *   };
 */
interface Shape {
	void draw();
}

public class Test03_Anonymous {
	public static void main(String[] args) {
		// Shape인터페이스를 구현하는 클래스를 로컬내부클래스로 만들고 메소드를 호출해보세요.
		class Circle implements Shape {
			@Override
			public void draw() {
				System.out.println("원을 그린다");
			}
		}
		Circle c = new Circle();
		c.draw();
		Circle c2 = new Circle();
		c2.draw();
		/*
		 * 인터페이스명(또는 추상클래스명) 객체명 = new 인터페이스명(또는추상클래스명)(){ 추상메소드오버라이딩(){} };
		 */
		Shape s = new Shape() {// 이름이 없는 클래스임
			public void draw() {
				System.out.println("타원그리기");
			}
		};
		// 이름이 없는 클래스이기 때문에 객체를 만들 수 없어서 딱 한번만 쓸수있다.
		s.draw();
		new Shape() {
			public void draw() {
				System.out.println("직선그리기");
			}
		}.draw();
	}
}

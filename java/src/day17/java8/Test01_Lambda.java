package day17.java8;

/*
 * [람다식]
 * - jdk1.8버전에서 추가된 기능
 * - 메소드를 하나의 식으로 간단하게 표현한것
 * - 형식
 *   (자료형 변수)-> (메소드 실행코드;)
 * - 함수형 인터페이스에서만 람다식을 사용할 수 있다.
 */
public class Test01_Lambda {
	public static void main(String[] args) {
		// myMath 인터페이스를 익명의 내부틀래스로 만들고 add메소드를 호출해보세요

		Mymath mm = new Mymath() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		// 람다식으로 바꿔보기
//		Mymath m2 = (int a, int b)->{return a+b;};
		// 매개변수타입 생략가능, 실행코드가 return문 하나인경우 return 생략가능
		Mymath m2 = (a, b) -> {
			return a + b;
		};
		System.out.println("두수합" + m2.add(3, 4));
		System.out.println("큰값" + m2.max(2, 1));
		Shape m3 = new Shape() {
			public void draw() {
				System.out.println("사각형그리기");
			}
		};
		// Shape객체를 람다식을 사용해서 만들고 메소드를 호출해보세요
		Shape m4 = () -> {
			System.out.println("타원그리기");
		};
		m3.draw();
		m4.draw();
		// MyCircle객체를 만들고 메소드를 호출해보세요
		// MyCilcle c = (double r)->{return r*r*3.14;};
		MyCilcle a = r -> r * r * 3.14;
		System.out.println(a.circle(3));
	}
}

@FunctionalInterface
interface Mymath {
	int add(int a, int b);

	// 디폴트메소드-> jdk1.8버전에 추가된 기능
	default int max(int a, int b) {
		return (a > b) ? a : b;
	}
}

@FunctionalInterface
interface MyCilcle {
	double circle(double r);
}

@FunctionalInterface
interface Shape {
	void draw();
}
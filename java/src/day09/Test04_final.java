package day09;

/*
 * - final의 용도
 * 1. 변수 앞에 final을 붙이는 경우 -->변수를 상수로 만든다.
 * 	 예) final double PI = 3.14;
 * 2. 메소드명앞에 final을 붙이는 경우 --> 오버라이딩 불가
 * 3. 클래스명 앞에 final을 붙이는 경우 --> 상속 불가
 */
final class AA {
	public final void print() {
		System.out.println("hello");
	}
}

//class BB extends AA {// AA클래스 상속할 수 없음
//	public void print() {
//		System.out.println("안녕");
//	}
//}

public class Test04_final {
	public static void main(String[] args) {

	}
}

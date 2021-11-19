package day06.class1;

/*
 * [생성자]
 * -객체가 생성될 때 자동으로 호출되는 메소드
 * - 주로 멤버변수값을 초기화하려는 목적으로 만든다.
 * - 만드는 형식
 * 1) 클래스명과 동일한 이름으로 메소드 이름을 만든다
 * 2) 리턴값이 없으며 void를 쓰지 않는다.
 * 예)
 * class AA{
 * 		public AA(){}//생성자
 * 		public AA(inta){//생성자
 * 		..
 * 		}
 * }
 * 
 */
public class Test04_Constructor {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.printA();
		AA bb = new AA(10);
		bb.printA();
	}
}

class AA {
	private int a;

	public AA() {
		System.out.println("AA생성자입니다...");
	}

	public AA(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("a: " + a);
	}

}

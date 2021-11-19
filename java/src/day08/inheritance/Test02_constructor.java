package day08.inheritance;

/*
 * [상속에서의 생성자]
 * - 자식객체가 생성될때 부모생성자가 먼저 호출되고 자식생성자가 호출된다.
 * - 부모생성자에 매개변수가 있다면 자식생성자에서 부모생성자를 호출해야 한다.
 *   부모생성자를 호출할때는 super()를 사용한다.
 *   
 */
public class Test02_constructor {
	public static void main(String[] args) {
		Child c = new Child();
		Child c1 = new Child(10);
		c1.printA();
	}
}

class Parent {
	private int a;

	public Parent() {
		System.out.println("부모생성자");
	}

	public Parent(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("a: " + a);
	}
}

class Child extends Parent {
	// super(); 부모생성자 호출
	public Child() {
		System.out.println("자식생성자");
	}

	public Child(int a) {
		super(a);
	}
}
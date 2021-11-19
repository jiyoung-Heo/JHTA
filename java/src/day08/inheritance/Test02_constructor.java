package day08.inheritance;

/*
 * [��ӿ����� ������]
 * - �ڽİ�ü�� �����ɶ� �θ�����ڰ� ���� ȣ��ǰ� �ڽĻ����ڰ� ȣ��ȴ�.
 * - �θ�����ڿ� �Ű������� �ִٸ� �ڽĻ����ڿ��� �θ�����ڸ� ȣ���ؾ� �Ѵ�.
 *   �θ�����ڸ� ȣ���Ҷ��� super()�� ����Ѵ�.
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
		System.out.println("�θ������");
	}

	public Parent(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("a: " + a);
	}
}

class Child extends Parent {
	// super(); �θ������ ȣ��
	public Child() {
		System.out.println("�ڽĻ�����");
	}

	public Child(int a) {
		super(a);
	}
}
package day09;

public class Test07_Quiz {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.walk();
		d.speak();
		d.work();
		Human a = new Human();
		a.walk();
		a.speak();
		a.work();
		Human h = (Human) a;
		h.work();
	}
}

interface Animal44 {
	void walk();

	void speak();

	void work();
}

class Dog implements Animal44 {
	public void walk() {
		System.out.println("�׹߷� �ȱ�");
	}

	public void speak() {
		System.out.println("����");
	}

	public void work() {
		System.out.println("���� ����");
	}
}

class Human implements Animal44 {
	public void walk() {
		System.out.println("�ι߷� �ȱ�");
	}

	public void speak() {
		System.out.println("�ȳ�");
	}

	public void work() {
		System.out.println("�����ϱ�");
	}
}

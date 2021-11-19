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
		System.out.println("³×¹ß·Î °È±â");
	}

	public void speak() {
		System.out.println("¿ù¿ù");
	}

	public void work() {
		System.out.println("²¿¸® Èçµé±â");
	}
}

class Human implements Animal44 {
	public void walk() {
		System.out.println("µÎ¹ß·Î °È±â");
	}

	public void speak() {
		System.out.println("¾È³ç");
	}

	public void work() {
		System.out.println("°øºÎÇÏ±â");
	}
}

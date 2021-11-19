package day08.homework;

//1.
//핸드폰클래스
//속성:모델명,가격,색상
//
//위의 클래스를 상속받는 디카폰클래스
//속성:모델명,가격,색상,화소수
//위의 구조를 갖는 클래스를 만들고 사용해 보세요.
public class Home01 {
	public static void main(String[] args) {
		Dica dc = new Dica(1, 10000, "red", 1800);
		dc.show();
	}
}

class Phone {
	protected int num;
	protected int price;
	protected String color;

	public Phone(int num, int price, String color) {
		this.num = num;
		this.price = price;
		this.color = color;
	}

//	public String show() {
//		System.out.println(num+price+color);
//	}
}

class Dica extends Phone {
	private int pixel;

	public Dica(int num, int price, String color, int pixel) {
		super(num, price, color);
		this.pixel = pixel;
	}

	public void show() {
		System.out.println(num + " " + price + " " + color + " " + pixel);
	}
}
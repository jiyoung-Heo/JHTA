package day08.homework;

//1.
//�ڵ���Ŭ����
//�Ӽ�:�𵨸�,����,����
//
//���� Ŭ������ ��ӹ޴� ��ī��Ŭ����
//�Ӽ�:�𵨸�,����,����,ȭ�Ҽ�
//���� ������ ���� Ŭ������ ����� ����� ������.
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
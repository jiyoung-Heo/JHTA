package day11.homework;

public class Book {
	private int num;
	private String name;
	private int price;

	public Book(int num, String name, int price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public String name() {
		return name;
	}

	public int price() {
		return price;
	}

	@Override
	public String toString() {
		return "������ȣ: " + num + "\n�����̸�: " + name + "\n��������: " + price;
	}
}
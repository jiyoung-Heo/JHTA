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
		return "도서번호: " + num + "\n도서이름: " + name + "\n도서가격: " + price;
	}
}
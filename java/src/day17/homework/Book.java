package day17.homework;

public class Book implements Comparable<Book> {
	int num;
	int price;
	String title;

	public Book(int num, int price, String title) {
		super();
		this.num = num;
		this.price = price;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "������ȣ: " + num + ", ����: " + price + ", ������: " + title;
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

}

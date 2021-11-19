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
		return "도서번호: " + num + ", 가격: " + price + ", 도서명: " + title;
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

}

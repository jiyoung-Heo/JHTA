package day12.homework;

/**
 * 도서정보:도서번호,도서명,가격
 * 
 * @author H.gyoung
 *
 */
public class Home01Book {
	private int num;
	private String name;
	private int price;

	public Home01Book(int num, String name, int price) {
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

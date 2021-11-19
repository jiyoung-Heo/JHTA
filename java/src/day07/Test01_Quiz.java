package day07;

/* 
 * 도서정보를 갖는 클래스를 만들고 값 저장후 데이터가 출력되도록 해보세요
 */
public class Test01_Quiz {
	public static void main(String[] args) {
		Book bk = new Book("자바따라잡기", 10000, "홍길동");// 생성자를 사용하여 도서명, 가격, 저자 멤버변수에 초기화하기
//		Book bk1 = new Book();// 생성자를 사용하여 도서명, 가격, 저자 멤버변수에 초기화하기
		bk.printInfo();// 도서정보 출력하기

	}
}

class Book {
	private String cover;
	private int price;
	private String name;

//	public Book() {
//	}

	public Book(String cover, int price, String name) {
		this.cover = cover;
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(cover + " " + price + " " + name);
	}
}

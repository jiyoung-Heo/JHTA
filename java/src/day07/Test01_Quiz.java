package day07;

/* 
 * ���������� ���� Ŭ������ ����� �� ������ �����Ͱ� ��µǵ��� �غ�����
 */
public class Test01_Quiz {
	public static void main(String[] args) {
		Book bk = new Book("�ڹٵ������", 10000, "ȫ�浿");// �����ڸ� ����Ͽ� ������, ����, ���� ��������� �ʱ�ȭ�ϱ�
//		Book bk1 = new Book();// �����ڸ� ����Ͽ� ������, ����, ���� ��������� �ʱ�ȭ�ϱ�
		bk.printInfo();// �������� ����ϱ�

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

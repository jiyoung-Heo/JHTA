package day17.homework;

import java.util.ArrayList;
import java.util.stream.Stream;

//���������� ���� Ŭ����(������ȣ,����,������)�� ����� ArrayList�� �����մϴ�..
//
//1. ��ü ���������� ����ϼ���
//2. ������ ���� ������ �����ؼ� ��µǵ��� �غ�����.
//3. ������ 20000�̻��� ���� ������ ������ �������� �������������ؼ� ����� ������.
//4. ��ü �������� �������������ؼ� ��µǵ��� �غ�����
public class Home01 {
	public static void main(String[] args) {
		Book hong = new Book(1, 25_000, "ȫ�浿��");
		Book gana = new Book(2, 19_000, "������");
		Book chec = new Book(3, 30_000, "å");
		ArrayList<Book> list = new ArrayList<>();
		list.add(hong);
		list.add(gana);
		list.add(chec);
		Stream<Book> st = list.stream();
		System.out.println("<��ü �������� ���>");
		// forEach: �ݺ�ó���Ҷ� ���ִ� �Լ�.
		st.forEach(s -> System.out.println(s));

		System.out.println("\n������ ���� ������ �����ؼ� ���");
		Stream<Book> st2 = list.stream();
		// sorted(): ��ü�� �־��� Comparator�� ���� ����
		st2.sorted((a, b) -> {
			// a�� �� b�� ���Ͽ� �������� ���� �� return���ش�.
			return Integer.compare(a.getPrice(), b.getPrice());
			// return���� �� ����ϱ�
		}).forEach(s -> System.out.println(s));

		System.out.println("\n������ 2���� �̻��� ������ ������ �������� ������������");
		Stream<Book> st3 = list.stream();
		// book ��ü�� ������ �޾ƿͼ� 2���� �̻� �ɷ���. ���� sorted�� ����Ͽ� ������������ �迭��.
		st3.filter((t) -> (t.getPrice() >= 20000)).sorted((a, b) -> {
			return Integer.compare(a.getPrice(), b.getPrice()) * -1;
		}).forEach(s -> System.out.println(s));

		System.out.println("\n��ü �������� ������������");
		Stream<Book> st4 = list.stream();
		// Book ���� compareTo �������̵��� �޼ҵ� �״�� �޾ƿͼ� ���� map���ְ� ������ش�.
		st4.sorted().map(p -> p.getTitle()).forEach(c -> System.out.println(c));

//		�̰Ŵ� �������̵� �������� �ϴ¹��!
//		st4.sorted((a, b) -> a.getTitle().compareTo(b.getTitle())).map(a -> a.getTitle())
//				.forEach(s -> System.out.println(s));

	}
}

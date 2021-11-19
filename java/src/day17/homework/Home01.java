package day17.homework;

import java.util.ArrayList;
import java.util.stream.Stream;

//도서정보를 갖는 클래스(도서번호,가격,도서명)를 만들고 ArrayList에 저장합니다..
//
//1. 전체 도서정보를 출력하세요
//2. 가격이 낮은 순으로 정렬해서 출력되도록 해보세요.
//3. 가격이 20000이상이 도서 정보를 가격을 기준으로 내림차순정렬해서 출력해 보세요.
//4. 전체 도서명을 오름차순정렬해서 출력되도록 해보세요
public class Home01 {
	public static void main(String[] args) {
		Book hong = new Book(1, 25_000, "홍길동전");
		Book gana = new Book(2, 19_000, "가나다");
		Book chec = new Book(3, 30_000, "책");
		ArrayList<Book> list = new ArrayList<>();
		list.add(hong);
		list.add(gana);
		list.add(chec);
		Stream<Book> st = list.stream();
		System.out.println("<전체 도서정보 출력>");
		// forEach: 반복처리할때 써주는 함수.
		st.forEach(s -> System.out.println(s));

		System.out.println("\n가격이 낮은 순으로 정렬해서 출력");
		Stream<Book> st2 = list.stream();
		// sorted(): 객체를 주어진 Comparator에 따라 정렬
		st2.sorted((a, b) -> {
			// a의 를 b와 비교하여 오름차순 정렬 후 return해준다.
			return Integer.compare(a.getPrice(), b.getPrice());
			// return받은 값 출력하기
		}).forEach(s -> System.out.println(s));

		System.out.println("\n가격이 2만원 이상의 도서를 가격을 기준으로 내림차순정렬");
		Stream<Book> st3 = list.stream();
		// book 객체의 가격을 받아와서 2만원 이상만 걸러줌. 이후 sorted를 사용하여 내림차순으로 배열함.
		st3.filter((t) -> (t.getPrice() >= 20000)).sorted((a, b) -> {
			return Integer.compare(a.getPrice(), b.getPrice()) * -1;
		}).forEach(s -> System.out.println(s));

		System.out.println("\n전체 도서명을 오름차순정렬");
		Stream<Book> st4 = list.stream();
		// Book 에서 compareTo 오버라이딩한 메소드 그대로 받아와서 제목만 map해주고 출력해준다.
		st4.sorted().map(p -> p.getTitle()).forEach(c -> System.out.println(c));

//		이거는 오버라이딩 안했을때 하는방법!
//		st4.sorted((a, b) -> a.getTitle().compareTo(b.getTitle())).map(a -> a.getTitle())
//				.forEach(s -> System.out.println(s));

	}
}

package day11.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 1.도서정보를 갖는 클래스를 만들고 추가,검색,수정,삭제,전체보기 기능을
만들어 보세요.HashMap에 저장(도서번호가 key로 저장)
도서정보:도서번호,도서명,가격

1.도서정보
 1)추가
 2)검색
 3)수정
 4)삭제
 5)전체보기
 */
public class Home02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		HashMap<Integer,V>;
		boolean flag = false;
		HashMap<Integer, Book> map = new HashMap<Integer, Book>();
		while (!flag) {
			System.out.println("<도서정보>");
			System.out.println("1.추가 2. 검색 3. 수정 4. 삭제 5. 전체보기 6. 종료");
			System.out.println("메뉴");
			switch (scan.nextInt()) {
			case 1: {
				// 추가
				System.out.print("도서번호를 입력하세요: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find == null) {
					System.out.print("도서명을 입력하세요: ");
					String name = scan.next();
					System.out.print("도서가격을 입력하세요: ");
					int price = scan.nextInt();
					Book info = new Book(num, name, price);
					map.put(num, info);
					System.out.println("추가완료되었습니다.");
				} else {
					System.out.println("중복된 도서번호가 있습니다. 다시 입력해주세요");
				}
				System.out.println();
				break;

			}
			case 2: {
				// 검색
				System.out.print("검색할 도서번호를 입력하세요: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					System.out.println(find);
				} else {
					System.out.println("도서번호가 존재하지 않습니다.");
				}
				System.out.println();
				break;
			}
			case 3: {
				// 수정
				if (map == null) {
					System.out.println("도서정보가 전혀 존재하지 않아 수정할 수 없습니다. 먼저 도서정보를 추가해주세요.");
				}
				System.out.print("수정할 도서번호를 입력하세요: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					System.out.print("새로운 도서명을 입력하세요: ");
					String newName = scan.next();
					System.out.print("새로운 도서가격을 입력하세요: ");
					int newPrice = scan.nextInt();
					Book newInfo = new Book(num, newName, newPrice);
					map.replace(num, newInfo);
				} else {
					System.out.println("도서번호가 존재하지 않습니다.");
				}
				System.out.println();
				break;
			}
			case 4: {
				// 삭제
				System.out.print("삭제할 도서번호를 입력하세요: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					map.remove(num);
					System.out.println("삭제완료되었습니다.");
				} else {
					System.out.println("도서번호가 존재하지 않습니다.");
				}
				System.out.println();
				break;
			}
			case 5: {
				// 전체보기
				Collection<Book> co = map.values();
				Iterator<Book> it = co.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				if (!it.hasNext()) {
					System.out.println("도서정보가 전혀 존재하지 않습니다.");
				}
				break;
			}
			case 6: {
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				break;
				// 종료
			}
			default:
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
	}

}

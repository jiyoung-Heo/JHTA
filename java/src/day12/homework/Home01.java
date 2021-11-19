package day12.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 1.도서정보를 갖는 클래스를 만들고 추가,검색,수정,삭제,전체보기 기능을 만들어 보세요.HashMap에 저장(도서번호가 key로 저장)
 * 도서정보:도서번호,도서명,가격
 * 
 * @author H.gyoung
 *
 */
public class Home01 {

	public static void main(String[] args) {
		String a = "dd";
		System.out.println(a.toString());
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		HashMap<Integer, Home01Book> map = new HashMap<>();

		while (flag == false) {
			println("<도서정보 관리 프로그램>");
			println("1.추가 2. 검색 3. 수정 4. 삭제 5. 전체보기 6. 종료");
			print("원하는 메뉴: ");

			switch (sc.nextInt()) {
			case 1: {
				// 추가
				print("도서번호를 입력하세요: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					print("도서명을 입력하세요: ");
					String name = sc.next();
					print("도서가격을 입력하세요: ");
					int price = sc.nextInt();
					Home01Book info = new Home01Book(num, name, price);
					map.put(num, info);
					println("추가완료되었습니다.");
				} else {
					println("중복된 도서번호가 있습니다. 다시 입력해주세요");
				}
				println();
				break;
			}
			case 2: {
				// 검색
				print("검색할 도서번호를 입력하세요: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("도서번호가 존재하지 않습니다.");
				} else {
					println(find);
				}
				println();
				break;
			}
			case 3: {
				// 수정
				if (isNull(map)) {
					println("도서정보가 전혀 존재하지 않아 수정할 수 없습니다. 먼저 도서정보를 추가해주세요.");
				}
				print("수정할 도서번호를 입력하세요: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("도서번호가 존재하지 않습니다.");
				} else {
					print("새로운 도서명을 입력하세요: ");
					String newName = sc.next();
					print("새로운 도서가격을 입력하세요: ");
					int newPrice = sc.nextInt();
					Home01Book newInfo = new Home01Book(num, newName, newPrice);
					map.replace(num, newInfo);
				}
				println();
				break;
			}
			case 4: {
				// 삭제
				print("삭제할 도서번호를 입력하세요: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("도서번호가 존재하지 않습니다.");
				} else {
					map.remove(num);
					println("삭제되었습니다.");
				}
				println();
				break;
			}
			case 5: {
				// 전체보기
				Collection<Home01Book> co = map.values();
				Iterator<Home01Book> it = co.iterator();
				int cnt = 0;
				while (it.hasNext()) {
					println(it.next());
					cnt++;
				}
				if (cnt == 0) {
					println("도서정보가 전혀 존재하지 않습니다.");
				}
				break;
			}
			case 6: {
				println("프로그램을 종료합니다.");
				flag = true;
				break;
				// 종료
			}
			default:
				println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
		sc.close();
	}

	/**
	 * null check 함수.
	 * 
	 * @param obj
	 * @return null일 경우 true를 리턴한다.
	 */
	private static boolean isNull(Object obj) {
		return obj == null ? true : false;
	}

	/**
	 * 엔터 없는 출력문
	 * 
	 * @param str
	 */
	private static void print(String str) {
		System.out.print(str);
	}

	/**
	 * 출력문.
	 * 
	 */
	private static void println() {
		System.out.println();
	}

	private static void println(String str) {
		System.out.println(str);
	}

	private static void println(Home01Book book) {
		System.out.println(book);
	}

}

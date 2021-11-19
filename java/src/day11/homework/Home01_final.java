package day11.homework;

import java.util.ArrayList;
import java.util.Scanner;

//<구현한 기능>
//회원추가기능
//- 회원 추가하기, 중복된 아이디라면 다시 입력받기, 뒤로가기
//회원검색기능
//- 아이디로 검색하면 모든 정보 출력, 회원이 한명도 없는 상태라면 회원없음 출력, 입력한 아이디의 회원이 없으면 존재하지 않는다고 출력
//회원삭제기능
//- 아이디를 입력하면 해당 정보 삭제, 입력한 아이디의 회원이 없으면 존재하지 않는다고 출력
//회원수정기능
//- 아이디를 입력받아 비밀번호 이메일 전화번호를 수정하기, 입력한 아이디의 회원이 없으면 존재하지 않는다고 출력
//종료기능
//- 종료
//다른번호 입력했을 때 메뉴선택창으로 보내기
public class Home01_final {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		boolean flag = false;

		while (flag == false) {
			boolean find = false;
			println("<회원관리 프로그램>");
			println("1.회원추가 2. 회원검색 3. 회원삭제 4. 회원수정 5. 종료");
			print("원하는 메뉴: ");

			label: switch (sc.nextInt()) {
			case 1: {
				boolean isId = false;
				println("[회원추가] //  ..을 누르면 메뉴로 돌아갑니다.");
				String id = "";
				do {
					isId = false;
					print("아이디: ");
					id = sc.next();

//					boolean result = list.contains(new Home01_per(id));
//					if (result) {
//						println("중복된 아이디입니다. 다시 입력해주세요. //  ..을 누르면 메뉴로 돌아갑니다.");
//						isId = true;
//					}

					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							println("중복된 아이디입니다. 다시 입력해주세요. //  ..을 누르면 메뉴로 돌아갑니다.");
							isId = true;
						}
					}
					if (id.equals("..")) {
						println("회원 추가를 종료합니다.");
						break label;
					}
				} while (isId);
				print("비밀번호: ");
				String pwd = sc.next();
				print("이메일: ");
				String email = sc.next();
				print("전화번호: ");
				String phone = sc.next();
				Home01_per hp = new Home01_per(id, pwd, email, phone);
				list.add(hp);
				println("추가완료되었습니다.\n");
				break;
			}

			case 2: {
				if (list.size() == 0) {
					println("회원정보가 전혀 존재하지 않습니다.\n");
					break;
				}
				print("검색할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						println("====검색결과====");
						println(allFind);
						find = true;
						break;
					}
				}
				if (find == false) {
					println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				continue;
			}

			case 3: {
				print("삭제할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						println("삭제되었습니다.\n");
						find = true;
						break;
					}
				}
				if (find == false) {
					println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				continue;

			}

			case 4: {
				print("수정할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						print("변경할 비밀번호를 입력하세요: ");
						String rePwd = sc.next();
						print("변경할 이메일을 입력하세요: ");
						String reEmail = sc.next();
						print("변경할 전화번호를 입력하세요: ");
						String rePhone = sc.next();
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						list.set(i, rename);
						find = true;
						break;
					}
				}
				if (find == false) {
					println("해당 아이디가 존재하지 않습니다.\n");
				}
				break;
			}

			case 5: {
				println("프로그램을 종료합니다.");
				flag = true;
				break;
			}

			default:
				println("번호를 잘못 선택하셨습니다.\n");
			}

		}
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

	private static void println(Home01_per book) {
		System.out.println(book);
	}
}
//1.회원관리 기능을 갖는 프로그램 만들어 보세요.
//회원정보 : 아이디,비밀번호,이메일,전화번호
//회원정보를 갖는 클래스를 만들고 ArrayList에 저장하고 아래의 기능을
//작성해 보세요.
//회원추가기능
//회원검색기능(아이디로 검색하면 모든 정보 출력)
//회원삭제기능(아이디를 입력하면 해당 정보 삭제) - remove메소드
//회원수정기능(아이디를 입력받아 비밀번호,이메일,전화번호를 수정할 수 
//있도록)- set메소드
//
//==== 화면  ====
//1.회원추가  2.회원검색 3.회원삭제   4.회원수정  5.종료
//원하는 메뉴:1
//[회원추가]
//아이디:__

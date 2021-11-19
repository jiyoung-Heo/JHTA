package day11.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Home01_noex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		boolean flag = false;

		while (!flag) {
			boolean find = false;
			System.out.println("<회원관리 프로그램>");
			System.out.println("1.회원추가 2. 회원검색 3. 회원삭제 4. 회원수정 5. 종료");
			System.out.print("원하는 메뉴: ");

			switch (sc.nextInt()) {
			case 1: {
				System.out.println("[회원추가]");
				String realId = "";
				int cnt = 0;
				do {
					cnt = 0;
					System.out.print("아이디: ");
					String id = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
							cnt++;
						}
					}
					if (cnt == 0) {
						realId = id;
					}
				} while (cnt != 0);

				System.out.print("비밀번호: ");
				String pwd = sc.next();
				System.out.print("이메일: ");
				String email = sc.next();
				System.out.print("전화번호: ");
				String phone = sc.next();
				Home01_per hp = new Home01_per(realId, pwd, email, phone);
				list.add(hp);
				System.out.println("추가완료되었습니다.\n");
				continue;
			}

			case 2: {
				if (list.size() == 0) {
					System.out.println("회원정보가 전혀 존재하지 않습니다.\n");
					break;
				}
				System.out.print("검색할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						System.out.println("====검색결과====");
						System.out.println("아이디: " + allFind.getId() + "\n비밀번호: " + allFind.getPwd() + "\n이메일: "
								+ allFind.getEmail() + "\n전화번호: " + allFind.getPhone() + "\n");
						find = true;
					}
				}
				if (!find) {
					System.out.println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				continue;
			}

			case 3: {
				System.out.print("삭제할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						System.out.println("삭제되었습니다.\n");
						find = true;
					}
				}
				if (!find) {
					System.out.println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				continue;

			}

			case 4: {
				System.out.print("수정할 아이디를 입력하세요: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						System.out.print("변경할 비밀번호를 입력하세요: ");
						String rePwd = sc.next();
						System.out.print("변경할 이메일을 입력하세요: ");
						String reEmail = sc.next();
						System.out.print("변경할 전화번호를 입력하세요: ");
						String rePhone = sc.next();
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						list.set(i, rename);
						find = true;
					}
				}
				if (!find) {
					System.out.println("해당 아이디가 존재하지 않습니다.\n");
				}
				continue;
			}

			case 5: {
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				break;
			}

			default:
				System.out.println("번호를 잘못 선택하셨습니다.\n");
			}

		}
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

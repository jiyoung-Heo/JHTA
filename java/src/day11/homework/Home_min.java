package day11.homework;

import java.util.ArrayList;
import java.util.Scanner;
//1.회원관리 기능을 갖는 프로그램 만들어 보세요.
//회원정보 : 아이디,비밀번호,이메일,전화번호
//회원정보를 갖는 클래스를 만들고 ArrayList에 저장하고 아래의 기능을
//작성해 보세요.

//<구현한 기능>
//회원추가기능
//회원검색기능(아이디로 검색하면 모든 정보 출력)
//회원삭제기능(아이디를 입력하면 해당 정보 삭제) - remove메소드
//회원수정기능(아이디를 입력받아 비밀번호,이메일,전화번호를 수정할 수 
//있도록)- set메소드
//종료기능

public class Home_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList 객체 생성하기
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		// while문 돌릴 boolean타입 객체 생성하기
		boolean flag = false;
		while (!flag) {
			// 입력받은 아이디가 존재하지 않는 경우에 사용하기 위해(65줄,86줄) boolean형의 find변수를 선언해준다.
			boolean find = false;
			System.out.println("<회원관리 프로그램>");
			System.out.println("1.회원추가 2. 회원검색 3. 회원삭제 4. 회원수정 5. 종료");
			System.out.print("원하는 메뉴: ");
			// switch문을 통해 입력된 번호에 해당하는 메뉴로 접근 가능하도록 한다.
			switch (sc.nextInt()) {
			case 1: {
				// 회원추가메뉴
				System.out.println("[회원추가]");
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				String pwd = sc.next();
				System.out.print("이메일: ");
				String email = sc.next();
				System.out.print("전화번호: ");
				String phone = sc.next();
				// 이외의 정보를 모두 Scanner를 사용하여 받아서 Home01_per클래스의 객체에 넣어준다.
				Home01_per hp = new Home01_per(id, pwd, email, phone);
				// Home01_per클래스의 객체인 hp를 ArrayList 클래스에 추가한다.
				list.add(hp);
				System.out.println("추가완료되었습니다.\n");
				// 다시 원하는 메뉴를 선택할 수 있도록 continue를 통해 상부로 흐름을 올려준다.
				continue;// break;도 사용 가능!
			}
			case 2: {
				// 회원검색 메뉴
				// 검색할 아이디를 Scanner를 통해 입력받는다.
				System.out.print("검색할 아이디를 입력하세요: ");
				String id = sc.next();
				// 입력받은 아이디가 존재하지 않는 경우에 사용하기 위해 boolean형의 find변수를 선언해준다.
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						System.out.println("====검색결과====");
						System.out.println("아이디: " + allFind.getId() + "\n비밀번호: " + allFind.getPwd() + "\n이메일: "
								+ allFind.getEmail() + "\n전화번호: " + allFind.getPhone() + "\n");
						// 만약 동일한 아이디가 있다면 find를 true값으로 전환시켜준다.
						find = true;
					}
				}
				// find가 false라면( 동일한 아이디가 없다면) 아이디가 존재하지 않는다고 출력한다.
				if (!find) {
					System.out.println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				// 다시 원하는 메뉴를 선택할 수 있도록 continue를 통해 상부로 흐름을 올려준다.
				continue;// break;도 사용 가능!
			}
			case 3: {
				// 회원삭제 메뉴
				// 삭제할 아이디를 Scanner를 통해 입력받는다.
				System.out.print("삭제할 아이디를 입력하세요: ");
				String id = sc.next();
				// 입력받은 아이디가 존재하지 않는 경우에 사용하기 위해 boolean형의 find변수를 선언해준다.
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						System.out.println("삭제되었습니다.\n");
						find = true;
					}
				}
				// find가 false라면( 동일한 아이디가 없다면) 아이디가 존재하지 않는다고 출력한다.
				if (!find) {
					System.out.println(" 해당 아이디가 존재하지 않습니다.\n");
				}
				// 다시 원하는 메뉴를 선택할 수 있도록 continue를 통해 상부로 흐름을 올려준다.
				continue;// break;도 사용 가능!

			}
			case 4: {
				// 회원수정 메뉴
				// 수정할 아이디를 Scanner를 통해 입력받는다.
				System.out.print("수정할 아이디를 입력하세요: ");
				String id = sc.next();
				// 입력받은 아이디가 존재하지 않는 경우에 사용하기 위해 boolean형의 find변수를 선언해준다.
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						// 동일한 아이디를 찾았다면 수정할 비밀번호, 이메일, 전화번호를 Scanner를 통해 입력받는다.
						System.out.print("변경할 비밀번호를 입력하세요: ");
						String rePwd = sc.next();
						System.out.print("변경할 이메일을 입력하세요: ");
						String reEmail = sc.next();
						System.out.print("변경할 전화번호를 입력하세요: ");
						String rePhone = sc.next();
						// Home01_per 객체 rename을 생성하여 아이디에 따른 새로운 값을 저장해준다.
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						// ArrayList에서 동일한 아이디가 있는 i방을 rename으로 덮어씌운다.
						list.set(i, rename);
						System.out.println("수정되었습니다.\n");
						find = true;
					}
				}
				// find가 false라면( 동일한 아이디가 없다면) 아이디가 존재하지 않는다고 출력한다.
				if (!find) {
					System.out.println("해당 아이디가 존재하지 않습니다.\n");
				}
				// 다시 원하는 메뉴를 선택할 수 있도록 continue를 통해 상부로 흐름을 올려준다.
				continue;// break;도 사용 가능!
			}
			case 5: {
				// 종료 메뉴
				System.out.println("프로그램을 종료합니다.");
				// while문의 조건식이었던 flag를 true로 바꿔줌으로써 더이상 while문이 작동하지 않도록 한다.
				flag = true;
				break;
			}
			default:
				// 1~5 이외의 정수를 입력했을 경우 번호를 잘못선택했다고 출력하고 메뉴선택창으로 돌아간다.
				System.out.println("번호를 잘못 선택하셨습니다.\n");
			}
		}
	}
}

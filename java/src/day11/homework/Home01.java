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
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList 객체 생성하기
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		// while문 돌릴 boolean타입 객체 생성하기
		boolean flag = false;
		while (!flag) {
			boolean find = false;
			// 입력받은 아이디가 존재하지 않는 경우에 사용하기 위해 boolean형의 find변수를 선언해준다.
			System.out.println("<회원관리 프로그램>");
			System.out.println("1.회원추가 2. 회원검색 3. 회원삭제 4. 회원수정 5. 종료");
			System.out.print("원하는 메뉴: ");
			// switch문을 통해 입력된 번호에 해당하는 메뉴로 접근 가능하도록 한다.
			switch (sc.nextInt()) {
			case 1: {
				// 회원추가메뉴
				System.out.println("[회원추가]");
				// 중복되지 않은 아이디 값을 지정할 realId변수 생성
				String realId = "";
				// 중복을 체크할 cnt변수 초기화값 지정
				int cnt = 0;
				// 중복된 아이디 테스트하기. do while문 이용
				do {
					// do while문이 한번이상 반복하면 cnt가 계속 쌓이므로 초기화해준다.
					cnt = 0;
					// do while문 안에서 아이디를 입력받기
					System.out.print("아이디: ");
					String id = sc.next();
					// for문으로 만약 이 아이디가 list객체의 i번째 열에 저장되어있는 아이디라면
					// 중복된 아이디라고 출력한후 cnt +1 추가하기
					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
							cnt++;
						}
					}
					// 만약 cnt가 0, 그러니까 중복된 아이디 값이 없을경우 id값을 realId에 넣어준다.
					// (do while문 안에서 정의된 변수이기 때문에 밖에서 해당 변수를 사용할 수 없기 때문.)
					if (cnt == 0) {
						realId = id;
					}
					// do를 모두 실행한 이후 cnt가 0이 아닌경우(중복된 아이디가 있는 경우)
					// 중복된 아이디가 아닐 때 까지 다시 아이디를 받는 실행문을 반복하도록 조건식을 cnt!=0으로 지정함
				} while (cnt != 0);

				System.out.print("비밀번호: ");
				String pwd = sc.next();
				System.out.print("이메일: ");
				String email = sc.next();
				System.out.print("전화번호: ");
				String phone = sc.next();
				// 이외의 정보를 모두 Scanner를 사용하여 받아서 Home01_per클래스의 객체에 넣어준다.
				Home01_per hp = new Home01_per(realId, pwd, email, phone);
				// Home01_per클래스의 객체인 hp를 ArrayList 클래스에 추가한다.
				list.add(hp);
				System.out.println("추가완료되었습니다.\n");
				// 다시 원하는 메뉴를 선택할 수 있도록 continue를 통해 상부로 흐름을 올려준다.
				continue;
			}
			case 2: {
				// 회원검색 메뉴
				// 만약 회원이 한명도 없는 상태(ArrayList에 아무것도 없는상태)라면 회원정보가 전혀 존재하지 않다고 출력해준다
				if (list.size() == 0) {
					System.out.println("회원정보가 전혀 존재하지 않습니다.\n");
					break;
				}
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
				continue;
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
				continue;

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
				continue;
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

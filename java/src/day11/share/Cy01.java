package day11.share;

import java.util.ArrayList;
import java.util.Scanner;

public class Cy01 {
	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Member> list = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		while (flag) {// 종료할때까지 돌릴꺼임 flag = 전원버튼
			boolean find = false; // 아이디 틀리면 true반환해서 아이디 맞지않다고 출력할거임.
			boolean jung = false; // 중복값이 있으면 while로 돌아가기 위해 만든 장치

			System.out.println("1. 회원 추가   2. 회원 검색  3. 회원 삭제 4. 회원수정 5.종료");
			int num = sc.nextInt();// num을 입력받아 1,2,3,4의 기능을 구현할거임
			switch (num) {// if문보다 간단해서 씀
			case 1:
				boolean jung2 = false;
				System.out.println("회원 추가 // 메뉴로 돌아가시려면 ..을 입력해주세요");
				String rId = "";
				int exit = 0;
				while (!jung2) {
					int cnt = 0;
					System.out.println("아이디 입력");
					String id = sc.next();// 추가할 아이디 받기
					for (int i = 0; i < list.size(); i++) {// 중복값 검사.
						Member mmm = list.get(i);
						if (mmm.getId().equals(id)) {
							System.out.println("중복된 id 입니다. 다시 입력해주세요. 메뉴로 돌아가시려면 ..을 입력해주세요");
							cnt++;
						}
					}
					if (cnt == 0) {
						rId = id;
						jung2 = true;
					}
					if (id.equals("..")) {
						System.out.println("회원 추가를 종료합니다.");
						exit = 1;
						continue;
					}
				}
				if (exit == 1) {
					continue;
				}

				System.out.println("비밀번호 입력");
				String pw = sc.next();// 비밀번호 받기
				System.out.println("이메일 입력 : ");
				String email = sc.next();// 이메일 받기
				System.out.println("전화번호 입력 : ");
				String phone = sc.next();// 전화번호 받기
				Member mm = new Member(rId, pw, email, phone);// 받은 지역변수들을 parameter값으로 넣어서 객체를 하나 완성
				list.add(mm);// 객체를 list에 집어넣기
				break;

			case 2:
				System.out.println("======회원 검색======");
				System.out.println("검색할 아이디를 입력");

				rId = sc.next();

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i);// for문 돌리기
					if (rId.equals(m.getId())) {// 만약 id 랑 돌린 get(i)랑 일치한게 있다면
						System.out.println("아이디 : " + m.getId());// 그 i(index)값 중 id를 리턴
						System.out.println("비밀번호 : " + m.getPw());// pw를 리턴
						System.out.println("이메일 : " + m.getEmail());// 이메일을 리턴
						System.out.println("전화번호 : " + m.getPhone());// 전화를 리턴
						find = true;// 실행 성공하면 true
					}
				}

				if (!find)
					System.out.println("아이디가 맞지 않습니다.");// 실행 실패하면 false
				break;

			case 3:
				System.out.println("삭제할 아이디를 입력하세요");
				rId = sc.next();// 삭제할 아이디 받기

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i); // list 안에 i를 인덱스로 가진 값을 m으로 지정
					if (rId.equals(m.getId())) {// 같니?
						Member a = list.remove(i);// 같으면 i를 index값으로 가진 객체를 지움
						System.out.println(a.getId() + "의 모든 정보가 삭제되었습니다.");// 정보 삭제 알림
						find = true;// 실행 성공
					}

				}

				if (!find)
					System.out.println("아이디가 맞지 않습니다.");// 실행 실패
				break;

			case 4:
				System.out.println("수정할 회원 아이디 입력");
				rId = sc.next();// 아이디 입력

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i);// list 안에 i를 인덱스로 가진 값을 m으로 지정
					if (m.getId().equals(rId)) {// 만약 존재 한다면
						System.out.println("새로운 비밀번호 : ");
						pw = sc.next();// 비밀번호 다시받고
						System.out.println("새로운 이메일 : ");
						email = sc.next();// 이메일 다시받고
						System.out.println("새로운 전화번호 : ");
						phone = sc.next();// 핸드폰 다시받고
						Member mm2 = new Member(rId, pw, email, phone);// 받은걸 객체로 만들어서
						list.set(i, mm2);// mm2값으로 업데이트!

						find = true;// 실행성공
					}
				}

				if (!find)
					System.out.println("아이디가 맞지 않습니다.");// 실패
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");// 프로그램종료
				flag = false;// while문 false로 종료

			}
		}
	}
}
/*
 * 1.회원관리 기능을 갖는 프로그램 만들어 보세요. 회원정보 : 아이디,비밀번호,이메일,전화번호 회원정보를 갖는 클래스를 만들고
 * ArrayList에 저장하고 아래의 기능을 작성해 보세요.
 * 
 * 회원추가기능 회원검색기능(아이디로 검색하면 모든 정보 출력) 회원삭제기능(아이디를 입력하면 해당 정보 삭제) - remove메소드
 * 회원수정기능(아이디를 입력받아 비밀번호,이메일,전화번호를 수정할 수 있도록)- set메소드
 * 
 * ==== 화면 ==== 1.회원추가 2.회원검색 3.회원삭제 4.회원수정 5.종료 원하는 메뉴:1 [회원추가] 아이디:__
 */

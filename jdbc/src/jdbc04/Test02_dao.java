package jdbc04;

import java.util.ArrayList;
import java.util.Scanner;

import jdbc04.test.dao.MembersDao;
import jdbc04.test.vo.MembersVo;

public class Test02_dao {
	MembersDao dao = new MembersDao();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Test02_dao dao = new Test02_dao();
		while (true) {
			System.out.println("1.회원가입 2.회원삭제 3.회원수정 4.회원조회 5.전체조회 6.이름으로 조회 7.종료");
			int n = dao.sc.nextInt();
			switch (n) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
				break;
			case 3:
				dao.update();
				break;
			case 4:
				dao.find();
				break;
			case 5:
				dao.findAll();
				break;
			case 6:
				dao.findName();
				break;
			case 7:
				System.out.println("프로그램종료...");
				System.exit(0);
			}
		}
	}

	public void insert() {
		System.out.println("회원번호");
		int num = sc.nextInt();
		System.out.println("이름");
		String name = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		System.out.println("주소");
		String addr = sc.next();
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		int n = dao.insert(vo);
		System.out.println(n + "명의 회원이 등록되었습니다.");
	}

	public void delete() {
		System.out.println("회원번호");
		int num = sc.nextInt();
		int n = dao.delete(num);
		System.out.println(n + "명의 회원이 삭제되었습니다.");
	}

	// 회원번호 입력받아서 회원이름, 전화번호, 주소 수정하기
	public void update() {
		System.out.println("회원번호");
		int num = sc.nextInt();
		System.out.println("이름");
		String name = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		System.out.println("주소");
		String addr = sc.next();
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		int n = dao.update(vo);
//		int n = dao.update(num, name, phone, addr);
		System.out.println(n + "명의 회원이 수정되었습니다.");
	}

	// 조회할 회원번호 입력받아서 회원의 모든 정보 조회
	public void find() {
		System.out.println("조회할 회원번호");
		int num = sc.nextInt();
		MembersVo vo = dao.find(num);
		if (vo != null) {
			System.out.println("<<조회된 결과>>");
			System.out.println(vo.getNum());
			System.out.println(vo.getName());
			System.out.println(vo.getPhone());
			System.out.println(vo.getAddr());
			System.out.println(vo.getRegdate());
		} else {
			System.out.println("조회된 정보가 없습니다.");
		}
//		ArrayList<MembersVo> list = dao.findAll();
//		System.out.println("조회할 회원번호");
//		int num = sc.nextInt();
//		boolean flag = false;
//		for (int i = 0; i < list.size(); i++) {
//			MembersVo vo = list.get(i);
//			if (vo.getNum() == num) {
//				System.out.println(vo.getNum());
//				System.out.println(vo.getName());
//				System.out.println(vo.getPhone());
//				System.out.println(vo.getAddr());
//				System.out.println(vo.getRegdate());
//				flag = true;
//			}
//		}
//		if (flag == false) {
//			System.out.println("해당회원번호가 존재하지 않습니다.");
//		}
	}

	// 전체조회
	public void findAll() {
		ArrayList<MembersVo> list = dao.findAll();
		System.out.println("<< 회원전체정보 >>");
		for (int i = 0; i < list.size(); i++) {
			MembersVo vo = list.get(i);
			System.out.println(vo.getNum());
			System.out.println(vo.getName());
			System.out.println(vo.getPhone());
			System.out.println(vo.getAddr());
			System.out.println(vo.getRegdate());
			System.out.println();
		}
	}

	public void findName() {
		System.out.println("조회할 회원이름 입력");
		String name = sc.next();
		ArrayList<MembersVo> list = dao.find(name);
		System.out.println("<<조회된 결과>>");
		if (list != null) {
//			for (int j = 0; j < list.size(); j++) {
//				MembersVo vo = list.get(j);
//				System.out.println(vo.getNum());
//				System.out.println(vo.getName());
//				System.out.println(vo.getPhone());
//				System.out.println(vo.getAddr());
//				System.out.println(vo.getRegdate());
//				System.out.println();
//			}
			list.forEach(vo -> {
				System.out.println("회원번호: " + vo.getNum());
				System.out.println("이름: " + vo.getName());
				System.out.println("전화번호: " + vo.getPhone());
				System.out.println("주소: " + vo.getAddr());
				System.out.println("가입날짜: " + vo.getRegdate());
				System.out.println();
			});
		} else {
			System.out.println("정보가 존재하지 않습니다.");
		}
	}
}

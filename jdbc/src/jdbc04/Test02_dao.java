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
			System.out.println("1.ȸ������ 2.ȸ������ 3.ȸ������ 4.ȸ����ȸ 5.��ü��ȸ 6.�̸����� ��ȸ 7.����");
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
				System.out.println("���α׷�����...");
				System.exit(0);
			}
		}
	}

	public void insert() {
		System.out.println("ȸ����ȣ");
		int num = sc.nextInt();
		System.out.println("�̸�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		System.out.println("�ּ�");
		String addr = sc.next();
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		int n = dao.insert(vo);
		System.out.println(n + "���� ȸ���� ��ϵǾ����ϴ�.");
	}

	public void delete() {
		System.out.println("ȸ����ȣ");
		int num = sc.nextInt();
		int n = dao.delete(num);
		System.out.println(n + "���� ȸ���� �����Ǿ����ϴ�.");
	}

	// ȸ����ȣ �Է¹޾Ƽ� ȸ���̸�, ��ȭ��ȣ, �ּ� �����ϱ�
	public void update() {
		System.out.println("ȸ����ȣ");
		int num = sc.nextInt();
		System.out.println("�̸�");
		String name = sc.next();
		System.out.println("��ȭ��ȣ");
		String phone = sc.next();
		System.out.println("�ּ�");
		String addr = sc.next();
		MembersVo vo = new MembersVo(num, name, phone, addr, null);
		int n = dao.update(vo);
//		int n = dao.update(num, name, phone, addr);
		System.out.println(n + "���� ȸ���� �����Ǿ����ϴ�.");
	}

	// ��ȸ�� ȸ����ȣ �Է¹޾Ƽ� ȸ���� ��� ���� ��ȸ
	public void find() {
		System.out.println("��ȸ�� ȸ����ȣ");
		int num = sc.nextInt();
		MembersVo vo = dao.find(num);
		if (vo != null) {
			System.out.println("<<��ȸ�� ���>>");
			System.out.println(vo.getNum());
			System.out.println(vo.getName());
			System.out.println(vo.getPhone());
			System.out.println(vo.getAddr());
			System.out.println(vo.getRegdate());
		} else {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		}
//		ArrayList<MembersVo> list = dao.findAll();
//		System.out.println("��ȸ�� ȸ����ȣ");
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
//			System.out.println("�ش�ȸ����ȣ�� �������� �ʽ��ϴ�.");
//		}
	}

	// ��ü��ȸ
	public void findAll() {
		ArrayList<MembersVo> list = dao.findAll();
		System.out.println("<< ȸ����ü���� >>");
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
		System.out.println("��ȸ�� ȸ���̸� �Է�");
		String name = sc.next();
		ArrayList<MembersVo> list = dao.find(name);
		System.out.println("<<��ȸ�� ���>>");
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
				System.out.println("ȸ����ȣ: " + vo.getNum());
				System.out.println("�̸�: " + vo.getName());
				System.out.println("��ȭ��ȣ: " + vo.getPhone());
				System.out.println("�ּ�: " + vo.getAddr());
				System.out.println("���Գ�¥: " + vo.getRegdate());
				System.out.println();
			});
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}

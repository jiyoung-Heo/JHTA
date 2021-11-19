package day11.share;

import java.util.ArrayList;
import java.util.Scanner;

public class Cy01 {
	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<Member> list = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		while (flag) {// �����Ҷ����� �������� flag = ������ư
			boolean find = false; // ���̵� Ʋ���� true��ȯ�ؼ� ���̵� �����ʴٰ� ����Ұ���.
			boolean jung = false; // �ߺ����� ������ while�� ���ư��� ���� ���� ��ġ

			System.out.println("1. ȸ�� �߰�   2. ȸ�� �˻�  3. ȸ�� ���� 4. ȸ������ 5.����");
			int num = sc.nextInt();// num�� �Է¹޾� 1,2,3,4�� ����� �����Ұ���
			switch (num) {// if������ �����ؼ� ��
			case 1:
				boolean jung2 = false;
				System.out.println("ȸ�� �߰� // �޴��� ���ư��÷��� ..�� �Է����ּ���");
				String rId = "";
				int exit = 0;
				while (!jung2) {
					int cnt = 0;
					System.out.println("���̵� �Է�");
					String id = sc.next();// �߰��� ���̵� �ޱ�
					for (int i = 0; i < list.size(); i++) {// �ߺ��� �˻�.
						Member mmm = list.get(i);
						if (mmm.getId().equals(id)) {
							System.out.println("�ߺ��� id �Դϴ�. �ٽ� �Է����ּ���. �޴��� ���ư��÷��� ..�� �Է����ּ���");
							cnt++;
						}
					}
					if (cnt == 0) {
						rId = id;
						jung2 = true;
					}
					if (id.equals("..")) {
						System.out.println("ȸ�� �߰��� �����մϴ�.");
						exit = 1;
						continue;
					}
				}
				if (exit == 1) {
					continue;
				}

				System.out.println("��й�ȣ �Է�");
				String pw = sc.next();// ��й�ȣ �ޱ�
				System.out.println("�̸��� �Է� : ");
				String email = sc.next();// �̸��� �ޱ�
				System.out.println("��ȭ��ȣ �Է� : ");
				String phone = sc.next();// ��ȭ��ȣ �ޱ�
				Member mm = new Member(rId, pw, email, phone);// ���� ������������ parameter������ �־ ��ü�� �ϳ� �ϼ�
				list.add(mm);// ��ü�� list�� ����ֱ�
				break;

			case 2:
				System.out.println("======ȸ�� �˻�======");
				System.out.println("�˻��� ���̵� �Է�");

				rId = sc.next();

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i);// for�� ������
					if (rId.equals(m.getId())) {// ���� id �� ���� get(i)�� ��ġ�Ѱ� �ִٸ�
						System.out.println("���̵� : " + m.getId());// �� i(index)�� �� id�� ����
						System.out.println("��й�ȣ : " + m.getPw());// pw�� ����
						System.out.println("�̸��� : " + m.getEmail());// �̸����� ����
						System.out.println("��ȭ��ȣ : " + m.getPhone());// ��ȭ�� ����
						find = true;// ���� �����ϸ� true
					}
				}

				if (!find)
					System.out.println("���̵� ���� �ʽ��ϴ�.");// ���� �����ϸ� false
				break;

			case 3:
				System.out.println("������ ���̵� �Է��ϼ���");
				rId = sc.next();// ������ ���̵� �ޱ�

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i); // list �ȿ� i�� �ε����� ���� ���� m���� ����
					if (rId.equals(m.getId())) {// ����?
						Member a = list.remove(i);// ������ i�� index������ ���� ��ü�� ����
						System.out.println(a.getId() + "�� ��� ������ �����Ǿ����ϴ�.");// ���� ���� �˸�
						find = true;// ���� ����
					}

				}

				if (!find)
					System.out.println("���̵� ���� �ʽ��ϴ�.");// ���� ����
				break;

			case 4:
				System.out.println("������ ȸ�� ���̵� �Է�");
				rId = sc.next();// ���̵� �Է�

				for (int i = 0; i < list.size(); i++) {
					Member m = list.get(i);// list �ȿ� i�� �ε����� ���� ���� m���� ����
					if (m.getId().equals(rId)) {// ���� ���� �Ѵٸ�
						System.out.println("���ο� ��й�ȣ : ");
						pw = sc.next();// ��й�ȣ �ٽùް�
						System.out.println("���ο� �̸��� : ");
						email = sc.next();// �̸��� �ٽùް�
						System.out.println("���ο� ��ȭ��ȣ : ");
						phone = sc.next();// �ڵ��� �ٽùް�
						Member mm2 = new Member(rId, pw, email, phone);// ������ ��ü�� ����
						list.set(i, mm2);// mm2������ ������Ʈ!

						find = true;// ���༺��
					}
				}

				if (!find)
					System.out.println("���̵� ���� �ʽ��ϴ�.");// ����
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");// ���α׷�����
				flag = false;// while�� false�� ����

			}
		}
	}
}
/*
 * 1.ȸ������ ����� ���� ���α׷� ����� ������. ȸ������ : ���̵�,��й�ȣ,�̸���,��ȭ��ȣ ȸ�������� ���� Ŭ������ �����
 * ArrayList�� �����ϰ� �Ʒ��� ����� �ۼ��� ������.
 * 
 * ȸ���߰���� ȸ���˻����(���̵�� �˻��ϸ� ��� ���� ���) ȸ���������(���̵� �Է��ϸ� �ش� ���� ����) - remove�޼ҵ�
 * ȸ���������(���̵� �Է¹޾� ��й�ȣ,�̸���,��ȭ��ȣ�� ������ �� �ֵ���)- set�޼ҵ�
 * 
 * ==== ȭ�� ==== 1.ȸ���߰� 2.ȸ���˻� 3.ȸ������ 4.ȸ������ 5.���� ���ϴ� �޴�:1 [ȸ���߰�] ���̵�:__
 */

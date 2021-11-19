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
			System.out.println("<ȸ������ ���α׷�>");
			System.out.println("1.ȸ���߰� 2. ȸ���˻� 3. ȸ������ 4. ȸ������ 5. ����");
			System.out.print("���ϴ� �޴�: ");

			switch (sc.nextInt()) {
			case 1: {
				System.out.println("[ȸ���߰�]");
				String realId = "";
				int cnt = 0;
				do {
					cnt = 0;
					System.out.print("���̵�: ");
					String id = sc.next();
					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
							cnt++;
						}
					}
					if (cnt == 0) {
						realId = id;
					}
				} while (cnt != 0);

				System.out.print("��й�ȣ: ");
				String pwd = sc.next();
				System.out.print("�̸���: ");
				String email = sc.next();
				System.out.print("��ȭ��ȣ: ");
				String phone = sc.next();
				Home01_per hp = new Home01_per(realId, pwd, email, phone);
				list.add(hp);
				System.out.println("�߰��Ϸ�Ǿ����ϴ�.\n");
				continue;
			}

			case 2: {
				if (list.size() == 0) {
					System.out.println("ȸ�������� ���� �������� �ʽ��ϴ�.\n");
					break;
				}
				System.out.print("�˻��� ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						System.out.println("====�˻����====");
						System.out.println("���̵�: " + allFind.getId() + "\n��й�ȣ: " + allFind.getPwd() + "\n�̸���: "
								+ allFind.getEmail() + "\n��ȭ��ȣ: " + allFind.getPhone() + "\n");
						find = true;
					}
				}
				if (!find) {
					System.out.println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				continue;
			}

			case 3: {
				System.out.print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�.\n");
						find = true;
					}
				}
				if (!find) {
					System.out.println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				continue;

			}

			case 4: {
				System.out.print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
						String rePwd = sc.next();
						System.out.print("������ �̸����� �Է��ϼ���: ");
						String reEmail = sc.next();
						System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���: ");
						String rePhone = sc.next();
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						list.set(i, rename);
						find = true;
					}
				}
				if (!find) {
					System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				continue;
			}

			case 5: {
				System.out.println("���α׷��� �����մϴ�.");
				flag = true;
				break;
			}

			default:
				System.out.println("��ȣ�� �߸� �����ϼ̽��ϴ�.\n");
			}

		}
	}
}
//1.ȸ������ ����� ���� ���α׷� ����� ������.
//ȸ������ : ���̵�,��й�ȣ,�̸���,��ȭ��ȣ
//ȸ�������� ���� Ŭ������ ����� ArrayList�� �����ϰ� �Ʒ��� �����
//�ۼ��� ������.
//ȸ���߰����
//ȸ���˻����(���̵�� �˻��ϸ� ��� ���� ���)
//ȸ���������(���̵� �Է��ϸ� �ش� ���� ����) - remove�޼ҵ�
//ȸ���������(���̵� �Է¹޾� ��й�ȣ,�̸���,��ȭ��ȣ�� ������ �� 
//�ֵ���)- set�޼ҵ�
//
//==== ȭ��  ====
//1.ȸ���߰�  2.ȸ���˻� 3.ȸ������   4.ȸ������  5.����
//���ϴ� �޴�:1
//[ȸ���߰�]
//���̵�:__

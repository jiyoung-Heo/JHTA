package day11.homework;

import java.util.ArrayList;
import java.util.Scanner;
//1.ȸ������ ����� ���� ���α׷� ����� ������.
//ȸ������ : ���̵�,��й�ȣ,�̸���,��ȭ��ȣ
//ȸ�������� ���� Ŭ������ ����� ArrayList�� �����ϰ� �Ʒ��� �����
//�ۼ��� ������.

//<������ ���>
//ȸ���߰����
//ȸ���˻����(���̵�� �˻��ϸ� ��� ���� ���)
//ȸ���������(���̵� �Է��ϸ� �ش� ���� ����) - remove�޼ҵ�
//ȸ���������(���̵� �Է¹޾� ��й�ȣ,�̸���,��ȭ��ȣ�� ������ �� 
//�ֵ���)- set�޼ҵ�
//������

public class Home_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList ��ü �����ϱ�
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		// while�� ���� booleanŸ�� ��ü �����ϱ�
		boolean flag = false;
		while (!flag) {
			// �Է¹��� ���̵� �������� �ʴ� ��쿡 ����ϱ� ����(65��,86��) boolean���� find������ �������ش�.
			boolean find = false;
			System.out.println("<ȸ������ ���α׷�>");
			System.out.println("1.ȸ���߰� 2. ȸ���˻� 3. ȸ������ 4. ȸ������ 5. ����");
			System.out.print("���ϴ� �޴�: ");
			// switch���� ���� �Էµ� ��ȣ�� �ش��ϴ� �޴��� ���� �����ϵ��� �Ѵ�.
			switch (sc.nextInt()) {
			case 1: {
				// ȸ���߰��޴�
				System.out.println("[ȸ���߰�]");
				System.out.print("���̵�: ");
				String id = sc.next();
				System.out.print("��й�ȣ: ");
				String pwd = sc.next();
				System.out.print("�̸���: ");
				String email = sc.next();
				System.out.print("��ȭ��ȣ: ");
				String phone = sc.next();
				// �̿��� ������ ��� Scanner�� ����Ͽ� �޾Ƽ� Home01_perŬ������ ��ü�� �־��ش�.
				Home01_per hp = new Home01_per(id, pwd, email, phone);
				// Home01_perŬ������ ��ü�� hp�� ArrayList Ŭ������ �߰��Ѵ�.
				list.add(hp);
				System.out.println("�߰��Ϸ�Ǿ����ϴ�.\n");
				// �ٽ� ���ϴ� �޴��� ������ �� �ֵ��� continue�� ���� ��η� �帧�� �÷��ش�.
				continue;// break;�� ��� ����!
			}
			case 2: {
				// ȸ���˻� �޴�
				// �˻��� ���̵� Scanner�� ���� �Է¹޴´�.
				System.out.print("�˻��� ���̵� �Է��ϼ���: ");
				String id = sc.next();
				// �Է¹��� ���̵� �������� �ʴ� ��쿡 ����ϱ� ���� boolean���� find������ �������ش�.
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						System.out.println("====�˻����====");
						System.out.println("���̵�: " + allFind.getId() + "\n��й�ȣ: " + allFind.getPwd() + "\n�̸���: "
								+ allFind.getEmail() + "\n��ȭ��ȣ: " + allFind.getPhone() + "\n");
						// ���� ������ ���̵� �ִٸ� find�� true������ ��ȯ�����ش�.
						find = true;
					}
				}
				// find�� false���( ������ ���̵� ���ٸ�) ���̵� �������� �ʴ´ٰ� ����Ѵ�.
				if (!find) {
					System.out.println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				// �ٽ� ���ϴ� �޴��� ������ �� �ֵ��� continue�� ���� ��η� �帧�� �÷��ش�.
				continue;// break;�� ��� ����!
			}
			case 3: {
				// ȸ������ �޴�
				// ������ ���̵� Scanner�� ���� �Է¹޴´�.
				System.out.print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				// �Է¹��� ���̵� �������� �ʴ� ��쿡 ����ϱ� ���� boolean���� find������ �������ش�.
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�.\n");
						find = true;
					}
				}
				// find�� false���( ������ ���̵� ���ٸ�) ���̵� �������� �ʴ´ٰ� ����Ѵ�.
				if (!find) {
					System.out.println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				// �ٽ� ���ϴ� �޴��� ������ �� �ֵ��� continue�� ���� ��η� �帧�� �÷��ش�.
				continue;// break;�� ��� ����!

			}
			case 4: {
				// ȸ������ �޴�
				// ������ ���̵� Scanner�� ���� �Է¹޴´�.
				System.out.print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				// �Է¹��� ���̵� �������� �ʴ� ��쿡 ����ϱ� ���� boolean���� find������ �������ش�.
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						// ������ ���̵� ã�Ҵٸ� ������ ��й�ȣ, �̸���, ��ȭ��ȣ�� Scanner�� ���� �Է¹޴´�.
						System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
						String rePwd = sc.next();
						System.out.print("������ �̸����� �Է��ϼ���: ");
						String reEmail = sc.next();
						System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���: ");
						String rePhone = sc.next();
						// Home01_per ��ü rename�� �����Ͽ� ���̵� ���� ���ο� ���� �������ش�.
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						// ArrayList���� ������ ���̵� �ִ� i���� rename���� ������.
						list.set(i, rename);
						System.out.println("�����Ǿ����ϴ�.\n");
						find = true;
					}
				}
				// find�� false���( ������ ���̵� ���ٸ�) ���̵� �������� �ʴ´ٰ� ����Ѵ�.
				if (!find) {
					System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				// �ٽ� ���ϴ� �޴��� ������ �� �ֵ��� continue�� ���� ��η� �帧�� �÷��ش�.
				continue;// break;�� ��� ����!
			}
			case 5: {
				// ���� �޴�
				System.out.println("���α׷��� �����մϴ�.");
				// while���� ���ǽ��̾��� flag�� true�� �ٲ������ν� ���̻� while���� �۵����� �ʵ��� �Ѵ�.
				flag = true;
				break;
			}
			default:
				// 1~5 �̿��� ������ �Է����� ��� ��ȣ�� �߸������ߴٰ� ����ϰ� �޴�����â���� ���ư���.
				System.out.println("��ȣ�� �߸� �����ϼ̽��ϴ�.\n");
			}
		}
	}
}

package day11.homework;

import java.util.ArrayList;
import java.util.Scanner;

//<������ ���>
//ȸ���߰����
//- ȸ�� �߰��ϱ�, �ߺ��� ���̵��� �ٽ� �Է¹ޱ�, �ڷΰ���
//ȸ���˻����
//- ���̵�� �˻��ϸ� ��� ���� ���, ȸ���� �Ѹ� ���� ���¶�� ȸ������ ���, �Է��� ���̵��� ȸ���� ������ �������� �ʴ´ٰ� ���
//ȸ���������
//- ���̵� �Է��ϸ� �ش� ���� ����, �Է��� ���̵��� ȸ���� ������ �������� �ʴ´ٰ� ���
//ȸ���������
//- ���̵� �Է¹޾� ��й�ȣ �̸��� ��ȭ��ȣ�� �����ϱ�, �Է��� ���̵��� ȸ���� ������ �������� �ʴ´ٰ� ���
//������
//- ����
//�ٸ���ȣ �Է����� �� �޴�����â���� ������
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList ��ü �����ϱ�
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		// while�� ���� booleanŸ�� ��ü �����ϱ�
		boolean flag = false;
		while (!flag) {
			boolean find = false;
			// �Է¹��� ���̵� �������� �ʴ� ��쿡 ����ϱ� ���� boolean���� find������ �������ش�.
			System.out.println("<ȸ������ ���α׷�>");
			System.out.println("1.ȸ���߰� 2. ȸ���˻� 3. ȸ������ 4. ȸ������ 5. ����");
			System.out.print("���ϴ� �޴�: ");
			// switch���� ���� �Էµ� ��ȣ�� �ش��ϴ� �޴��� ���� �����ϵ��� �Ѵ�.
			switch (sc.nextInt()) {
			case 1: {
				// ȸ���߰��޴�
				System.out.println("[ȸ���߰�]");
				// �ߺ����� ���� ���̵� ���� ������ realId���� ����
				String realId = "";
				// �ߺ��� üũ�� cnt���� �ʱ�ȭ�� ����
				int cnt = 0;
				// �ߺ��� ���̵� �׽�Ʈ�ϱ�. do while�� �̿�
				do {
					// do while���� �ѹ��̻� �ݺ��ϸ� cnt�� ��� ���̹Ƿ� �ʱ�ȭ���ش�.
					cnt = 0;
					// do while�� �ȿ��� ���̵� �Է¹ޱ�
					System.out.print("���̵�: ");
					String id = sc.next();
					// for������ ���� �� ���̵� list��ü�� i��° ���� ����Ǿ��ִ� ���̵���
					// �ߺ��� ���̵��� ������� cnt +1 �߰��ϱ�
					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
							cnt++;
						}
					}
					// ���� cnt�� 0, �׷��ϱ� �ߺ��� ���̵� ���� ������� id���� realId�� �־��ش�.
					// (do while�� �ȿ��� ���ǵ� �����̱� ������ �ۿ��� �ش� ������ ����� �� ���� ����.)
					if (cnt == 0) {
						realId = id;
					}
					// do�� ��� ������ ���� cnt�� 0�� �ƴѰ��(�ߺ��� ���̵� �ִ� ���)
					// �ߺ��� ���̵� �ƴ� �� ���� �ٽ� ���̵� �޴� ���๮�� �ݺ��ϵ��� ���ǽ��� cnt!=0���� ������
				} while (cnt != 0);

				System.out.print("��й�ȣ: ");
				String pwd = sc.next();
				System.out.print("�̸���: ");
				String email = sc.next();
				System.out.print("��ȭ��ȣ: ");
				String phone = sc.next();
				// �̿��� ������ ��� Scanner�� ����Ͽ� �޾Ƽ� Home01_perŬ������ ��ü�� �־��ش�.
				Home01_per hp = new Home01_per(realId, pwd, email, phone);
				// Home01_perŬ������ ��ü�� hp�� ArrayList Ŭ������ �߰��Ѵ�.
				list.add(hp);
				System.out.println("�߰��Ϸ�Ǿ����ϴ�.\n");
				// �ٽ� ���ϴ� �޴��� ������ �� �ֵ��� continue�� ���� ��η� �帧�� �÷��ش�.
				continue;
			}
			case 2: {
				// ȸ���˻� �޴�
				// ���� ȸ���� �Ѹ� ���� ����(ArrayList�� �ƹ��͵� ���»���)��� ȸ�������� ���� �������� �ʴٰ� ������ش�
				if (list.size() == 0) {
					System.out.println("ȸ�������� ���� �������� �ʽ��ϴ�.\n");
					break;
				}
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
				continue;
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
				continue;

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
				continue;
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

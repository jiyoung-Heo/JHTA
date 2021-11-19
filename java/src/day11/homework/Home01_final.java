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
public class Home01_final {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Home01_per> list = new ArrayList<Home01_per>();
		boolean flag = false;

		while (flag == false) {
			boolean find = false;
			println("<ȸ������ ���α׷�>");
			println("1.ȸ���߰� 2. ȸ���˻� 3. ȸ������ 4. ȸ������ 5. ����");
			print("���ϴ� �޴�: ");

			label: switch (sc.nextInt()) {
			case 1: {
				boolean isId = false;
				println("[ȸ���߰�] //  ..�� ������ �޴��� ���ư��ϴ�.");
				String id = "";
				do {
					isId = false;
					print("���̵�: ");
					id = sc.next();

//					boolean result = list.contains(new Home01_per(id));
//					if (result) {
//						println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���. //  ..�� ������ �޴��� ���ư��ϴ�.");
//						isId = true;
//					}

					for (int i = 0; i < list.size(); i++) {
						if (id.equals(list.get(i).getId())) {
							println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���. //  ..�� ������ �޴��� ���ư��ϴ�.");
							isId = true;
						}
					}
					if (id.equals("..")) {
						println("ȸ�� �߰��� �����մϴ�.");
						break label;
					}
				} while (isId);
				print("��й�ȣ: ");
				String pwd = sc.next();
				print("�̸���: ");
				String email = sc.next();
				print("��ȭ��ȣ: ");
				String phone = sc.next();
				Home01_per hp = new Home01_per(id, pwd, email, phone);
				list.add(hp);
				println("�߰��Ϸ�Ǿ����ϴ�.\n");
				break;
			}

			case 2: {
				if (list.size() == 0) {
					println("ȸ�������� ���� �������� �ʽ��ϴ�.\n");
					break;
				}
				print("�˻��� ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						println("====�˻����====");
						println(allFind);
						find = true;
						break;
					}
				}
				if (find == false) {
					println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				continue;
			}

			case 3: {
				print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Home01_per allFind = list.get(i);
					if (id.equals(allFind.getId())) {
						list.remove(i);
						println("�����Ǿ����ϴ�.\n");
						find = true;
						break;
					}
				}
				if (find == false) {
					println(" �ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				continue;

			}

			case 4: {
				print("������ ���̵� �Է��ϼ���: ");
				String id = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						print("������ ��й�ȣ�� �Է��ϼ���: ");
						String rePwd = sc.next();
						print("������ �̸����� �Է��ϼ���: ");
						String reEmail = sc.next();
						print("������ ��ȭ��ȣ�� �Է��ϼ���: ");
						String rePhone = sc.next();
						Home01_per rename = new Home01_per(id, rePwd, reEmail, rePhone);
						list.set(i, rename);
						find = true;
						break;
					}
				}
				if (find == false) {
					println("�ش� ���̵� �������� �ʽ��ϴ�.\n");
				}
				break;
			}

			case 5: {
				println("���α׷��� �����մϴ�.");
				flag = true;
				break;
			}

			default:
				println("��ȣ�� �߸� �����ϼ̽��ϴ�.\n");
			}

		}
	}

	/**
	 * ���� ���� ��¹�
	 * 
	 * @param str
	 */
	private static void print(String str) {
		System.out.print(str);
	}

	/**
	 * ��¹�.
	 * 
	 */
	private static void println() {
		System.out.println();
	}

	private static void println(String str) {
		System.out.println(str);
	}

	private static void println(Home01_per book) {
		System.out.println(book);
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

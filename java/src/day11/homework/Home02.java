package day11.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 1.���������� ���� Ŭ������ ����� �߰�,�˻�,����,����,��ü���� �����
����� ������.HashMap�� ����(������ȣ�� key�� ����)
��������:������ȣ,������,����

1.��������
 1)�߰�
 2)�˻�
 3)����
 4)����
 5)��ü����
 */
public class Home02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		HashMap<Integer,V>;
		boolean flag = false;
		HashMap<Integer, Book> map = new HashMap<Integer, Book>();
		while (!flag) {
			System.out.println("<��������>");
			System.out.println("1.�߰� 2. �˻� 3. ���� 4. ���� 5. ��ü���� 6. ����");
			System.out.println("�޴�");
			switch (scan.nextInt()) {
			case 1: {
				// �߰�
				System.out.print("������ȣ�� �Է��ϼ���: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find == null) {
					System.out.print("�������� �Է��ϼ���: ");
					String name = scan.next();
					System.out.print("���������� �Է��ϼ���: ");
					int price = scan.nextInt();
					Book info = new Book(num, name, price);
					map.put(num, info);
					System.out.println("�߰��Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("�ߺ��� ������ȣ�� �ֽ��ϴ�. �ٽ� �Է����ּ���");
				}
				System.out.println();
				break;

			}
			case 2: {
				// �˻�
				System.out.print("�˻��� ������ȣ�� �Է��ϼ���: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					System.out.println(find);
				} else {
					System.out.println("������ȣ�� �������� �ʽ��ϴ�.");
				}
				System.out.println();
				break;
			}
			case 3: {
				// ����
				if (map == null) {
					System.out.println("���������� ���� �������� �ʾ� ������ �� �����ϴ�. ���� ���������� �߰����ּ���.");
				}
				System.out.print("������ ������ȣ�� �Է��ϼ���: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					System.out.print("���ο� �������� �Է��ϼ���: ");
					String newName = scan.next();
					System.out.print("���ο� ���������� �Է��ϼ���: ");
					int newPrice = scan.nextInt();
					Book newInfo = new Book(num, newName, newPrice);
					map.replace(num, newInfo);
				} else {
					System.out.println("������ȣ�� �������� �ʽ��ϴ�.");
				}
				System.out.println();
				break;
			}
			case 4: {
				// ����
				System.out.print("������ ������ȣ�� �Է��ϼ���: ");
				int num = scan.nextInt();
				Book find = map.get(num);
				if (find != null) {
					map.remove(num);
					System.out.println("�����Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("������ȣ�� �������� �ʽ��ϴ�.");
				}
				System.out.println();
				break;
			}
			case 5: {
				// ��ü����
				Collection<Book> co = map.values();
				Iterator<Book> it = co.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				if (!it.hasNext()) {
					System.out.println("���������� ���� �������� �ʽ��ϴ�.");
				}
				break;
			}
			case 6: {
				System.out.println("���α׷��� �����մϴ�.");
				flag = true;
				break;
				// ����
			}
			default:
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}
	}

}

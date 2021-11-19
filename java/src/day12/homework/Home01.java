package day12.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 1.���������� ���� Ŭ������ ����� �߰�,�˻�,����,����,��ü���� ����� ����� ������.HashMap�� ����(������ȣ�� key�� ����)
 * ��������:������ȣ,������,����
 * 
 * @author H.gyoung
 *
 */
public class Home01 {

	public static void main(String[] args) {
		String a = "dd";
		System.out.println(a.toString());
		Scanner sc = new Scanner(System.in);
		boolean flag = false;

		HashMap<Integer, Home01Book> map = new HashMap<>();

		while (flag == false) {
			println("<�������� ���� ���α׷�>");
			println("1.�߰� 2. �˻� 3. ���� 4. ���� 5. ��ü���� 6. ����");
			print("���ϴ� �޴�: ");

			switch (sc.nextInt()) {
			case 1: {
				// �߰�
				print("������ȣ�� �Է��ϼ���: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					print("�������� �Է��ϼ���: ");
					String name = sc.next();
					print("���������� �Է��ϼ���: ");
					int price = sc.nextInt();
					Home01Book info = new Home01Book(num, name, price);
					map.put(num, info);
					println("�߰��Ϸ�Ǿ����ϴ�.");
				} else {
					println("�ߺ��� ������ȣ�� �ֽ��ϴ�. �ٽ� �Է����ּ���");
				}
				println();
				break;
			}
			case 2: {
				// �˻�
				print("�˻��� ������ȣ�� �Է��ϼ���: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("������ȣ�� �������� �ʽ��ϴ�.");
				} else {
					println(find);
				}
				println();
				break;
			}
			case 3: {
				// ����
				if (isNull(map)) {
					println("���������� ���� �������� �ʾ� ������ �� �����ϴ�. ���� ���������� �߰����ּ���.");
				}
				print("������ ������ȣ�� �Է��ϼ���: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("������ȣ�� �������� �ʽ��ϴ�.");
				} else {
					print("���ο� �������� �Է��ϼ���: ");
					String newName = sc.next();
					print("���ο� ���������� �Է��ϼ���: ");
					int newPrice = sc.nextInt();
					Home01Book newInfo = new Home01Book(num, newName, newPrice);
					map.replace(num, newInfo);
				}
				println();
				break;
			}
			case 4: {
				// ����
				print("������ ������ȣ�� �Է��ϼ���: ");
				int num = sc.nextInt();
				Home01Book find = map.get(num);
				if (isNull(find)) {
					println("������ȣ�� �������� �ʽ��ϴ�.");
				} else {
					map.remove(num);
					println("�����Ǿ����ϴ�.");
				}
				println();
				break;
			}
			case 5: {
				// ��ü����
				Collection<Home01Book> co = map.values();
				Iterator<Home01Book> it = co.iterator();
				int cnt = 0;
				while (it.hasNext()) {
					println(it.next());
					cnt++;
				}
				if (cnt == 0) {
					println("���������� ���� �������� �ʽ��ϴ�.");
				}
				break;
			}
			case 6: {
				println("���α׷��� �����մϴ�.");
				flag = true;
				break;
				// ����
			}
			default:
				println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				break;
			}
		}
		sc.close();
	}

	/**
	 * null check �Լ�.
	 * 
	 * @param obj
	 * @return null�� ��� true�� �����Ѵ�.
	 */
	private static boolean isNull(Object obj) {
		return obj == null ? true : false;
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

	private static void println(Home01Book book) {
		System.out.println(book);
	}

}

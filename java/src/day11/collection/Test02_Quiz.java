package day11.collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * �л��̸��� �Է¹޾� ArrayList�� �����ϰ� ��ü �����Ͱ� ��µǵ��� �غ�����
 * �л��̸��� exit�� �Էµɶ����� �Է¹޽��ϴ�.
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while (true) {
			System.out.println("�л��̸��Է�");
			String ob = sc.next();
//			if (sc.next().equals("exit")) {
			if (ob.equals("exit")) {
				System.out.println("��");
				break;
			}
			list.add(ob);
		}
		System.out.println("<�Էµ� �л��̸�>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

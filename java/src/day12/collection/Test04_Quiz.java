package day12.collection;

import java.util.HashMap;
import java.util.Scanner;

/*
 * ȸ�����̵� key�� ȸ���̸��� value�� �����ϴ� hashmap �����ϰ� ������ �����ϱ�
 * 1. ȸ�����̵�� ȸ���� ��ȸ
 * 2. ȸ�����̵�� ȸ���� ����
 */
public class Test04_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "ȸ����");
		hm.put("a", "ȸ��1");
		hm.put("b", "ȸ��2");
		System.out.println("��ȸ�� ȸ�����̵�");
		String find = sc.next();
		String name = hm.get(find);
		if (name != null) {
			System.out.println("ȸ���̸�: " + name);
		} else {
			System.out.println("���̵� �������� �ʾƿ�");
		}
		System.out.println("������ ȸ�� ���̵�");
		String delete = sc.next();
		String s = hm.remove(delete);
		System.out.println(s + "ȸ�� ����!");
		System.out.println("��ü ȸ�� ���");
		System.out.println(hm.entrySet());
//		for (int i = 0; i < hm.size(); i++) {
//		}

	}
}

package day11.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 3�� ȸ���� ���̵� �Է¹޾� HashSet�� �����ϰ� ��ü ���̵� ����غ�����.
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		System.out.println("���̵� �Է��ϼ���");
		hs.add(sc.next());
		hs.add(sc.next());
		hs.add(sc.next());
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

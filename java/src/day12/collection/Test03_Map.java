package day12.collection;

import java.util.HashMap;
import java.util.Scanner;

/*
 * [ Map(*) ]
 * - key�� value�� �ѽ����� �����ϰ� �����ϴ� Ŭ����
 * - key���� �ߺ��� �� ������ value�� �ߺ��� �����ϴ�.
 * - ������ �˻��� �����ϴ�.
 * - �ֿ�޼ҵ�
 *   public V put(K key, V value): key�� value�� �ѽ����� ����
 *   public V remove(Object key): key�� ���εǾ��ִ� value ����
 *   public V get(Object key): key�� ���εǾ��ִ� value ����
 *   public V replace(K key, V value): key�� ���εǾ��ִ� value ����
 */
public class Test03_Map {
	public static void main(String[] args) {
		// key���� Integer,value���� String Ÿ������ ������ HashMap����
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "����1");
		hs.put(2, "����2");
		hs.put(3, "����3");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�� �л���ȣ");
		int n = sc.nextInt();
		String s = hs.get(n);
		if (s == null) {
			System.out.println("�ش��ȣ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("value: " + s);
		}

	}
}

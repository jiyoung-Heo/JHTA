package day07;

import java.util.Scanner;

/*
 * ��������� ���� Ŭ���� ����� ����غ�����
 * �������(�Է�)->�����ȣ/�̸�/����/����
 * �������(���)->�����ȣ/�̸�/����/����/�޿�(����+����)
 * ->����� 3������ �ϰ� ��ü �迭 ����غ�����
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Person[] ps = new Person[3];
//		for (int i = 0; i < ps.length; i++) {
//			ps[i] = new Person();
//			ps[i].input();
//		}
//		for (int i = 0; i < ps.length; i++) {
//			ps[i].output();
//		}
		ps[0] = new Person(1, "��", 100, 1000);
		ps[1] = new Person(2, "��", 300, 1000);
		ps[2] = new Person(3, "��", 200, 14000);
		for (int i = 0; i < ps.length; i++) {
			ps[i].input();
		}
	}
}

class Person {
	Scanner sc = new Scanner(System.in);
	private int num;
	private String name;
	private int bon;
	private int money;

	public Person(int num, String name, int bon, int money) {
		this.num = num;
		this.name = name;
		this.bon = bon;
		this.money = money;
	}

	public void input() {
//		System.out.println("�����ȣ: ");
//		num = sc.nextInt();
//		System.out.println("�̸�: ");
//		name = sc.next();
//		System.out.println("����: ");
//		bon = sc.nextInt();
//		System.out.println("����: ");
//		money = sc.nextInt();
		System.out.println("�����ȣ: " + num);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + bon);
		System.out.println("����: " + money);
		System.out.println("�޿�: " + (bon + money));
		System.out.println();
	}

//	public void output() {
//		System.out.println("�����ȣ: " + num);
//		System.out.println("�̸�: " + name);
//		System.out.println("����: " + bon);
//		System.out.println("����: " + money);
//		System.out.println("�޿�: " + (bon + money));
//		System.out.println();
//	}
}

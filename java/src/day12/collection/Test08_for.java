package day12.collection;

import java.util.ArrayList;

/*
 * [ ���� for�� ]
 * -����
 *  for (�ڷ��� ������: �迭 �Ǵ� �÷���){
 *  	�ݺ�����;
 *  	..
 *  }
 */
public class Test08_for {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		for (int n : a) {// a�迭�� ��Ҹ� ���������� �����ͼ� n�� ����
			System.out.print(n + " ");
		}
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		list.add("������");
		list.add("���޷�");
		list.add("����ȭ");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		// Student��ü 3���� ArrayList�� �����ϰ� ���� for���� �̿��ؼ� ����غ�����
		Student st = new Student(1, "��");
		Student st2 = new Student(2, "��");
		Student st3 = new Student(3, "��");
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(st);
		list2.add(st2);
		list2.add(st3);
		for (Student result3 : list2) {
			System.out.println(result3);
		}
	}

}

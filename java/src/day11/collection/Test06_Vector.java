package day11.collection;

import java.util.Vector;

/*
 * [Vector]
 * - ��ü�� �迭ó�� ������ �ִ� Ŭ����(ArrayList�� ������ ���)
 * - Vector�� ArrayList�� ������
 *   1) VectorŬ������ �������� ����ȭ�� �����Ѵ�.-> ��Ƽ������ȯ�濡���� �����ϰ� ����� �� ������ ���� �ڿ��� �Ҹ��Ͽ� ���̴�.
 *   2) ArrayList�� �������� ����ȭ�� �������� �ʴ´�.-> ��Ƽ������ȯ���� �ƴ϶�� ArrayList�� ����ϴ°��� ȿ�����̴�.
 *   	(������ �޸𸮸� ���� ����Ѵ�.)
 */
public class Test06_Vector {
//Vector ��ü�� �л��̸� �ټ����� �����ϰ� ����غ�����
	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("������");
		vt.add("������2");
		vt.add("������3");
		vt.add("������4");
		vt.add("������5");
		for (int j = 0; j < vt.size(); j++) {
			System.out.println(vt.get(j));
		}
	}
}

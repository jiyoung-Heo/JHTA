package day01.test.bb;

/*
 * [����������]
 * ++a : a=a+1�� �ǹ�
 * --b : b=b-1�� �ǹ�
 * ++,-- ��ȣ�� �տ� ������ ����Ŀ��� ������ ������ �����ϰ�
 * ++,-- ��ȣ�� �ڿ� ������ ����Ŀ��� �������� ���� ������ �����ϰ� ������� ������ ���� �����Ѵ�
 *  
 */
public class Test04 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = ++a;
//		int c = b++;
//		System.out.println("a:" + a);
//		System.out.println("b:" + b);
//		System.out.println("c:" + c);
		int a1 = 10, b1 = 10, c1 = 10, d1 = 0, d2 = 0;
		d1 = ++a1 + 10;
		d2 = b1++ + a1 + c1--;
//		System.out.println("a1:" + a1);
//		System.out.println("b1:" + b1);
//		System.out.println("c1:" + c1);
//		System.out.println("d1:" + d1);
//		System.out.println("d2:" + d2);

		int a2 = 5, b2 = 5, c2 = 5;
		int d3 = ++a2 + b2;
		int e = b2-- + 10;
		int f = c2++ + b2;
		// ���� �������� ���� ����� �����غ�����.
		System.out.println("a2:" + a2);
		System.out.println("b2:" + b2);
		System.out.println("c2:" + c2);
		System.out.println("b3:" + d3);
		System.out.println("e:" + e);
		System.out.println("f:" + f);

	}
}

package day06.method;

/*
 * [����� ���� �޼ҵ�]
 * - ��� ����� ���� �ڵ��� ����
 * - ����
 *  ������ �޼ҵ���(�Ű�����, ...){
 *  	���๮��;
 *  	...
 *  	return;
 *  }
 */
public class Test01_method {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = sum(a, b);
		System.out.println("�μ���" + c);
	}

	public static int sum(int x, int y) {
		int z = x + y;
		return z;
	}
}

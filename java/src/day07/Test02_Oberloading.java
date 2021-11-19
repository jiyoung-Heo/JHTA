package day07;

/*
 * [�����ε�(Overloading)]
 * - ���� �̸��� �޼ҵ带 �ߺ��ؼ� �����ϴ� ��
 * - �޼ҵ� �̸��� ������ �Ķ���� Ÿ���̳� ������ �޶�� �Ѵ�.
 * 
 * ��)
 * class AA{
 * 		int add(int x,int y){...}
 * 		int add(int x, int y, intz}{...}
 */
public class Test02_Oberloading {
	public static void main(String[] args) {
		// add�޼ҵ带 ����ؼ� �� ������ ���� ���Ͽ� ��µǵ��� �غ�����.
		MyMath mm = new MyMath();
		System.out.println(mm.add(3, 2, 3));
	}
}

class MyMath {
	public int add(int x, int y) {
		return x + y;
	}
//	public int add(int x, int y) {//�����ε� �ȵ�
//		return x + y;
//	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public double add(double x, double y) {
		return x + y;
	}
}
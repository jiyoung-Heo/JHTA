package day06.class1;

/*
 * [������]
 * -��ü�� ������ �� �ڵ����� ȣ��Ǵ� �޼ҵ�
 * - �ַ� ����������� �ʱ�ȭ�Ϸ��� �������� �����.
 * - ����� ����
 * 1) Ŭ������� ������ �̸����� �޼ҵ� �̸��� �����
 * 2) ���ϰ��� ������ void�� ���� �ʴ´�.
 * ��)
 * class AA{
 * 		public AA(){}//������
 * 		public AA(inta){//������
 * 		..
 * 		}
 * }
 * 
 */
public class Test04_Constructor {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.printA();
		AA bb = new AA(10);
		bb.printA();
	}
}

class AA {
	private int a;

	public AA() {
		System.out.println("AA�������Դϴ�...");
	}

	public AA(int a) {
		this.a = a;
	}

	public void printA() {
		System.out.println("a: " + a);
	}

}

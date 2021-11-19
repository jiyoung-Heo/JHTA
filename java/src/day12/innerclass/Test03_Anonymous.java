package day12.innerclass;

/*
 * �͸��� ����Ŭ����(*)
 * - �̸��� ���� Ŭ����
 * - �߻�Ŭ������ �������̽��� ��ӹ޾� ���� Ŭ������ �� �ѹ��� ���ǰ� ���̻� ������ ������ �͸���
 * 	 ����Ŭ������ ����� ����Ѵ�.
 * - ����� ���
 *   �������̽���(�Ǵ� �߻�Ŭ������) ��ü�� = new �������̽���(�Ǵ��߻�Ŭ������)(){
 *   	�߻�޼ҵ�������̵�(){}
 *   };
 */
interface Shape {
	void draw();
}

public class Test03_Anonymous {
	public static void main(String[] args) {
		// Shape�������̽��� �����ϴ� Ŭ������ ���ó���Ŭ������ ����� �޼ҵ带 ȣ���غ�����.
		class Circle implements Shape {
			@Override
			public void draw() {
				System.out.println("���� �׸���");
			}
		}
		Circle c = new Circle();
		c.draw();
		Circle c2 = new Circle();
		c2.draw();
		/*
		 * �������̽���(�Ǵ� �߻�Ŭ������) ��ü�� = new �������̽���(�Ǵ��߻�Ŭ������)(){ �߻�޼ҵ�������̵�(){} };
		 */
		Shape s = new Shape() {// �̸��� ���� Ŭ������
			public void draw() {
				System.out.println("Ÿ���׸���");
			}
		};
		// �̸��� ���� Ŭ�����̱� ������ ��ü�� ���� �� ��� �� �ѹ��� �����ִ�.
		s.draw();
		new Shape() {
			public void draw() {
				System.out.println("�����׸���");
			}
		}.draw();
	}
}

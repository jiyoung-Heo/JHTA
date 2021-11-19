package day17.java8;

/*
 * [���ٽ�]
 * - jdk1.8�������� �߰��� ���
 * - �޼ҵ带 �ϳ��� ������ �����ϰ� ǥ���Ѱ�
 * - ����
 *   (�ڷ��� ����)-> (�޼ҵ� �����ڵ�;)
 * - �Լ��� �������̽������� ���ٽ��� ����� �� �ִ�.
 */
public class Test01_Lambda {
	public static void main(String[] args) {
		// myMath �������̽��� �͸��� ����Ʋ������ ����� add�޼ҵ带 ȣ���غ�����

		Mymath mm = new Mymath() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		// ���ٽ����� �ٲ㺸��
//		Mymath m2 = (int a, int b)->{return a+b;};
		// �Ű�����Ÿ�� ��������, �����ڵ尡 return�� �ϳ��ΰ�� return ��������
		Mymath m2 = (a, b) -> {
			return a + b;
		};
		System.out.println("�μ���" + m2.add(3, 4));
		System.out.println("ū��" + m2.max(2, 1));
		Shape m3 = new Shape() {
			public void draw() {
				System.out.println("�簢���׸���");
			}
		};
		// Shape��ü�� ���ٽ��� ����ؼ� ����� �޼ҵ带 ȣ���غ�����
		Shape m4 = () -> {
			System.out.println("Ÿ���׸���");
		};
		m3.draw();
		m4.draw();
		// MyCircle��ü�� ����� �޼ҵ带 ȣ���غ�����
		// MyCilcle c = (double r)->{return r*r*3.14;};
		MyCilcle a = r -> r * r * 3.14;
		System.out.println(a.circle(3));
	}
}

@FunctionalInterface
interface Mymath {
	int add(int a, int b);

	// ����Ʈ�޼ҵ�-> jdk1.8������ �߰��� ���
	default int max(int a, int b) {
		return (a > b) ? a : b;
	}
}

@FunctionalInterface
interface MyCilcle {
	double circle(double r);
}

@FunctionalInterface
interface Shape {
	void draw();
}
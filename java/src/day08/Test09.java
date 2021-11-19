package day08;

public class Test09 {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setXY(100, 200);
		Circle c = new Circle();
		c.setXY(300, 400);
		printer(r);
		printer(c);
		boolean a = r instanceof Rect;// r�� Rect�� ��ü Ÿ���ΰ�? true/false
		System.out.println("a: " + a);
		if (r instanceof Shape) {
			System.out.println("���� r �� Shape Ÿ���Դϴ�");
		}
		if (c instanceof Shape) {
			System.out.println("���� c �� Shape Ÿ���Դϴ�");
		}
		// �����ͷ� ������ ĥ�ϴ� paint�޼ҵ带 ��������.
		paint(r);// paint�޼ҵ忡�� paintRect�Ǵ� paintCircle�� ȣ��ǵ���
		paint(c);
	}

	public static void paint(Shape a) {
		if (a instanceof Rect) {
			Rect c1 = (Rect) a;
			c1.paintRect("red");
		}
		if (a instanceof Circle) {
			Circle c1 = (Circle) a;
			c1.paintCircle("blue");
		}
	}

	public static void printer(Shape a) {
		System.out.println("�����ͷ� �Ʒ� ��������ϱ�");
		a.draw();
	}
}

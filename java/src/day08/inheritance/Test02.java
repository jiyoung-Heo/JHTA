package day08.inheritance;

public class Test02 {
	public static void main(String[] args) {
		// MyBox��ü�� �����ؼ� �簢�� ���� ���غ�����
		MyBox mb = new MyBox();
		mb.setXY(300, 200);
		System.out.println(mb.getAres());
		MyRealBox mrb = new MyRealBox();
		mrb.setXY(10, 20);
		mrb.setXYZ(7);
		System.out.println(mrb.bupi());
	}
}

class MyBox {
	protected double x;
	protected double y;

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getAres() {
		return x * y;
	}
}

class MyRealBox extends MyBox {
	protected double z;

	public void setXYZ(double z) {
//		this.x = x;
//		this.y = y;
		this.z = z;
	}

	public double bupi() {
		return x * y * z;
	}
}
//MyBox�� ��ӹ޾� ���Ǹ� ���ϴ� ����� ���� Ŭ������ ����� ����غ�����. 
//����=����*����*����

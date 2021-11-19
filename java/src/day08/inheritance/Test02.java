package day08.inheritance;

public class Test02 {
	public static void main(String[] args) {
		// MyBox객체를 생성해서 사각형 넓이 구해보세요
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
//MyBox를 상속받아 부피를 구하는 기능을 갖는 클래스를 만들고 사용해보세요. 
//부피=가로*세로*높이

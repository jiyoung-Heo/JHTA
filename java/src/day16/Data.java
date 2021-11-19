package day16;

//공유자원객체
public class Data {
	private int[] b = new int[100];

	public void setB(int a, int i) {
		b[i] = a;
	}

	public int[] getB() {
		return b;
	}
}

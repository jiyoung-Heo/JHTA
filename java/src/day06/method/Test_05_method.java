package day06.method;

public class Test_05_method {
	public static void main(String[] args) {
		int a = sum(10, 20);
		System.out.println("�μ���: " + a);
		int b = sum(10, 20, 30);
		System.out.println("������: " + b);
	}

	public static int sum(int... x) {// �������� ����(���޵� ���ڰ����� �Ű������� �迭���·� ����
		int s = 0;
		for (int i = 0; i < x.length; i++) {
			s += x[i];
		}
		return s;
	}
}

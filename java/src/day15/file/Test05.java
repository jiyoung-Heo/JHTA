package day15.file;

//��� �޼ҵ�- �ڱ��ڽ��� ȣ���ϴ� �޼ҵ�
//��� �޼ҵ带 ����ؼ� ���丮�� ���ϱ�
public class Test05 {
	public static void main(String[] args) {
		int n = 4;
		long num = fac(n);
		System.out.println(n + "!=" + num);
	}

	public static long fac(int n) {
		return (n > 1) ? n * fac(n - 1) : n;
	}
}

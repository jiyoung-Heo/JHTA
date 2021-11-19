package day10.javaApi;

public class Test01_String {
	public static void main(String[] args) {
		// public String(char[] value)
		char[] c = { 'H', 'E', 'L', 'L', 'O' };
		String s1 = new String(c);
		System.out.println(s1.toString());
		System.out.println(s1);// .toString() �� ������
		// public String toLowerCase(): ���ڿ��� �ҹ��ڷ� ��ȯ
		System.out.println(s1.toLowerCase());
		// public int length(); : ���ڿ� ���� ����
		System.out.println(s1.length());
		// public String substring(int bigisIndex, int endIndex)
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(1));
		String s2 = "02325122";
		// public boolean startWith(String prefix)
		// s2�� 02�� �����ϸ� ���������Դϴ�. �ƴϸ鼭�������� �ƴմϴٶ�� ��µǵ��� �غ�����
		if (s2.startsWith("02")) {
			System.out.println("���������Դϴ�");
		} else {
			System.out.println("���������� �ƴմϴ�");
		}
		// public char charAt(int index) : index��ġ�� �ش��ϴ� �����ϳ�(char)��������
		String s3 = "Hello";
		System.out.println(s3.charAt(1));
		// public int indexOf(String str): str���ڿ��� ��ġ�� ����, �ش繮�ڿ��� ������ -1 ����
		int n = s3.indexOf("@");// s3���ڿ��� @�� ������ -1 n�� ����
		System.out.println(s3.indexOf('o'));
		if (n == -1) {
			System.out.println("��ȿ���� ���� �̸��� �ּ��Դϴ�.");
		}
		char[] c3 = { '��', '��', '��', '��' };
		// public String(char[] value, int offset, int count)->�����ڸ� ����ؼ� "�ڹ�"���ڿ��� ����
		// String ��ü�� ����� ����غ�����.
		String s5 = new String(c3, 2, 2);
		System.out.println(s5);
		// public String(byte[] bytes)
		byte[] bytes = { 65, 66, 67, 68, 69, 70 };
		String s6 = new String(bytes);
		System.out.println(s6);
		char[] c4 = { 'h', 'i', '��', '��' };
		// �Ʒ� �޼ҵ带 ����ؼ� c4�� String ���ڿ��� ��ȯ�غ�����
		// public static String copyValueOf(char[] data)
//		String ss = new String();
		System.out.println(String.copyValueOf(c4));
		// public String[] split(String regex)
		String s8 = "ȫ�浿, �̱浿, ��浿, �ֱ浿";
		String[] s9 = s8.split(",");// �޸� �������� ���ڿ��� �ɰ��� String �迭�� ����
		for (int i = 0; i < s9.length; i++) {
			System.out.println(s9[i]);
		}
	}

}

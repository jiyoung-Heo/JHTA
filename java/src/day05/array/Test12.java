package day05.array;

public class Test12 {
	public static void main(String[] args) {
		String[][] a = { { "ȫ�浿", "010-111-1234", "����� ���α�", "hong@" }, { "�̵���", "010-222-1234", "����� ������", "lee@" },
				{ "����", "010-333-1234", "����� ���ı�", "sam@" } };
		System.out.print("���� ũ��: " + a.length);
		System.out.println("���� ũ��: " + a[0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

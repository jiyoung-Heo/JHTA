package day07;

public class Test05_Array {
	public static void main(String[] args) {
		Member[] mm = new Member[3];// �ν��Ͻ��� 3�� ������ ���� �ƴ϶� Member��ü�� ������ �� �ִ� ���������� �迭�� 3�� �������

		mm[0] = new Member("Test1", "1234");
		mm[1] = new Member("Test2", "0000");
		mm[2] = new Member("Test3", "1010");
		for (int i = 0; i < mm.length; i++) {
			mm[i].show();
		}
	}
}

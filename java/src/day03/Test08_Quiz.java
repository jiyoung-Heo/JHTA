package day03;

/*
 * for ���� ����ؼ� 2�ܺ��� 9�ܱ��� ������ �����
 * [��°��]
 * 2�� 2*1=2 ...... 2*9=18
 * 3�� ....
 * ...
 * 9��
 * 
 *---------------
 *2*1=2 3*1=3 ...... 9*1=9
 *2*2=4........
 *.......
 *2*9=18 ...
 */
public class Test08_Quiz {
//	public static void main(String[] args) {
//		System.out.println("[��°��]");
//		for (int i = 2; i <= 9; i++) {
//			System.out.print(i + "��: ");
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + "	");
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		System.out.println("[��°��]");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "	");
			}
			System.out.println();

		}
	}
}

package day03;

/*
 * [����for��]
 * ����)
 * for(�ʱ��;���ǽ�;������){
 * 		for(�ʱ��;���ǽ�;������){
 * 			�ݺ������ҹ���;
 * 			..
 * 
 *		}
 *}
 *
 */
public class Test06_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package day04;

/*
 * [while��]
 * - ������ �����϶����� �ݺ��ؼ� ������ �����Ѵ�.
 * ����)
 * while(���ǽ�){
 * 		�ݺ������ҹ���
 * 		...
 * }
 * 
 */
public class Test01_while {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += 1;
			i++;
		}
		System.out.println("1���� 100������ ��: " + sum);
	}
}

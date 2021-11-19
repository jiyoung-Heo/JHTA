package day04;

/*
 * 구구단 출력
 * 문2.
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */
public class Test04_Quiz {
	public static void main(String[] args) {
//		int n = 2;
//		int num = 1;
//		while (n <= 9) {
//			System.out.print("[" + n + "단]");
//			while (num <= 9) {
//				System.out.print(" " + n + "*" + num + "=" + n * num + " ");
//				num++;
//				continue;
//			}
//			if (num == 10) {
//				num = 0;
//			}
//			System.out.println();
//			n++;
//		}
		int n = 0;
		char a = 'A';
		int line = 1;
		while (line <= 5) {
			while (n < line) {
				System.out.print((char) (a + n));
				n++;
			}
			n = 0;
			System.out.println();
			line++;
		}
	}
}

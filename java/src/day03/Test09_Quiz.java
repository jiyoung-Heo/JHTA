package day03;

/*
 * for문 사용해서 알파벳 출력하기(65~90)
 * ABCD...Z
 * for문 사용해서 아래처럼 출력하기
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */
public class Test09_Quiz {
	public static void main(String[] args) {
//		char a = 'A';
//		System.out.println(a);
//		System.out.println((int) a);
//		int b = a + 1;
//		System.out.println(b + "," + (char) b);
//		for (int i = 65; i <= 90; i++) {
//			System.out.print((char) i);
//		}
		for (int i = 1; i <= 5; i++) {
			for (char j = 'A'; j < (int) 'A' + i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

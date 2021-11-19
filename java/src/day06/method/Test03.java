package day06.method;

/*
 * [메소드의 여러형태]
 * -매개변수나 리턴문이 있을수도 있고 없을수도 있음
 * - 리턴문이 없으면 리턴타입을 void로 표기한다.
 */
public class Test03 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		printArray(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
//		}
//		System.out.println();
		int[] b = { 11, 12, 13, 14, 15, 16, 17 };
		printArray(b);

		// 배열의 합을 구하는 메소드를 만들고 결과가 출력될수 있도록 완성해 보세요.
		int s = getSum(a);
		System.out.println("배열합: " + s);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}

	public static int getSum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

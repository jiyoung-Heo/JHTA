package day07.homework;

//2. 아래와 같은 프로그램이 실행될 수 있도록 MyArray클래스를 만들어 보세요.
public class Home02 {
	public static void main(String[] args) {
		int[] a = { 4, 6, 29, 10, 30 };
		int s = MyArray.sum(a); // 배열의 합 구하기
		System.out.println("배열합:" + s);
		MyArray.printArray(a); // 배열요소를 출력
		int max = MyArray.max(a); // 배열요소중 가장 큰값을 얻어옴
		System.out.println("배열요소중가장큰값:" + max);
	}
}

class MyArray {
	private static int sum2;
	private static int bigger;

	public static int sum(int[] a) {
		for (int i = 0; i < a.length; i++) {
			sum2 += a[i];
		}
		return sum2;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int max(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (bigger < a[i]) {
				bigger = a[i];
			}
		}
		return bigger;
	}
}

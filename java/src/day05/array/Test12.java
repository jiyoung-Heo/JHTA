package day05.array;

public class Test12 {
	public static void main(String[] args) {
		String[][] a = { { "홍길동", "010-111-1234", "서울시 종로구", "hong@" }, { "이동순", "010-222-1234", "서울시 강남구", "lee@" },
				{ "삼길순", "010-333-1234", "서울시 송파구", "sam@" } };
		System.out.print("행의 크기: " + a.length);
		System.out.println("열의 크기: " + a[0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

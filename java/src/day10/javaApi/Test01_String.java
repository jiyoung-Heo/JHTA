package day10.javaApi;

public class Test01_String {
	public static void main(String[] args) {
		// public String(char[] value)
		char[] c = { 'H', 'E', 'L', 'L', 'O' };
		String s1 = new String(c);
		System.out.println(s1.toString());
		System.out.println(s1);// .toString() 이 생략됨
		// public String toLowerCase(): 문자열을 소문자로 변환
		System.out.println(s1.toLowerCase());
		// public int length(); : 문자열 길이 리턴
		System.out.println(s1.length());
		// public String substring(int bigisIndex, int endIndex)
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(1));
		String s2 = "02325122";
		// public boolean startWith(String prefix)
		// s2가 02로 시작하면 서울지역입니다. 아니면서울지역이 아닙니다라고 출력되도록 해보세요
		if (s2.startsWith("02")) {
			System.out.println("서울지역입니다");
		} else {
			System.out.println("서울지역이 아닙니다");
		}
		// public char charAt(int index) : index위치에 해당하는 글자하나(char)꺼내오기
		String s3 = "Hello";
		System.out.println(s3.charAt(1));
		// public int indexOf(String str): str문자열의 위치를 리턴, 해당문자열이 없으면 -1 리턴
		int n = s3.indexOf("@");// s3문자열에 @가 없으면 -1 n에 저장
		System.out.println(s3.indexOf('o'));
		if (n == -1) {
			System.out.println("유효하지 않은 이메일 주소입니다.");
		}
		char[] c3 = { '안', '녕', '자', '바' };
		// public String(char[] value, int offset, int count)->생성자를 사용해서 "자바"문자열을 갖는
		// String 객체를 만들고 출력해보세요.
		String s5 = new String(c3, 2, 2);
		System.out.println(s5);
		// public String(byte[] bytes)
		byte[] bytes = { 65, 66, 67, 68, 69, 70 };
		String s6 = new String(bytes);
		System.out.println(s6);
		char[] c4 = { 'h', 'i', '자', '바' };
		// 아래 메소드를 사용해서 c4를 String 문자열로 변환해보세요
		// public static String copyValueOf(char[] data)
//		String ss = new String();
		System.out.println(String.copyValueOf(c4));
		// public String[] split(String regex)
		String s8 = "홍길동, 이길동, 삼길동, 최길동";
		String[] s9 = s8.split(",");// 콤마 기준으로 문자열을 쪼개며 String 배열로 리턴
		for (int i = 0; i < s9.length; i++) {
			System.out.println(s9[i]);
		}
	}

}

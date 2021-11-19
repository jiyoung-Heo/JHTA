package day15.file;

//재귀 메소드- 자기자신을 호출하는 메소드
//재귀 메소드를 사용해서 팩토리얼값 구하기
public class Test05 {
	public static void main(String[] args) {
		int n = 4;
		long num = fac(n);
		System.out.println(n + "!=" + num);
	}

	public static long fac(int n) {
		return (n > 1) ? n * fac(n - 1) : n;
	}
}

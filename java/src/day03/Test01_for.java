package day03;

/*
 * [반복제어문]
 * -for문
 * 형식)
 * for(초기식;조건식;증감식){
 * 		반복실행할문장;
 * 		..
 * }
 * - 조건식이 만족하지 않을때까지 반복적으로 문장을 반복수행함
 */
public class Test01_for {
	public static void main(String[] args) {

		// 1부터 100까지 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합: " + sum);
		int sum2 = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum2 = sum2 + i;
		}
		System.out.println("1부터 100까지의 홀수합: " + sum2);
	}
}

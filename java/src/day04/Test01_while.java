package day04;

/*
 * [while문]
 * - 조건이 거짓일때까지 반복해서 문장을 수행한다.
 * 형식)
 * while(조건식){
 * 		반복수행할문장
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
		System.out.println("1부터 100까지의 합: " + sum);
	}
}

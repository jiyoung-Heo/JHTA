package day03;

/*
 * [다중for문]
 * 형식)
 * for(초기식;조건식;증감식){
 * 		for(초기식;조건식;증감식){
 * 			반복수행할문장;
 * 			..
 * 
 *		}
 *}
 *
 */
public class Test06_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

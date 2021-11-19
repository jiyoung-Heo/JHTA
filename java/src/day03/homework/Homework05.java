package day03.homework;

//5. for문을 사용해서 아래처럼 출력해 보세요.
//System.out.print(" ");
//System.out.print("*");
//     *
//    **
//   ***
//  ****
// *****
public class Homework05 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

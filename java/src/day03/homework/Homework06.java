package day03.homework;

//6. for문을 사용해서 아래처럼 출력해 보세요.
//****
// ***
//  **
//   *
public class Homework06 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

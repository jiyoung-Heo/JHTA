package day13.exception;

import java.util.Scanner;

/*
 * [ 예외(Exception) ]
 * - 예외 : 프로그램 실행중에 발생하는 경미한 에러
 * - 예외처리 : 예외가 발생되었을때 이에 대한 적절한 처리를 하는것
 * - 형식)
 *   try{
 *   	예외가 발생될수 있는 실행문장;
 *      ..
 *   }catch(예외타입 참조변수){
 *     예외가 발생되었을때 수행할 문장;
 *     ..
 *   }catch(예외타입 참조변수){
 *     예외가 발생되었을때 수행할 문장;
 *     ..
 *   }finally{
 *   	예외와 상관없이 무조건 수행해야 할 문장
 *   }
 *   ==> 예외가 발생될 수 있는 문장을 try{}블록으로 묶고 catch절에서 예외에 따른 적절한 처리를 한다.
 */
public class Test01_exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째 수 입력(종료:0)");
			int n1 = sc.nextInt();
			if (n1 == 0)
				break;
			System.out.println("두번째 수 입력");
			int n2 = sc.nextInt();
			try {
				int n3 = n1 / n2;
				System.out.println(n1 + "/" + n2 + "=" + n3);

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수는 없습니다.");
				System.out.println("오류메세지" + e.getMessage());
			}
		}
	}
}

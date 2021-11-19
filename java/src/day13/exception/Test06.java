package day13.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * - 자바에는 두가지 종류의 exception이 있다.
 * 1) ChechedException
 *   - RuntimeException를 상속받지 않은 예외클래스
 *   - 반드시 try~catch절로 예외처리를 해야 하며 예외처리를 하지 않으면 컴파일시에 오류가 발생된다.
 *   예) IOException, SQLException,..
 * 2) UnCheckedException
 *   - RuntimeException을 상속받은 예외 클래스
 *   - try~catch절로 예외처리를 하지 않아도 컴파일시 에러가 발생되지 않으며 프로그래머가 선택적으로 예외처리를 한다.
 *   예) NumberFormatException, ArithemeticException,...
 */
public class Test06 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("한 문장을 입력하세요");
		// public String readline() throws IOException
		try {
			String line = br.readLine();
			System.out.println("입력된 문장: " + line);

		} catch (IOException e) {
			System.out.println("오류입니다. 다시 입력하세요");
			System.out.println("오류내용: " + e.getMessage());
		}
	}
}

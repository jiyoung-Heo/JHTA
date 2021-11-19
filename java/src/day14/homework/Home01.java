package day14.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//1.영어단어와 뜻을 키보드로 입력받아 PrintWriter를 사용해서 파일로 저장해 보세요.
//## 파일 eng.txt
//love,사랑하다
//apple,사과
//yellow,노랑
//
//"0"입력하면 종료
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		try {
			// PrintWriter클래스의 객체 pw를 생성해준다.
			pw = new PrintWriter("eng.txt");
			while (true) {
				// 입력받기(Scanner를 통해 입력)
				System.out.println("영어단어를 입력하세요. 0을 입력하면 종료됩니다.");
				// 영어 단어를 입력 받는다.
				String eng = sc.next();
				// 만약에 입력받은 단어가 0이라면 파일에 입력하는것을 중지시킨다.
				if (eng.equals("0")) {
					System.out.println("입력을 종료합니다.");
					// break를 통해 while문을 빠져나가 입력을 종료함.
					break;
				}
				System.out.println(eng + "의 뜻을 입력하세요");
				// 영어단어의 뜻을 입력받는다.
				String kor = sc.next();

				// 파일에 적기
				// 입력받은 단어와 뜻을 단어,뜻 의 구조로 적어준다. ln이므로 이후 개행처리 해줌.
				pw.println(eng + "," + kor);
				pw.flush();
			}
		} catch (IOException e) {
			// 오류가 어디서 났는지 경로를 알려주는 메소드
			e.printStackTrace();
			// 오류메세지출력시키기
			System.out.println(e.getMessage());
		} finally {
			// 오류가 발생하던 안하던 실행시키는 finally를 통해
			// eng.txt가 비어있지 않은경우(뭔가가 적어진경우) pw객체를 닫아서 파일에 적는것을 최종적으로 종료시켜준다.
			if (pw != null) {
				pw.close();
			}
		}
	}
}
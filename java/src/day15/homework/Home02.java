package day15.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//2. 파일에 저장된 모든 회원정보를 읽어와 화면에 출력하기
public class Home02 {
	public static void main(String[] args) {
		try {
			// br객체 생성
			BufferedReader br = new BufferedReader(new FileReader("D:\\hta_JAVA\\bb\\hi.txt"));
			// br이 읽을게 더 있으면
			while (br.ready()) {
				// readLine 해준다.
				System.out.println(br.readLine());
			}
			// 예외처리
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

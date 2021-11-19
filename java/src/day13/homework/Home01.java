package day13.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//1. 영문으로 문자열을 입력받아 test.txt파일로 저장하는 프로그램을 작성해 보세요. 

public class Home01 {
	public static void main(String[] args) {
		// InputStream을 통해 문자열을 입력받는다.
		InputStream in = System.in;
		// Reader객체를 생성해준다.
		Reader r = new InputStreamReader(in);
		try {
			// home.txt파일을 읽을 수 있는 FileReader객체를 만든다.
			FileWriter fw = new FileWriter("home.text");
			// 문자열을 담아줄 char 배열 객체 cbuf를 만든다.
			char[] cbuf = new char[100];
			// 영문문자열을 입력받는다.
			System.out.println("영문 문자열을 입력하세요");
			int eng = r.read(cbuf);
			// 예를 들어 문자열이 abc일경우 cbuf에 저장된값은 a,b,c,\r,\n이다.
			// 따라서 for문을 eng-2만큼 반복하여 a,b,c값만 호출되게 한다.
			/*
			 * <eng-2를 한 이유!!!!!!> r.read(cbuf) 로 abc+ 엔터를 치면 read로 받게 되는 값은 a,b,c, 그리고
			 * 엔터이다. 엔터는 리눅스에서는 \n, 윈도우에서는 \r\n 이다. 그래서 읽어온 값을 배열로 처리하면
			 * cbuf[0]=a,...cbuf[3]=\r, cbuf[4]=\n 이다. cbuf[3]과 cbuf[4]는 if문의 조건을 충족하지
			 * 못하기때문에 fw에 입력되지 않고 else로 빠지게 되는데 else일 경우 영어만 입력해주세요가 출력되므로 abc가 저장된 후 영어만
			 * 입력해주세요가 출력되게 된다.(이렇게 나오지 않기 위해 -2한다.) 따라서 cbuf[3],[4]를 제외한 값들만 포문 돌려줘서 else의
			 * sysout이 출력되는경우를 제거해야한다. 만약에 else를 안쓰면 -2 안해도 정상적으로 출력이 된다~~!
			 */
			for (int j = 0; j < eng - 2; j++) {
				// 만약 cbuf[j]값이 알파벳이거나 공백일 경우 fw객체에 해당 캐릭터를 써준다.
				if (Character.isAlphabetic(cbuf[j]) || cbuf[j] == ' ') {
					fw.write(cbuf[j]);
					// 만약 아니라면 영어만 입력하라고 출력하고 종료한다.
				} else {
					System.out.println("영어만 입력해주세요.");
					break;
				}
			}
			// fw에 남아있는 정보값을 버려준다.
			fw.flush();
			// FileWriter객체 fw를 닫아준다.
			fw.close();
			// 예외처리
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

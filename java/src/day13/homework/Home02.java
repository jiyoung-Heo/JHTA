package day13.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Home02 {
	public static void main(String[] args) {
		try {
			// test.txt파일을 읽을 수 있는 FileReader객체를 만든다.
			FileReader fr = new FileReader("test.txt");
			// upper_test.txt파일에 대문자를 넣어 줄 FileWriter객체를 만든다.
			FileWriter fw = new FileWriter("upper_test.txt");
			while (true) {
				// test.txt파일 객체인 fr를 한 character씩 읽어서 a에 넣어준다.
				int a = fr.read();
				// 만약 a가 -1(더 읽을게 없을 때 나오는 결과값)이면 읽어오는걸 중지해준다.
				if (a == -1) {
					break;
				}
				// 만약 저장된 a값이 소문자라면 대문자값으로 변환해준다.(아스키코드상 소문자에서 32를 빼면 해당대문자값이다.)
				if ('a' <= a && 'z' >= a) {
					fw.write((char) (a - 32));
				} else {
					fw.write((char) a);
				}
			}
			// 저장이 완료되면 FileReader객체와 FileWriter객체를 닫아준다.
			fr.close();
			fw.close();
			// 예외처리
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
//2. 프로그램을 실행하면 test.txt파일의 모든 내용을 대문자로 
//변환해 upper_test.txt파일에 저장되도록 만들어 보세요.
//## test.txt
//hello!
//my name is hong gil dong.
//
//==> 프로그램 실행후 upper_test.txt파일에 아래처럼 저장된다.
//HELLO!
//MY NAME IS HONG GIL DONG.
package day13.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 원본파일명과 복사될 파일명을 입력받아 파일복사하는 프로그램을 작성해보세요
 * 예)
 * 원본파일명입력 hello.txt
 * 복사될파일명입력 copy.txt
 * -->hello.txt파일의 내용이 복사된 copy.txt파일 생성
 * FileReader, FileWriter 사용
 */
public class Test08_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본 파일명");
		String ofg = sc.nextLine();
		System.out.println("복사될 파일명");
		String copy = sc.nextLine();
		try {
			// 입력받은 파일명을 FileReader객체에 저장한다.
			FileReader fr = new FileReader(ofg);
			// 입력받은 파일명을 FileWriter객체에 저장한다.
			FileWriter fw = new FileWriter(copy);
			while (true) {
				// fr을 한 character씩 읽어서 a에 넣어준다.
				int a = fr.read();
				// 만약 a가 -1(더 읽을게 없을 때 나오는 결과값)이면 읽어오는걸 중지해준다.
				if (a == -1) {
					break;
				}
				// fw에 읽어온 a값을 저장해준다.(복사)
				fw.write((char) a);
			}
			// 저장이 완료되면 FileReader객체와 FileWriter객체를 닫아준다.
			fr.close();
			fw.close();
			System.out.println("복사완료!");
			// 예외처리
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

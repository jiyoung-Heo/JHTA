package day14.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 키보드로 읽어올 텍스트파일명을 입력받아 해당 내용을 화면에 출력해보세요
 * 예) 불러올파일명
 * c:\java1\아리랑.txt
 * [화면에 출력되는 내용]
 * 아리랑 아리랑 아라리요
 * 아리랑 고개로 넘어간다...
 * 나를 버리고 가시는 님은...
 */
public class Test12_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력해주세요");
		String arr = sc.next();
		try {
			BufferedReader br = new BufferedReader(new FileReader(arr));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

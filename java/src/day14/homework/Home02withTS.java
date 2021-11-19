package day14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Home02withTS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("eng.txt"))) {
			// 읽기
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] spl = line.split(",");
				map.put(spl[0], spl[1]);
			}

			// 찾기
			while (true) {
				System.out.println("영어단어를 입력하세요. 종료:0");
				String read = sc.next();
				String value = map.get(read);

				if (read.equals("0")) {
					System.out.println("종료합니다.");
				}

				if (value == null) {
					System.out.println("해당하는 단어가 없습니다.");
				} else {
					System.out.println(read + "의 뜻: " + value);
				}

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

//2.아래와 같은 eng.txt파일이 있을때 파일을 읽어와 아래와 같은 작업이 
//이루어지도록 프로그램을 작성해 보세요.
//## 파일 eng.txt
//love,사랑하다
//apple,사과
//yellow,노랑
//....
//
//##프로그램
//영어단어:apple
//apple의 뜻:사과
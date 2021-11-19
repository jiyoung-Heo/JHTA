package day14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
public class Home02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// eng.txt.파일을 버퍼를 통해 읽어올 br객체를 생성한다.
			BufferedReader br = new BufferedReader(new FileReader("eng.txt"));
			// 일단 line을 초기화해준다.
			String line = "";
			while (true) {
				// .ready(): 뒤에 더 읽어줄 게 있니? boolean타입결과값이 나오는 메소드이다.
				while (br.ready()) {
					// 만약 뒤에 더 읽을게 있으면 String타입인 .readLine으로 한줄을 받아온다.
					// 받아와서 line에 추가해준다.예)love,사랑한다 읽어와짐
					line += br.readLine();
					// line에 ,를 추가해준다 --> 결과적으로 love,사랑한다,apple,사과 ... 이런식으로 line에 저장됨.
					line += ",";
				}
				// 만약 읽어온게 없어서 line값이 null이면 while문 밖으로 나가게 한다.(읽기종료)
				if (line == null) {
					break;
				}
				// ,를 기준으로 잘라서 값들을 spl배열에 넣어준다. 그렇게 자르게 되면
				// 0,2,4...번째 배열에 영어가 들어있음, 즉 1번배열에는 0번째영어에 대한 뜻이 담겨있음/ ==>짝수배열에는 영어, 홀수배열에는 뜻이
				// 있는거
				String[] spl = line.split(",");
				System.out.println("영어단어를 입력하세요. 종료:0");
				// 검색할 영어단어를 입력받는다.
				String read = sc.next();
				// 만약 0이 입력되면 종료시킨다.
				if (read.equals("0")) {
					System.out.println("종료합니다.");
					break;
				}
				// cnt값을 초기화해준다.
				int cnt = 0;
				for (int i = 0; i < spl.length; i += 2) {
					// for문으로 0,2,4...번째 spl배열의 값(저장된 영어들)을 검색할 영어단어와 비교해준다.
					if (spl[i].equals(read)) {
						// 만약 동일하다면 spl[i+1](i값(영어)에 대한 뜻 저장되어있는곳 을 출력시켜준다.
						System.out.println(read + "의 뜻: " + spl[i + 1]);
						// 출력이되었다면 cnt를 하나 더해준다.
						cnt++;
						break;
					}
				}
				// 만약 cnt가 더해지지 않았다면 같은영어단어가 없었다는 뜻이므로 해당 sysout출력
				if (cnt == 0) {
					System.out.println("해당하는 단어가 없습니다.");
				}
			}
			// br 모두 종료
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

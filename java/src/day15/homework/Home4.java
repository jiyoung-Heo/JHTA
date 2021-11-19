package day15.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//3. 디렉토리 복사하는 프로그램을 작성하기(조금 어려워요..)
//예)
//복사할 폴더
//c:\java
//복사본 폴더
//c:\java_copy
//java폴더가 java_copy폴더에 복사됨 
public class Home4 {
	public static void main(String[] args) {
		// 복사할 디렉토리와 복사될 디렉토리를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("복사할 디렉토리를 입력하세요");
		String oriDir = sc.next();
		System.out.println("복사될 디렉토리를 입력하세요");
		String finDir = sc.next();
//		File ori = new File("D:\\hta_JAVA\\bb");
//		File dest = new File("D:\\hta_JAVA\\bb2");
		// 입력받은 디렉토리를 파일클래스 객체에 저장해준다.
		File ori = new File(oriDir);
		File dest = new File(finDir);
		// 복사할 가장상위 디렉토리를 만들어준다.
		dest.mkdir();
		// static이 아닌copy메소드를 불러오기위해 객체를 생성한다.
		Home4 t = new Home4();
		// copy메소드를 호출한다.
		t.copy(ori, dest);
	}

	public void copy(File ori, File dest) {
		// ori.listFiles()를 file에 ori.listfiles() 배열 순서대로 넣어준다.
		for (File file : ori.listFiles()) {
			// 만약에 file이 디렉토리일 경우
			if (file.isDirectory()) {
				// 복사할 디렉토리 내부의 폴더를 만들어주기위해 newdir객체를 통해 세부폴더명을 입력한다.
				File newdir = new File(dest + "\\" + file.getName());
				// newdir 디렉토리를 만들어준다.
				newdir.mkdir();
				// 원본디렉토리의 내부디렉토리에서 파일이 있다면 파일을 추가해주는 재귀메소드를 만든다.
				// 재귀 메소드 예) copy(file,newdir)에 대한 설명
				// ori.listfiles() 배열 중 0번째로 뽑아온 file을 매개변수로 지정했다.
				// 재귀메소드가 실행되면 file.listFiles()을 해주게 되고
				// ori의 0번째 file의 .listFiles()에 대한 for문이 시작된다.
				// (디렉토리가 있으면 계속 재귀가 돌아서 세부 폴더가 있는지 검색하도록 짰음)
				// 매개변수 newdir는 45줄에서 만들어준 newdir 파일클래스를 가져와서 하위경로를 추가해
				// 새로운 newdir 파일클래스를 만들어주고 mkdir() 해준다.
				// 결과적으로 원본디렉토리에 존재하는 모든 파일을 복사디렉토리에 만들어주게된다.
				copy(file, newdir);
			} else {
				// 파일일 경우
				try (BufferedReader br = new BufferedReader(new FileReader(file));
						BufferedWriter bw = new BufferedWriter(new FileWriter(dest + "\\" + file.getName()));) {
					// char배열을 만든다.
					char[] cha = new char[1024];
					// br.read(cha)를 통해 읽어온 배열의 수를 저장할 int re를 초기화해준다.
					int re = 0;
					// br을 통해 cha 배열에 text를 읽어온다.
					// 만약 re==-1이면 더 읽을게 없는거니까 while문을 탈출시킨다.
					while ((re = br.read(cha)) != -1) {
						// cha배열의 0번째부터 re번째까지의 정보를 bw.write를 통해 작성해준다.
						bw.write(cha, 0, re);
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}
}
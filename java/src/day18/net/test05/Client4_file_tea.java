package day18.net.test05;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client4_file_tea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Socket socket = new Socket("localhost", 4000);
			System.out.println("서버접속성공!");
			System.out.println("보낼 파일명 입력");
			String file = scan.nextLine();
			// c:\\java\\a.jpg
			File f = new File(file);
			if (!f.exists()) {
				System.out.println("존재하지 않는 파일입니다..");
				return;
			}
			// 클라이언트에 파일을 전송하기 위한 스트림객체 생성
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			// 제일 먼저 파일명 서버에 보내기
			dos.writeUTF(f.getName());
			dos.flush();
			// 파일에서 데이터 읽어와 보내기
			FileInputStream fis = new FileInputStream(f);
			byte[] b = new byte[1000];
			while (true) {
				int n = fis.read(b);
				if (n == -1)
					break;
				dos.write(b, 0, n);
			}
			fis.close();
			dos.close();
			socket.close();
			System.out.println("파일전송완료!");
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}

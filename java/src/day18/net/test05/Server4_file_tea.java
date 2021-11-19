package day18.net.test05;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 파일전송프로그램 만들기
 * 
 * 1. 서버 
 *   - 클라이언트가 보내온 파일을 서버에 저장한다.
 *   
 * 2. 클라이언트
 *   - 서버에 파일을 보낸다.
 * 
 */
public class Server4_file_tea {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4000);
			System.out.println("서버실행.......");
			Socket socket = server.accept();
			System.out.println("클라이언트 접속!");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			// 클라이언트가 제일먼저 보내온 것은 파일명
			String fileName = dis.readUTF();
			String uploadPath = "c:\\upload";
			File f = new File(uploadPath);
			if (!f.exists()) {// 업로드할 디렉토리가 존재하지 않으면
				f.mkdirs();// 디렉토리 생성하기
			}
			// 클라이언트가 보내온 파일명과 동일한 이름으로 파일을 생성하여 전송된 데이터 저장하기
			FileOutputStream fos = new FileOutputStream(uploadPath + "\\" + fileName);
			byte[] b = new byte[1000];
			while (true) {
				// 클라이언트가 보내온 데이터를 읽어와
				int n = dis.read(b);
				if (n == -1)
					break;
				// 파일에 저장하기
				fos.write(b, 0, n);
			}
			fos.close();
			dis.close();
			socket.close();
			System.out.println("파일저장 완료!");
			server.close();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}

package day18.net.test05;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 파일전송프로그램만들기
 * 1. 서버
 * - 클라이언트가 보내온 파일을 서버에 저장한다.
 * 2. 클라이언트
 * - 서버에 파일을 보낸다.
 */
public class Server5_CopyFile_Self {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5001);
			System.out.println("서버가 열렸습니다...");
			Socket socket = server.accept();
			System.out.println("클라이언트가 접속했습니다...");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String filename = dis.readUTF();
			String uploadPath = "c:\\upload";
			File serverFile = new File(uploadPath);
			if (serverFile.exists() == false) {
				serverFile.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(uploadPath + "\\" + filename);
			byte[] sep = new byte[1024];
			while (true) {
				int n = dis.read(sep);
				if (n == -1) {
					break;
				}
				fos.write(sep, 0, n);
			}
			dis.close();
			fos.close();
			socket.close();
			System.out.println("파일저장 완료!");
			server.close();
		} catch (IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

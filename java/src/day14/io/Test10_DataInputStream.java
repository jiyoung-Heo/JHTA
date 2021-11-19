package day14.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// DataInputStream: 기본자료형 데이터를 읽어오기 위한 스트림
public class Test10_DataInputStream {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("abc.data"));
			// 저장된 자료형 그대로 읽어오기
			int a = dis.readInt();
			double b = dis.readDouble();
			boolean c = dis.readBoolean();
			String d = dis.readUTF();
			System.out.println("<파일읽어오기 성공!!!>");
			dis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

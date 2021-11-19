package day14.homework;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

//4. 파일에 저장된 학생 성적정보를 화면에 출력해 보세요.(DataInputStream 사용)
public class Home04 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			// stu.data를 출력하기위한 객체 dis를 만든다.
			dis = new DataInputStream(new FileInputStream("stu.data"));
			// num, name, kor, grade 값을 초기화해준다.
			int num = 0;
			String name = "";
			int kor = 0;
			char grade = 0;
			// for문 무한루프를 돌면서 출력시켜줄거다
			for (;;) {
				// dis를 통해 stu.data에 있는 값을 int타입크기만큼 가져와서 num에 저장해준다.
				num = dis.readInt();
				// dis를 통해 stu.data에 있는 값을 String타입크기만큼 가져와서 name에 저장해준다.
				name = dis.readUTF();
				// dis를 통해 kor를 저장한다.
				kor = dis.readInt();
				// dis를 통해 stu.data에 있는 값을 char타입크기만큼 가져와서 grade에 저장해준다.
				grade = dis.readChar();
				// 세가지를 합하여 한줄로 출력해준다.
				System.out.println("학생번호:" + num + " 이름:" + name + " 점수:" + kor + "점 학점:" + grade);
			}
			// for문으로 계속 파일을 읽어오다가 더이상 읽을게 없으면 EOFException이 발생한다. 따라서 예외처리를 해줘야한다.
		} catch (EOFException e) {
			try {
				if (dis != null) {
					System.out.println("파일 다 읽었어요");
					dis.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

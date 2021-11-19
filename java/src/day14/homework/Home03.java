package day14.homework;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//3. 학생번호,이름,국어점수입력받아 학점계산해서 DataOutputStream이용해서 파일로 저장하세요.
//(파일에 학생번호,이름,국어,학점저장)
public class Home03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// stu.data에 입력받은값을 저장하기위해 dos객체를 생성한다.
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("stu.data"));
			while (true) {
				System.out.println("학생번호를 입력하세요. 0을 입력하면 종료됩니다.");
				// 학생의 번호를 입력받는다.
				int num = sc.nextInt();
				// 만약 입력받은 학생번호가 0이라면 while문을 빠져나간다.
				if (num == 0) {
					break;
				}
				System.out.println("이름을 입력하세요");
				// 이름을 입력받는다.
				String name = sc.next();
				// 국어점수를 입력받는다.
				System.out.println("국어점수를 입력하세요");
				int kor = sc.nextInt();
				// grade 값을 초기화시켜준다.
				char grade = ' ';
				// 입력받은 국어점수가 90점 이상이면 A , 80~89면 B, 70~79면 C의 등급을 char타입 grade에 저장해준다.
				if (kor >= 90) {
					grade = 'A';
				} else if (kor >= 80 && kor < 90) {
					grade = 'B';
				} else if (kor >= 70 && kor < 80) {
					grade = 'C';
				} else {
					grade = 'D';
				}
				// stu.data에 int타입크기의 공간에 num을 써주고, String타입크기의 공간에 name을, char타입 크기의공간에 grade를
				// 쓴다.
				dos.writeInt(num);
				dos.writeUTF(name);
				dos.writeInt(kor);
				dos.writeChar(grade);
			}
			// 닫기
			dos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

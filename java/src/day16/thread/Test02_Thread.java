package day16.thread;
/* 
 * 방법1) Thread클래스를 상속받아 만들기
 * 1. Tread클래스 상속받기
 * 2. run메소드 오버라이딩하기-스레드로 구동되어야 할 기능 구현
 * 3. 스레드객체생성후 실행 - start()메소드로 스레드 실행한다.
 */

class FileThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("파일복사중...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("파일 복사완료");
	}
}

class PrintThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("프린터로 인쇄중...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("파일 인쇄완료");
	}
}

public class Test02_Thread {
	public static void main(String[] args) {
		FileThread f = new FileThread();
		f.start();// 스레드 구동하기->start메소드 호출(내부적으로 run메소드가 호출된다.)
		PrintThread p = new PrintThread();
		p.start();
	}
}

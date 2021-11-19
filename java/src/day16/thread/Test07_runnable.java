package day16.thread;

//방법2) Runnable인터페이스를 상속받아 만들기
public class Test07_runnable {
	public static void main(String[] args) {
		FileCopyThread2 f = new FileCopyThread2();
		FilePrintTread fpt = new FilePrintTread();
//		Thread(Runnable target)
		Thread theread = new Thread(f);
		Thread printTread = new Thread(fpt);
		theread.start();
		// 프린터로 출력하는 스레드도 만들고 실행해 보세요.-> Runnable 상속받아서
		printTread.start();
//		new Thread(new FileCopyThread2()).start();
	}
}

class FileCopyThread2 implements Runnable {
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

class FilePrintTread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("파일 출력중...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("파일 출력완료");
	}
}
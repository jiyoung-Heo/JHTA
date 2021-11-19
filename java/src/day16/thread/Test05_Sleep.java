package day16.thread;

public class Test05_Sleep {
	public static void main(String[] args) {
//		FileThread1 i = new FileThread1();
//		i.start();
		new FileThread1().start();
//		new PrintThread1().start();
	}
}

class FileThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("파일복사중...");
			if (i % 10 == 0) {
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사완료");
	}
}

class PrintThread1 extends Thread {
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
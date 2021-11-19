package day16.thread;

public class Test12_stop {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		try {
			mt1.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		mt1.interrupt();// 인터럽트 발생시키기
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		while (!interrupted()) {
			System.out.println("1.스레드로 작업중...");
			System.out.println("2.스레드로 작업중...");
			System.out.println("3.스레드로 작업중...");
			System.out.println("4.스레드로 작업중...");
			System.out.println("5.스레드로 작업중...");
			System.out.println("작업완료");
		}
	}
}
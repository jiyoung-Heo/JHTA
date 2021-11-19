package day16.thread;

public class Test11_stop {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
//		th.stop();
		th.setStop(true);
	}
}

class MyThread extends Thread {
	private boolean stop = false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("1.스레드로 작업중...");
			System.out.println("2.스레드로 작업중...");
			System.out.println("3.스레드로 작업중...");
			System.out.println("4.스레드로 작업중...");
			System.out.println("5.스레드로 작업중...");
			System.out.println("작업완료");
		}
	}
}
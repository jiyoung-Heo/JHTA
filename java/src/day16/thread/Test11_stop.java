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
			System.out.println("1.������� �۾���...");
			System.out.println("2.������� �۾���...");
			System.out.println("3.������� �۾���...");
			System.out.println("4.������� �۾���...");
			System.out.println("5.������� �۾���...");
			System.out.println("�۾��Ϸ�");
		}
	}
}
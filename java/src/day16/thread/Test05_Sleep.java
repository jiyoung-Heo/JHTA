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
			System.out.print("���Ϻ�����...");
			if (i % 10 == 0) {
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���� ����Ϸ�");
	}
}

class PrintThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("�����ͷ� �μ���...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("���� �μ�Ϸ�");
	}
}
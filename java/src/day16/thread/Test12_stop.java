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
		mt1.interrupt();// ���ͷ�Ʈ �߻���Ű��
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		while (!interrupted()) {
			System.out.println("1.������� �۾���...");
			System.out.println("2.������� �۾���...");
			System.out.println("3.������� �۾���...");
			System.out.println("4.������� �۾���...");
			System.out.println("5.������� �۾���...");
			System.out.println("�۾��Ϸ�");
		}
	}
}
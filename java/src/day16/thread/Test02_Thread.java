package day16.thread;
/* 
 * ���1) ThreadŬ������ ��ӹ޾� �����
 * 1. TreadŬ���� ��ӹޱ�
 * 2. run�޼ҵ� �������̵��ϱ�-������� �����Ǿ�� �� ��� ����
 * 3. �����尴ü������ ���� - start()�޼ҵ�� ������ �����Ѵ�.
 */

class FileThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("���Ϻ�����...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("���� ����Ϸ�");
	}
}

class PrintThread extends Thread {
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

public class Test02_Thread {
	public static void main(String[] args) {
		FileThread f = new FileThread();
		f.start();// ������ �����ϱ�->start�޼ҵ� ȣ��(���������� run�޼ҵ尡 ȣ��ȴ�.)
		PrintThread p = new PrintThread();
		p.start();
	}
}

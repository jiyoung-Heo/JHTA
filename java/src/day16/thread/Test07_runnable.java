package day16.thread;

//���2) Runnable�������̽��� ��ӹ޾� �����
public class Test07_runnable {
	public static void main(String[] args) {
		FileCopyThread2 f = new FileCopyThread2();
		FilePrintTread fpt = new FilePrintTread();
//		Thread(Runnable target)
		Thread theread = new Thread(f);
		Thread printTread = new Thread(fpt);
		theread.start();
		// �����ͷ� ����ϴ� �����嵵 ����� ������ ������.-> Runnable ��ӹ޾Ƽ�
		printTread.start();
//		new Thread(new FileCopyThread2()).start();
	}
}

class FileCopyThread2 implements Runnable {
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

class FilePrintTread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("���� �����...");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("���� ��¿Ϸ�");
	}
}
package day16.thread;

//1�ʿ� �ѹ��� news�� ����ϴ� �����带 ���Ѱ� �����غ����� runnable�� ��ӹ޾� ����
public class Test08_Quiz {
	public static void main(String[] args) {
		NewsThread nt = new NewsThread();
		Thread t = new Thread(nt);
		t.start();
//		new Thread(new NewsThread()).start();
	}
}

class NewsThread implements Runnable {
	String news[] = { "6�� ���� Ȳ��溸, ���ϱ��� ������ Ȳ�� ����", "��õ�� ������ ����ɻ硦�� �ǿ� ���°� ���� �м���",
			"'�� �����' ���� Ȯ�ꡦ� \"����\" vs � \"��������\"", "������, '���� ���' 20�ϸ��� ������\"�̼����� ���� " };

	@Override
	public void run() {
		while (true) {

			for (int i = 0; i < news.length; i++) {
				System.out.println(news[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
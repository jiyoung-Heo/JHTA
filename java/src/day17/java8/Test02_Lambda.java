package day17.java8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02_Lambda {
	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//					System.out.println(i + "�ݰ����ϴ�...");
//				}
//			}
//		};
//		new Thread(r).start();
		// �Ʒ��ڵ�� ���� �ڵ�� ����
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i + "�ݰ����ϴ�...");
				}
			}
		}).start();
		// ���� �ڵ带 ���ٽ��� ����غ�����
		new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "�ݰ����ϴ�...");
			}
		}).start();
		// 1�ʿ� �ѹ��� �ð� ����ϴ� �����带 ����� �����غ�����:���ٽĻ��
		new Thread(() -> {
			// ��¥ ������� �����ϴ� ��ü
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			while (true) {
				// Date��ü�� ��¥������ sf�� ������ ���������� ���� STring���ڿ��� ������
				String s = sf.format(new Date());
				System.out.println(s);
//				Calendar a = Calendar.getInstance();
//				System.out.print(a.get(Calendar.YEAR) + "�� ");
//				System.out.print((a.get(Calendar.MONTH) + 1) + "�� ");
//				System.out.print(a.get(Calendar.HOUR) + "�� ");
//				System.out.print(a.get(Calendar.MINUTE) + "�� ");
//				System.out.println(a.get(Calendar.SECOND) + "��");
				try {
					Thread.sleep(1_000);

				} catch (InterruptedException e) {
					e.getStackTrace();
				}
			}
		}).start();
	}
}
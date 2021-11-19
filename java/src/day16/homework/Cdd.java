package day16.homework;

import java.util.Scanner;

class Input extends Thread {
	private Bankk b;

	public Input(Bankk b) {
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (b) {
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. �Ա��ϱ� 2.����ϱ�");
				int num = sc.nextInt();
				if (num == 2)
					break;
				if (num != 1) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				System.out.println("�Ա��� ���¹�ȣ �Է�");
				String account = sc.next();

				if (account.equals(b.getAccount())) {
					System.out.println("�Ա��� �ݾ� �Է�");
					int money = sc.nextInt();
					b.insert(money);
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}

			}
		}
	}
}

class Output extends Thread {
	private Bankk b;

	public Output(Bankk b) {
		this.b = b;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (b) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. ����ϱ� 0.����");
				int num = sc.nextInt();
				if (num == 0)
					break;
				if (num != 1) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				System.out.println("����� ���¹�ȣ �Է�");
				String account = sc.next();

				if (account.equals(b.getAccount())) {
					System.out.println("����� �ݾ� �Է�");
					int money = sc.nextInt();
					b.out(money);
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
			}
		}
	}
}

public class Cdd {
	public static void main(String[] args) {
		Bankk b = new Bankk();
		Input i = new Input(b);
		Output o = new Output(b);
		i.start();
		o.start();
	}

}

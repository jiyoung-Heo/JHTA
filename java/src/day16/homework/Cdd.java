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
				System.out.println("1. 입금하기 2.출금하기");
				int num = sc.nextInt();
				if (num == 2)
					break;
				if (num != 1) {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				System.out.println("입금할 계좌번호 입력");
				String account = sc.next();

				if (account.equals(b.getAccount())) {
					System.out.println("입금할 금액 입력");
					int money = sc.nextInt();
					b.insert(money);
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
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
				System.out.println("1. 출금하기 0.종료");
				int num = sc.nextInt();
				if (num == 0)
					break;
				if (num != 1) {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				System.out.println("출금할 계좌번호 입력");
				String account = sc.next();

				if (account.equals(b.getAccount())) {
					System.out.println("출금할 금액 입력");
					int money = sc.nextInt();
					b.out(money);
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
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

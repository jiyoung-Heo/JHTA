package day16.homework;

import java.util.Scanner;

//은행클래스 - 계좌번호,잔액,입금기능,출금기능
//입금스레드와 출금스레드를 만들고 동기화 처리 기능을 사용해 보세요.
public class Home2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("입금할 계좌번호: ");
		String account = sc.next();
		bank.setAccount(account);
		int cnt = 0;
		while (true) {
			Deposit1 a = new Deposit1(bank, 100);
			a.start();
			Withdraw1 b = new Withdraw1(bank, 200);
			b.start();
			cnt++;
			if (cnt >= 10) {
				break;
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("==========================================");
		cnt = 0;
		while (true) {
			DepositSync a = new DepositSync(bank, 100);
			a.start();
			WithdrawSync b = new WithdrawSync(bank, 200);
			b.start();
			cnt++;
			if (cnt >= 10) {
				break;
			}
		}

	}
}

class Deposit1 extends Thread {
	private Bank bank;
	private int moneyIn;

	public Deposit1(Bank bank, int moneyIn) {
		this.bank = bank;
		this.moneyIn = moneyIn;
	}

	@Override
	public void run() {
		System.out.println("D: 현재금액은 " + bank.getLastmoney());
		System.out.println("D: 입금금액은 " + moneyIn);
		bank.depositMon(moneyIn);
		System.out.println("D: 입금 성공하였습니다.");
		System.out.println("DD: " + bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
	}
}

class Withdraw1 extends Thread {
	private Bank bank;
	private int moneyOut;

	public Withdraw1(Bank bank, int moneyOut) {
		this.bank = bank;
		this.moneyOut = moneyOut;
	}

	@Override
	public void run() {

		System.out.println("W: 현재금액은 " + bank.getLastmoney());
		System.out.println("W: 출금금액은 " + moneyOut);
		if (bank.withdrawMon(moneyOut)) {
			System.out.println("W: 출금 성공하였습니다.");
			System.out.println("WW: " + bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
		} else {
			System.out.println("WW: 잔액이 부족합니다.");

		}
	}
}

class DepositSync extends Thread {
	private Bank bank;
	private int moneyIn;

	public DepositSync(Bank bank, int moneyIn) {
		this.bank = bank;
		this.moneyIn = moneyIn;
	}

	@Override
	public void run() {
		synchronized (bank) {
			System.out.println("D: 현재금액은 " + bank.getLastmoney());
			System.out.println("D: 입금금액은 " + moneyIn);
			bank.depositMon(moneyIn);
			System.out.println("D: 입금 성공하였습니다.");
			System.out.println("DD: " + bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
		}
	}
}

class WithdrawSync extends Thread {
	private Bank bank;
	private int moneyOut;
	public WithdrawSync(Bank bank, int moneyOut) {
		this.bank = bank;
		this.moneyOut = moneyOut;
	}

	@Override
	public void run() {
		synchronized (bank) {
			System.out.println("W: 현재금액은 " + bank.getLastmoney());
			System.out.println("W: 출금금액은 " + moneyOut);
			if (bank.withdrawMon(moneyOut)) {
				System.out.println("W: 출금 성공하였습니다.");
				System.out.println("WW: " + bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
			} else {
				System.out.println("WW: 잔액이 부족합니다.");
			}
		}
	}
}

package day16.homework;

import java.util.Scanner;

//����Ŭ���� - ���¹�ȣ,�ܾ�,�Աݱ��,��ݱ��
//�Աݽ������ ��ݽ����带 ����� ����ȭ ó�� ����� ����� ������.
public class Home2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("�Ա��� ���¹�ȣ: ");
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
		System.out.println("D: ����ݾ��� " + bank.getLastmoney());
		System.out.println("D: �Աݱݾ��� " + moneyIn);
		bank.depositMon(moneyIn);
		System.out.println("D: �Ա� �����Ͽ����ϴ�.");
		System.out.println("DD: " + bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
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

		System.out.println("W: ����ݾ��� " + bank.getLastmoney());
		System.out.println("W: ��ݱݾ��� " + moneyOut);
		if (bank.withdrawMon(moneyOut)) {
			System.out.println("W: ��� �����Ͽ����ϴ�.");
			System.out.println("WW: " + bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
		} else {
			System.out.println("WW: �ܾ��� �����մϴ�.");

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
			System.out.println("D: ����ݾ��� " + bank.getLastmoney());
			System.out.println("D: �Աݱݾ��� " + moneyIn);
			bank.depositMon(moneyIn);
			System.out.println("D: �Ա� �����Ͽ����ϴ�.");
			System.out.println("DD: " + bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
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
			System.out.println("W: ����ݾ��� " + bank.getLastmoney());
			System.out.println("W: ��ݱݾ��� " + moneyOut);
			if (bank.withdrawMon(moneyOut)) {
				System.out.println("W: ��� �����Ͽ����ϴ�.");
				System.out.println("WW: " + bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
			} else {
				System.out.println("WW: �ܾ��� �����մϴ�.");
			}
		}
	}
}

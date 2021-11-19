package day16.homework;

import java.util.Scanner;

//����Ŭ���� - ���¹�ȣ,�ܾ�,�Աݱ��,��ݱ��
//�Աݽ������ ��ݽ����带 ����� ����ȭ ó�� ����� ����� ������.
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// BankŬ������ ����ϱ� ���� bank��ü�� ������ش�.
		Bank bank = new Bank();
		// �Ա��� ���¹�ȣ�� �Է¹޴´�.
		System.out.println("�Ա��� ���¹�ȣ: ");
		String account = sc.next();
		// setAccount�޼ҵ带 ���� �Է¹��� ���¹�ȣ�� �������ش�.
		bank.setAccount(account);
		while (true) {
			// �ش� ���¹�ȣ�� �Ա�, ���, ����޴��� Scanner�� ���ù޴´�.
			System.out.println("1.�Ա� 2.��� 3.����");
			int choice = sc.nextInt();
			// ���� 1�� �Ա��� �����ߴٸ�
			if (choice == 1) {
				// �Ա��� �ݾ��� �Է¹޴´�.
				System.out.println("�Ա��� �ݾ�: ");
				int moneyIn = sc.nextInt();
				// ������ ����(Bank)Ŭ������ü�� �Է¹��� �Ա��� �ݾ��� �Ű������� ����
				// �Ա�Ŭ������ ��ü�� �����.
				Deposit a = new Deposit(bank, moneyIn);
				// �� ��ü�� �������ش�.
				a.start();
				// ���� 2�� ����� �����ߴٸ�
			} else if (choice == 2) {
				// ����� �ݾ��� �Է¹޴´�.
				System.out.println("����� �ݾ�: ");
				int moneyOut = sc.nextInt();
				// ������ ����(Bank)Ŭ������ü�� �Է¹��� ����� �ݾ��� �Ű������� ����
				// ���Ŭ������ ��ü�� �����.
				Withdraw b = new Withdraw(bank, moneyOut);
				// �� ��ü�� �����Ѵ�.
				b.start();
				// 3�� ���Ḧ �����ߴٸ�
			} else if (choice == 3) {
				// �ý����� �����Ѵ�.
				System.exit(0);
			}

		}
	}
}

//�Ա����ִ� Ŭ����
class Deposit extends Thread {
	private Bank bank;
	private int moneyIn;

	// Bank��ü�� �Ա��� ���� �Ű������� ������ �����ڸ� �������ش�.
	public Deposit(Bank bank, int moneyIn) {
		this.bank = bank;
		this.moneyIn = moneyIn;
	}

	@Override
	public void run() {
		// ����Ŭ������ �Աݱ�ɸ޼ҵ�(������+�ܾ� ���ִ� �޼ҵ�)�� �̿��Ͽ�
		// ������ �ܾ�(lastmoney)�� bank��ü�� �������ش�.
		bank.depositMon(moneyIn);
		// ����� ����Ѵ�.
		System.out.println(bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
	}
}

//������ִ� Ŭ����
class Withdraw extends Thread {
	private Bank bank;
	private int moneyOut;

	// Bank��ü�� ����� ���� �Ű������� ������ �����ڸ� �������ش�.
	public Withdraw(Bank bank, int moneyOut) {
		this.bank = bank;
		this.moneyOut = moneyOut;
	}

	@Override
	public void run() {
		// ����Ŭ������ ��ݱ�ɸ޼ҵ�(�ܾ�-������ ���ִ� �޼ҵ�)�� �̿��Ͽ�
		// ������ �ܾ�(lastmoney)�� bank��ü�� �������ش�.
		// ���� withdrawMon�޼ҵ尡 true���(BankŬ���� ����)
		if (bank.withdrawMon(moneyOut)) {
			// ����� ����Ѵ�.
			System.out.println(bank.getAccount() + "������ �ܾ��� " + bank.getLastmoney() + "�Դϴ�.");
			// false��� �ܾ��� �����ϴٰ� ����Ѵ�.
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}

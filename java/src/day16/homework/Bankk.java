package day16.homework;

public class Bankk {
	private String account = "01033594613";
	private int balance;

	public void insert(int money) {
		System.out.println("�Ա� �� �ݾ� :" + balance);
		balance += money;
		System.out.println("�Ա� �� �ܾ� :" + balance);

	}

	public void out(int money) {

		if (balance >= money) {
			System.out.println("��� �� �ݾ� " + balance);
			balance -= money;
			System.out.println("��� �� �ܾ� : " + balance);
		} else {
			System.out.println("�ܾ� �����Դϴ�.");
			System.out.println("���� �ܾ� :" + balance);
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

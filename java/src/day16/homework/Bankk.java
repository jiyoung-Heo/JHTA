package day16.homework;

public class Bankk {
	private String account = "01033594613";
	private int balance;

	public void insert(int money) {
		System.out.println("입금 전 금액 :" + balance);
		balance += money;
		System.out.println("입금 후 잔액 :" + balance);

	}

	public void out(int money) {

		if (balance >= money) {
			System.out.println("출금 전 금액 " + balance);
			balance -= money;
			System.out.println("출금 후 잔액 : " + balance);
		} else {
			System.out.println("잔액 부족입니다.");
			System.out.println("현재 잔액 :" + balance);
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

package day16.homework;

//은행클래스 - 계좌번호,잔액,입금기능,출금기능
public class Bank {
	private String account;
	private int lastmoney;

	// 입력받은 계좌번호
	public void setAccount(String account) {
		this.account = account;
	}

	public void setLastmoney(int lastmoney) {
		this.lastmoney = lastmoney;
	}

	// 계좌번호
	public String getAccount() {
		return account;
	}

	// 잔액
	public int getLastmoney() {
		return lastmoney;
	}

	// 입금기능
	public int depositMon(int a) {
		this.lastmoney = lastmoney + a;
		return lastmoney;
	}

	// 출금기능
	public boolean withdrawMon(int a) {
		// 만약 남은돈이 출금할 돈보다 많다면 true를 리턴하고
		if (lastmoney >= a) {
			this.lastmoney = lastmoney - a;
			return true;
		} else {
			// 아니라면 false를 리턴한다.
			return false;
		}
	}
}

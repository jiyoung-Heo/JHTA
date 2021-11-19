package day16.homework;

import java.util.Scanner;

//은행클래스 - 계좌번호,잔액,입금기능,출금기능
//입금스레드와 출금스레드를 만들고 동기화 처리 기능을 사용해 보세요.
public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bank클래스를 사용하기 위해 bank객체를 만들어준다.
		Bank bank = new Bank();
		// 입금할 계좌번호를 입력받는다.
		System.out.println("입금할 계좌번호: ");
		String account = sc.next();
		// setAccount메소드를 통해 입력받은 계좌번호를 저장해준다.
		bank.setAccount(account);
		while (true) {
			// 해당 계좌번호의 입금, 출금, 종료메뉴를 Scanner로 선택받는다.
			System.out.println("1.입금 2.출금 3.종료");
			int choice = sc.nextInt();
			// 만약 1번 입금을 선택했다면
			if (choice == 1) {
				// 입금할 금액을 입력받는다.
				System.out.println("입금할 금액: ");
				int moneyIn = sc.nextInt();
				// 만들어둔 은행(Bank)클래스객체와 입력받은 입금할 금액을 매개변수로 갖는
				// 입금클래스의 객체를 만든다.
				Deposit a = new Deposit(bank, moneyIn);
				// 그 객체를 실행해준다.
				a.start();
				// 만약 2번 출금을 선택했다면
			} else if (choice == 2) {
				// 출금할 금액을 입력받는다.
				System.out.println("출금할 금액: ");
				int moneyOut = sc.nextInt();
				// 만들어둔 은행(Bank)클래스객체와 입력받은 출금할 금액을 매개변수로 갖는
				// 출금클래스의 객체를 만든다.
				Withdraw b = new Withdraw(bank, moneyOut);
				// 그 객체를 실행한다.
				b.start();
				// 3번 종료를 선택했다면
			} else if (choice == 3) {
				// 시스템을 종료한다.
				System.exit(0);
			}

		}
	}
}

//입금해주는 클래스
class Deposit extends Thread {
	private Bank bank;
	private int moneyIn;

	// Bank객체와 입금할 돈을 매개변수로 가지는 생성자를 선언해준다.
	public Deposit(Bank bank, int moneyIn) {
		this.bank = bank;
		this.moneyIn = moneyIn;
	}

	@Override
	public void run() {
		// 은행클래스의 입금기능메소드(받은돈+잔액 해주는 메소드)를 이용하여
		// 계좌의 잔액(lastmoney)을 bank객체에 저장해준다.
		bank.depositMon(moneyIn);
		// 결과를 출력한다.
		System.out.println(bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
	}
}

//출금해주는 클래스
class Withdraw extends Thread {
	private Bank bank;
	private int moneyOut;

	// Bank객체와 출금할 돈을 매개변수로 가지는 생성자를 선언해준다.
	public Withdraw(Bank bank, int moneyOut) {
		this.bank = bank;
		this.moneyOut = moneyOut;
	}

	@Override
	public void run() {
		// 은행클래스의 출금기능메소드(잔액-받은돈 해주는 메소드)를 이용하여
		// 계좌의 잔액(lastmoney)을 bank객체에 저장해준다.
		// 만약 withdrawMon메소드가 true라면(Bank클래스 참고)
		if (bank.withdrawMon(moneyOut)) {
			// 결과를 출력한다.
			System.out.println(bank.getAccount() + "계좌의 잔액은 " + bank.getLastmoney() + "입니다.");
			// false라면 잔액이 부족하다고 출력한다.
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}

package day16.homework;

//����Ŭ���� - ���¹�ȣ,�ܾ�,�Աݱ��,��ݱ��
public class Bank {
	private String account;
	private int lastmoney;

	// �Է¹��� ���¹�ȣ
	public void setAccount(String account) {
		this.account = account;
	}

	public void setLastmoney(int lastmoney) {
		this.lastmoney = lastmoney;
	}

	// ���¹�ȣ
	public String getAccount() {
		return account;
	}

	// �ܾ�
	public int getLastmoney() {
		return lastmoney;
	}

	// �Աݱ��
	public int depositMon(int a) {
		this.lastmoney = lastmoney + a;
		return lastmoney;
	}

	// ��ݱ��
	public boolean withdrawMon(int a) {
		// ���� �������� ����� ������ ���ٸ� true�� �����ϰ�
		if (lastmoney >= a) {
			this.lastmoney = lastmoney - a;
			return true;
		} else {
			// �ƴ϶�� false�� �����Ѵ�.
			return false;
		}
	}
}

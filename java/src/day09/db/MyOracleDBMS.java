package day09.db;

public class MyOracleDBMS implements MyDBMS {
	public void connect(String id, String pwd) {
		System.out.println("���Ӱ���: " + id + " ��й�ȣ: " + pwd);
		System.out.println("���� ������ ����ŬDBMS�� ������");
	}

	public void disconnect() {
		System.out.println("����Ŭdbms�� ��������");
	}

	public void select(String user) {
		System.out.println("����Ŭ sql������ ����ؼ�" + user + "ȸ������ ��ȸ");
	}

	public void update(String user) {
		System.out.println("����Ŭ sql������ ����ؼ�" + user + "ȸ������ ����");
	}

	public void delete(String user) {
		System.out.println("����Ŭ sql������ ����ؼ�" + user + "ȸ������ ����");
	}

	public void insert(String user) {
		System.out.println("����Ŭ sql������ ����ؼ�" + user + "ȸ������ ���");
	}
}

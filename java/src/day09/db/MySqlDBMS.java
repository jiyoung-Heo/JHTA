package day09.db;

public class MySqlDBMS implements MyDBMS {

	public void connect(String id, String pwd) {
		System.out.println("���Ӱ���: " + id + " ��й�ȣ: " + pwd);
		System.out.println("���� ������ MYSQL�� ������");
	}

	public void disconnect() {
		System.out.println("MYSQL dbms�� ��������");
	}

	public void select(String user) {
		System.out.println("MYSQL sql������ ����ؼ�" + user + "ȸ������ ��ȸ");
	}

	public void update(String user) {
		System.out.println("MYSQL sql������ ����ؼ�" + user + "ȸ������ ����");
	}

	public void delete(String user) {
		System.out.println("MYSQL sql������ ����ؼ�" + user + "ȸ������ ����");
	}

	public void insert(String user) {
		System.out.println("MYSQL sql������ ����ؼ�" + user + "ȸ������ ���");
	}

}

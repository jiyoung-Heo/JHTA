package day12.innerclass;

interface Message {
	void sendMsg(String msg);// �޼���������

	void recMsg(String msg);
}

public class Test04_Quiz {
	public static void main(String[] args) {
		// Message�� ��ӹ޾� ������ �͸��� ����Ŭ������ ����� �޼ҵ带 ȣ���غ�����
		Message msg = new Message() {
			public void sendMsg(String msg) {
				System.out.println(msg + "��� �޼���������");
			}

			public void recMsg(String msg) {
				System.out.println(msg + "�޼��� �����ϱ�");

			}
		};

		msg.sendMsg("hi");
		msg.recMsg("hello");
//		new Message() {
//			public void sendMsg(String msg) {
//				System.out.println(msg + "��� �޼���������");
//			}
//
//			public void recMsg(String msg) {
//				System.out.println(msg + "�޼��� �����ϱ�");
//
//			}
//		}.sendMsg("�ȳ糪��");
	}
}

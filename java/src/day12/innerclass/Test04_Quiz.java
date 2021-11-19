package day12.innerclass;

interface Message {
	void sendMsg(String msg);// 메세지보내기

	void recMsg(String msg);
}

public class Test04_Quiz {
	public static void main(String[] args) {
		// Message를 상속받아 구현한 익명의 내부클래스를 만들고 메소드를 호출해보세요
		Message msg = new Message() {
			public void sendMsg(String msg) {
				System.out.println(msg + "라고 메세지보내기");
			}

			public void recMsg(String msg) {
				System.out.println(msg + "메세지 저장하기");

			}
		};

		msg.sendMsg("hi");
		msg.recMsg("hello");
//		new Message() {
//			public void sendMsg(String msg) {
//				System.out.println(msg + "라고 메세지보내기");
//			}
//
//			public void recMsg(String msg) {
//				System.out.println(msg + "메세지 저장하기");
//
//			}
//		}.sendMsg("안녕나야");
	}
}

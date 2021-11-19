package day16.thread;

//1초에 한번씩 news를 출력하는 스레드를 만듥고 실행해보세요 runnable을 상속받아 구현
public class Test08_Quiz {
	public static void main(String[] args) {
		NewsThread nt = new NewsThread();
		Thread t = new Thread(nt);
		t.start();
//		new Thread(new NewsThread()).start();
	}
}

class NewsThread implements Runnable {
	String news[] = { "6년 만의 황사경보, 내일까지 전국에 황사 영향", "포천시 공무원 영장심사…前 의원 보좌관 관련 압수수",
			"'吳 내곡동땅' 공방 확산…與 \"사퇴\" vs 野 \"흠집내기\"", "심은우, '학폭 논란' 20일만에 인정…\"미성숙한 언행 " };

	@Override
	public void run() {
		while (true) {

			for (int i = 0; i < news.length; i++) {
				System.out.println(news[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
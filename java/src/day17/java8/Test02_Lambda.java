package day17.java8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02_Lambda {
	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//					System.out.println(i + "반갑습니다...");
//				}
//			}
//		};
//		new Thread(r).start();
		// 아래코드는 위의 코드와 동일
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i + "반갑습니다...");
				}
			}
		}).start();
		// 위의 코드를 람다식을 사용해보세요
		new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "반갑습니다...");
			}
		}).start();
		// 1초에 한번씩 시간 출력하는 스레드를 만들고 실행해보세요:람다식사용
		new Thread(() -> {
			// 날짜 출력형식 설정하는 객체
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			while (true) {
				// Date객체의 날짜정보를 sf에 설정된 포맷형식을 갖는 STring문자열로 얻어오기
				String s = sf.format(new Date());
				System.out.println(s);
//				Calendar a = Calendar.getInstance();
//				System.out.print(a.get(Calendar.YEAR) + "년 ");
//				System.out.print((a.get(Calendar.MONTH) + 1) + "월 ");
//				System.out.print(a.get(Calendar.HOUR) + "시 ");
//				System.out.print(a.get(Calendar.MINUTE) + "분 ");
//				System.out.println(a.get(Calendar.SECOND) + "초");
				try {
					Thread.sleep(1_000);

				} catch (InterruptedException e) {
					e.getStackTrace();
				}
			}
		}).start();
	}
}
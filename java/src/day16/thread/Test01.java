package day16.thread;

/*
 * [스레드]
 * - 하나의 응용프로그램에서 여러개의 작업을 경량의 프로세스로 나누어 실행하는것
 * - 시간이 오래 지연되는작업이나 동시에 실행되어야하는 작업이 있을때 스레드로 실행한다.
 * - 스레드 만드는 방법
 *   방법1) Thread클래스를 상속받아 만들기
 *   방법2) Runnable인터페이스를 상속받아 만들기
 */
public class Test01 {
	public static void main(String[] args) {
		filecoopy();
		print();
	}

	public static void filecoopy() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("파일복사중");
			if (i / 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("파일복사완료");
	}

	public static void print() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("프린터로 인쇄중");
			if (i / 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("인쇄완료");
	}

}

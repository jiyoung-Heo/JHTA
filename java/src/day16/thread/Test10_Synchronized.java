package day16.thread;
/*
 * [스레드의 동기화]
 * - 하나의 자원(객체)를 여러개의 스레드가 공유해서 사용할 때 하나의 스레드가 사용중이면 다른 스레드는 사용할 수 없으며
 *   잠금(락)을 걸어두는 것
 * - 동기화 처리방법
 * 	 방법1) 동기화할 객체에 synchronized블록으로 묶기
 * 		synchronized(공유자원객체){
 * 			...
 * 		}
 *   방법2) 동기화할 클래스에 synchronized메소드 만들기
 *   	public synchronized 리턴형 메소드명(매개변수,...) {
 *   		...
 *   	}
 *    	예)
 *    		public class Data {
				private int[] b = new int[100];

				public synchronized void setB(int a, int i) {
					b[i] = a;
				}

				public synchronized int[] getB() {
					return b;
				}
			}
 *    
 */

import java.util.ArrayList;
import java.util.Vector;

import day16.Data;

public class Test10_Synchronized {
	public static void main(String[] args) {
		Data d = new Data();
		new InputThread1(d).start();
		new OutputThread1(d).start();
		Vector<String> vec = new Vector<String>();
		vec.add("aaa");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("aaa");
	}
}

class InputThread1 extends Thread {
	private Data d;

	public InputThread1(Data d) {
		this.d = d;
	}

	@Override
	public void run() {
		synchronized (d) {
			for (int i = 0; i < 100; i++) {
				for (int i2 = 0; i2 < 100; i2++) {
					for (int i3 = 0; i3 < 100; i3++) {
					}
				}
				d.setB(i + 1, i);
			}

		}
	}
}

class OutputThread1 extends Thread {
	private Data d;

	public OutputThread1(Data d) {
		this.d = d;
	}

	@Override
	public void run() {
		synchronized (d) {
			int[] b = d.getB();
			int cnt = 1;
			for (int n : b) {
				System.out.print(n + " ");
				if (cnt % 10 == 0) {
					System.out.println();
				}
				cnt++;
			}
		}
		System.out.println();
	}
}
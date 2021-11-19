package day16.thread;

import day16.Data;

public class Test09_SharedObject {
	public static void main(String[] args) {
		Data d = new Data();
		InputThread th1 = new InputThread(d);
		th1.start();
		OutputThread th2 = new OutputThread(d);
		th2.start();
	}
}

class InputThread extends Thread {
	private Data d;

	public InputThread(Data d) {
		this.d = d;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			for (int i2 = 0; i2 < 100; i2++) {
				for (int i3 = 0; i3 < 100; i3++) {
				}
			}
			d.setB(i + 1, i);
		}
	}
}

class OutputThread extends Thread {
	private Data d;

	public OutputThread(Data d) {
		this.d = d;
	}

	@Override
	public void run() {
		int[] b = d.getB();
		int cnt = 1;
		for (int n : b) {
			System.out.print(n + " ");
			if (cnt % 10 == 0) {
				System.out.println();
			}
			cnt++;
		}
		System.out.println();
	}
}
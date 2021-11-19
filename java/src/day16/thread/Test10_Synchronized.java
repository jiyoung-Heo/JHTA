package day16.thread;
/*
 * [�������� ����ȭ]
 * - �ϳ��� �ڿ�(��ü)�� �������� �����尡 �����ؼ� ����� �� �ϳ��� �����尡 ������̸� �ٸ� ������� ����� �� ������
 *   ���(��)�� �ɾ�δ� ��
 * - ����ȭ ó�����
 * 	 ���1) ����ȭ�� ��ü�� synchronized������� ����
 * 		synchronized(�����ڿ���ü){
 * 			...
 * 		}
 *   ���2) ����ȭ�� Ŭ������ synchronized�޼ҵ� �����
 *   	public synchronized ������ �޼ҵ��(�Ű�����,...) {
 *   		...
 *   	}
 *    	��)
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
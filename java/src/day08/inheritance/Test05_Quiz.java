package day08.inheritance;

/*
 * �Ʒ��� ���� ��Ӱ����� Ŭ������ ����� ����غ�����
 * 
 * 					[���Ŭ����]
 * 			- ����̸�, �μ�(�����ڷ� �� �ʱ�ȭ)
 * 						|
 * 	|----------------------------------------|
 * ���Ի��									�����Ի��
 * - �����ȣ, ��å, �޿�(����, ����)			-�ֹι�ȣ, �޿�(�ٹ��ð�*�ñ�)
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Jung j = new Jung("����", "�繫", 1, "�븮", 10, 10);
		j.printJung();
		System.out.println("=================================");
		BiJung bj = new BiJung("����", "����", 39383, 20, 6);
		bj.printBi();
	}
}

class Persons {
	protected String name;
	protected String deparement;

	public Persons(String name, String deparement) {
		this.name = name;
		this.deparement = deparement;
	}

	public void printJung() {
		System.out.println(name + deparement);
	}

}

class Jung extends Persons {
	protected int num;
	protected String job;
	protected int mon;

	public Jung(String name, String deparement, int num, String job, int mon1, int mon2) {
		super(name, deparement);
		this.num = num;
		this.job = job;
		this.mon = mon1 + mon2;
	}

	public void printJung() {
		System.out.println("����̸�: " + name);
		System.out.println("�μ�: " + deparement);
		System.out.println("�����ȣ: " + num);
		System.out.println("��å: " + job);
		System.out.println("�޿�: " + mon);
//		����̸�, �μ�(�����ڷ� �� �ʱ�ȭ)	-�ֹι�ȣ, �޿�(�ٹ��ð�*�ñ�)
	}
}

class BiJung extends Persons {
	protected int regist;
	protected int time;
	protected int time2;

	public BiJung(String name, String deparement, int regist, int time, int time2) {
		super(name, deparement);
		this.regist = regist;
		this.time = time;
		this.time2 = time2;
	}

	public void printBi() {
		System.out.println("����̸�: " + name);
		System.out.println("�μ�: " + deparement);
		System.out.println("�ֹι�ȣ: " + regist);
		System.out.println("�޿�: " + time * time2);
//		����̸�, �μ�(�����ڷ� �� �ʱ�ȭ)	-�ֹι�ȣ, �޿�(�ٹ��ð�*�ñ�)
	}

}
package day17;

/*
 * ����Ÿ��: ���Ż�����߿��� �ϳ��� ����� �����ϴ� ������ Ÿ��
 */
public class Test01_enum {
	public static void main(String[] args) {
		Week a = Week.FRIDAY;
		System.out.println("a: " + a);
		System.out.println("a: " + a.ordinal());

		MyBirth m = new MyBirth(1998, 12, 6, Week.SUNDAY);
		m.print();
	}
}

enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
};

class MyBirth {
	int y;
	int m;
	int d;
	Week w;

	public MyBirth(int y, int m, int d, Week w) {
		this.y = y;
		this.m = m;
		this.d = d;
		this.w = w;
	}

	public void print() {
		System.out.println("<<�������>>");
		System.out.println(y + "��" + m + "��" + d + "��");
		System.out.println("�¾����: " + w);
	}
}

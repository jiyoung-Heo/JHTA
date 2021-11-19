package day17;

/*
 * 열거타입: 열거상수값중에서 하나의 상수를 저장하는 데이터 타입
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
		System.out.println("<<생년월일>>");
		System.out.println(y + "년" + m + "월" + d + "일");
		System.out.println("태어난요일: " + w);
	}
}

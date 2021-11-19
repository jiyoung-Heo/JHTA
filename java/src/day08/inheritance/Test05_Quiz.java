package day08.inheritance;

/*
 * 아래와 같은 상속관계의 클래스를 만들고 사용해보세요
 * 
 * 					[사원클래스]
 * 			- 사원이름, 부서(생성자로 값 초기화)
 * 						|
 * 	|----------------------------------------|
 * 정규사원									비정규사원
 * - 사원번호, 직책, 급여(본봉, 수당)			-주민번호, 급여(근무시간*시급)
 */
public class Test05_Quiz {
	public static void main(String[] args) {
		Jung j = new Jung("지영", "사무", 1, "대리", 10, 10);
		j.printJung();
		System.out.println("=================================");
		BiJung bj = new BiJung("지용", "인턴", 39383, 20, 6);
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
		System.out.println("사원이름: " + name);
		System.out.println("부서: " + deparement);
		System.out.println("사원번호: " + num);
		System.out.println("직책: " + job);
		System.out.println("급여: " + mon);
//		사원이름, 부서(생성자로 값 초기화)	-주민번호, 급여(근무시간*시급)
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
		System.out.println("사원이름: " + name);
		System.out.println("부서: " + deparement);
		System.out.println("주민번호: " + regist);
		System.out.println("급여: " + time * time2);
//		사원이름, 부서(생성자로 값 초기화)	-주민번호, 급여(근무시간*시급)
	}

}
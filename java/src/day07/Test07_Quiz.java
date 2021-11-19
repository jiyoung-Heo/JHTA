package day07;

import java.util.Scanner;

/*
 * 사원정보를 갖는 클래스 만들고 사용해보세요
 * 사원정보(입력)->사원번호/이름/본봉/수당
 * 사원정보(출력)->사원번호/이름/본봉/수당/급여(수당+본봉)
 * ->사원은 3명으로 하고 객체 배열 사용해보세요
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		Person[] ps = new Person[3];
//		for (int i = 0; i < ps.length; i++) {
//			ps[i] = new Person();
//			ps[i].input();
//		}
//		for (int i = 0; i < ps.length; i++) {
//			ps[i].output();
//		}
		ps[0] = new Person(1, "가", 100, 1000);
		ps[1] = new Person(2, "나", 300, 1000);
		ps[2] = new Person(3, "다", 200, 14000);
		for (int i = 0; i < ps.length; i++) {
			ps[i].input();
		}
	}
}

class Person {
	Scanner sc = new Scanner(System.in);
	private int num;
	private String name;
	private int bon;
	private int money;

	public Person(int num, String name, int bon, int money) {
		this.num = num;
		this.name = name;
		this.bon = bon;
		this.money = money;
	}

	public void input() {
//		System.out.println("사원번호: ");
//		num = sc.nextInt();
//		System.out.println("이름: ");
//		name = sc.next();
//		System.out.println("본봉: ");
//		bon = sc.nextInt();
//		System.out.println("수당: ");
//		money = sc.nextInt();
		System.out.println("사원번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("본봉: " + bon);
		System.out.println("수당: " + money);
		System.out.println("급여: " + (bon + money));
		System.out.println();
	}

//	public void output() {
//		System.out.println("사원번호: " + num);
//		System.out.println("이름: " + name);
//		System.out.println("본봉: " + bon);
//		System.out.println("수당: " + money);
//		System.out.println("급여: " + (bon + money));
//		System.out.println();
//	}
}

package day11.collection;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 학생이름을 입력받아 ArrayList에 저장하고 전체 데이터가 출력되도록 해보세요
 * 학생이름은 exit가 입력될때까지 입력받습니다.
 */
public class Test02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		while (true) {
			System.out.println("학생이름입력");
			String ob = sc.next();
//			if (sc.next().equals("exit")) {
			if (ob.equals("exit")) {
				System.out.println("끝");
				break;
			}
			list.add(ob);
		}
		System.out.println("<입력된 학생이름>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

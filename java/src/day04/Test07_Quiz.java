package day04;

/*
 * do while 문 사용하여 1부터 100까지 출력하기
 * 한줄에 10개씩 출력되도록
 * 
 * 1,2,3,4,...10
 * 11,12...
 * ...
 * 91...100
 */
public class Test07_Quiz {
	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.print(num + " ");
			if (num % 10 == 0)
				System.out.println();
			num++;
		} while (num <= 100);
	}
}

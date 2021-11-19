package day05.homework1;

import java.util.Random;

//2. 임의의 난수 6개를 발생시켜 배열에 저장하고 출력해 보세요.
//난수의 범위는 1부터 45까지
//Random rnd=new Random();
//int n=rnd.nextInt(45)+1;
//[결과]
//이번주 로또 번호
//2 17 45 22 13 4
public class Homework2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = rnd.nextInt(45) + 1;
			System.out.print(num[i] + " ");
		}

	}
}

package day05.homework2;

import java.util.Random;

//2. 임의의 난수 6개를 발생시켜 배열에 저장하고 출력해 보세요. ( 중복값이 발생되지 않도록 하세요)
//난수의 범위는 1부터 45까지
//Random rnd=new Random();
//int n=rnd.nextInt(45)+1;
public class Homework02 {
	public static void main(String[] args) {
		Random rd = new Random();
//		int n = rd.nextInt(45) + 1;
		int[] result = new int[6];
		for (int i = 0; i < 6; i++) {
			result[i] = rd.nextInt(45) + 1;
		}
		for (int j = 0; j < 6; j++) {
			System.out.print(result[j] + " ");
		}

	}
}

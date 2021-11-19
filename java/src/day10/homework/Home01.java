package day10.homework;

import java.util.Scanner;

public class Home01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다섯명의 신장을 입력하세요");
		String data = sc.next();
		// 입력받은 평균을 ,를 기준으로 잘라서 배열에 넣기
		String[] arr = data.split(",");
		double sum = 0;
		// for문을 배열크기만큼 돌면서 더블로 형변환해준 후 합계 구하기
		for (int i = 0; i < arr.length; i++) {
			// 값이 잘 들어갔나 확인겸 넣어뒀어요
			System.out.print(arr[i] + " ");
			sum += Double.parseDouble(arr[i]);
		}
//		System.out.println("\n신장의 합" + sum);
		// 반올림해주는 Math클래스의 round 메소드 사용.
		System.out.println("\n평균신장: " + Math.round(sum / 5.0));
	}
}

//아래와 같은 형태로 다섯명의 신장을 입력받아 평균신장을 구해 보세요.
//예)
//다섯명의 신장을 차례로 입력
//180.6,198.2,170.3,175.0,172.9 ==> String data=scan.next();
//다섯명의 평균신장:xxx
//평균신장은 반올림해서 출력한다. Math 클래스의 round메소드 사용 (public static long round(double a))
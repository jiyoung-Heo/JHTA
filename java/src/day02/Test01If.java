package day02;

/*
 * [�������]
 * - ���ǿ� ���� ������ ���������� �����Ѵ�.
 * 1. if��
 * 	����)
 * 	if(���ǽ�){
 * 		������ ���϶� ������ ����;
 * 		..
 * 	}
 * 
 * 2. if~else ��
 * 	����)
 * 	if(���ǽ�){
 * 		������ ���϶� ������ ����;
 * 		..
 * 	}else{
 * 		������ �����϶� ������ ����;
 * 	}
 */
import java.util.Scanner;

public class Test01If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int score = sc.nextInt();
//		String result = "";
//		if (score >= 80) {
//			result = "�հ�";
//		} else {
//			result = "���հ�";
//		}
//		System.out.println(result);
		String result = "���հ�";
		if (score >= 80) {
			result = "�հ�";
		}
		System.out.println(result);
	}
}

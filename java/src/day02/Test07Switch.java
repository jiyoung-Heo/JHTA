package day02;

import java.util.Scanner;

/*
 * [switch��]
 * -��ġ�Ǵ� ���� ã�� ���������� ������ ����
 * - ����
 *  switch(�񱳴��){
 *  	case ��1: ���๮��;
 *  		..
 *  		break;
 *  	case ��2: ���๮��;
 *  		..
 *  		break;
 *  	case ��3: ���๮��;
 *  		..
 *  		break;
 *  	default: ��ġ�Ǵ� ���� ������ ������ ����;
 *  }
 *  ����: case ������ ����/���Ϲ���/���ڿ��� ����(�Ǽ�x,���ǽ�x)
 */
public class Test07Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("��ǰ��ȣ �Է�");
//		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.out.println("��ǰ: TV");
//			break;
//		case 2:
//			System.out.println("��ǰ: �����");
//			break;
//		case 3:
//			System.out.println("��ǰ: ����Ʈ��");
//			break;
//		case 4:
//			System.out.println("��ǰ: ��Ʈ��");
//			break;
//		default:
//			System.out.println("��ǰ����");
//		}
//		System.out.println("��ǰ�ڵ� �Է�");
//		String n = sc.next();
//		switch (n) {
//		case "A":
//		case "a":
//			System.out.println("��ǰ: TV");
//			break;
//		case "B":
//		case "b":
//			System.out.println("��ǰ: �����");
//			break;
//		case "C":
//		case "c":
//			System.out.println("��ǰ: ����Ʈ��");
//			break;
//		case "D":
//		case "d":
//			System.out.println("��ǰ: ��Ʈ��");
//			break;
//		default:
//			System.out.println("��ǰ����");
//		}
		// ���� ����ġ���� if ������ �ٲ㺸����
		System.out.println("��ǰ�ڵ� �Է�");
		String n = sc.next();
		if (n.equals("a") || n.equals("A")) {
			System.out.println("��ǰ: TV");
		} else if (n.equals("b") || n.equals("B")) {
			System.out.println("��ǰ: �����");
		} else if (n.equals("c") || n.equals("C")) {
			System.out.println("��ǰ: ����Ʈ��");
		} else if (n.equals("d") || n.equals("D")) {
			System.out.println("��ǰ: ��Ʈ��");
		} else {
			System.out.println("��ǰ����");
		}

	}
}

package day16.thread;

/*
 * [������]
 * - �ϳ��� �������α׷����� �������� �۾��� �淮�� ���μ����� ������ �����ϴ°�
 * - �ð��� ���� �����Ǵ��۾��̳� ���ÿ� ����Ǿ���ϴ� �۾��� ������ ������� �����Ѵ�.
 * - ������ ����� ���
 *   ���1) ThreadŬ������ ��ӹ޾� �����
 *   ���2) Runnable�������̽��� ��ӹ޾� �����
 */
public class Test01 {
	public static void main(String[] args) {
		filecoopy();
		print();
	}

	public static void filecoopy() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���Ϻ�����");
			if (i / 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("���Ϻ���Ϸ�");
	}

	public static void print() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("�����ͷ� �μ���");
			if (i / 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("�μ�Ϸ�");
	}

}

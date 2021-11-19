package day07;

public class Test05_Array {
	public static void main(String[] args) {
		Member[] mm = new Member[3];// 인스턴스가 3개 생성된 것이 아니라 Member객체를 참조할 수 있는 참조변수가 배열로 3개 만들어짐

		mm[0] = new Member("Test1", "1234");
		mm[1] = new Member("Test2", "0000");
		mm[2] = new Member("Test3", "1010");
		for (int i = 0; i < mm.length; i++) {
			mm[i].show();
		}
	}
}

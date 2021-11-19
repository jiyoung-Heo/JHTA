package day11.collection;

import java.util.Vector;

/*
 * [Vector]
 * - 객체를 배열처럼 관리해 주는 클래스(ArrayList와 유사한 기능)
 * - Vector와 ArrayList의 차이점
 *   1) Vector클래스는 스레드의 동기화를 지원한다.-> 멀티쓰레드환경에서는 안전하게 사용할 수 있으나 많은 자원을 소모하여 무겁다.
 *   2) ArrayList는 쓰레드의 동기화를 지원하지 않는다.-> 멀티스레드환경이 아니라면 ArrayList를 사용하는것이 효율적이다.
 *   	(가볍고 메모리를 적게 사용한다.)
 */
public class Test06_Vector {
//Vector 객체에 학생이름 다섯명을 저장하고 출력해보세요
	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("허지영");
		vt.add("허지영2");
		vt.add("허지영3");
		vt.add("허지영4");
		vt.add("허지영5");
		for (int j = 0; j < vt.size(); j++) {
			System.out.println(vt.get(j));
		}
	}
}

package day12.collection;

import java.util.HashMap;
import java.util.Scanner;

/*
 * [ Map(*) ]
 * - key와 value를 한쌍으로 저장하고 관리하는 클래스
 * - key값은 중복될 수 없으며 value는 중복이 가능하다.
 * - 데이터 검색시 용이하다.
 * - 주요메소드
 *   public V put(K key, V value): key와 value를 한쌍으로 저장
 *   public V remove(Object key): key와 매핑되어있는 value 삭제
 *   public V get(Object key): key와 매핑되어있는 value 리턴
 *   public V replace(K key, V value): key와 매핑되어있는 value 수정
 */
public class Test03_Map {
	public static void main(String[] args) {
		// key값은 Integer,value값은 String 타입으로 저장할 HashMap생성
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "하이1");
		hs.put(2, "하이2");
		hs.put(3, "하이3");
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생번호");
		int n = sc.nextInt();
		String s = hs.get(n);
		if (s == null) {
			System.out.println("해당번호가 존재하지 않습니다.");
		} else {
			System.out.println("value: " + s);
		}

	}
}

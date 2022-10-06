package data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {

		// 순서가 있고 중복이 가능하다. data들을 어떠한 알고리즘으로 저장할 것인가
		// 인덱스가 있다.

		List list0 = new LinkedList<>();
		list0.add(list0);
		list0.remove(0);

		List<Integer> list = new ArrayList<>();
		// list.add(list);
		// 값 추가방법
		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list);
		list.add(0, 1000);
		list.add(null);
		list.add(0, 5000);
		System.out.println(list);
		// 에드올
		list.addAll(list);
		System.out.println(list);

		// 값 삭제
		list.remove(4); // 인덱스 번호로 요소 삭제하기
		System.out.println(list);
		list.remove(new Integer(5000));
		// 만약 한번에 전체로 삭제하고 싶다면
		// list.clear();
		System.out.println(list);
		// 인덱스 번호로 삭제 또는 object 단위로 삭제할 수 있다.

		// size확인 방법
		System.out.println(list.size());

		// 값을 하나하나 출력하고 싶다면 a[10]
		// get이라는 메서드를 사용한다.

		System.out.println(list.get(0));
		// 인덱스의 크기는 n-1개이다
		System.out.println(list.get(list.size() - 1));

		// 수정하기
		list.set(0, 2000);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		int a = 0;
		while (a <= list.size() - 1) {
			System.out.println("------");
			System.out.println(list.get(a));
			a++;
		}

		// 요소 순회 (반복자)

		Iterator<Integer> iter = list.iterator();

		// 요소가 있으면 true
		while (iter.hasNext()) {
			System.out.println("hasNext :" + iter.hasNext());
			System.out.println("요소확인 : " + iter.next());
		}

		// 추가적으로 유용한 기능들
		// contains 리스트안에 검색하려는 object가 있는지 확인
		System.out.println(list.contains(new Integer(2000)));
		System.out.println(list.contains(new Integer(2001)));
		// 2000이라는 녀석이 몇번째 인덱스 존재하는지 알고싶다면
		// indexOf를 사용하면된다

		System.out.println("인덱스위치확인 : " + list.indexOf(new Integer(2000)));
		System.out.println("인덱스위치확인 : " + list.indexOf(new Integer(2)));
		// 만약 리스트안에 object가 존재하지 않으면 -1을 반환한다.
		System.out.println("인덱스위치확인 : " + list.indexOf(new Integer(2)));

		// 리스트,

		List<String> list2 = new LinkedList<>();
		list2.add("가");
		list2.add("나");
		list2.add("다");
		list2.add("라");
		list2.add("마");

		System.out.println(list2);
	}

}

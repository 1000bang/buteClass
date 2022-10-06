package data_structure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainTest3 {

	public static void main(String[] args) {

		// set 계열 알아보기
		Set set;

		// 순서가 없고 중복이 불가능하다.(덮어쓰기됨)
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("가");
		hashSet.add("가");
		hashSet.add("나");
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());

		// remove
		// hashSet.remove("가");
		// hashSet.clear();


		
		// set 계열 인덱스 없음
		for (String myValue : hashSet) {
			System.out.println(myValue);
		}

		// while문
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println("next : "+ iterator.next());	
		}
		
		
		
		
	}
}

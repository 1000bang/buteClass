package data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

//map
public class MainTest2 {
	public static void main(String[] args) {
		Map map;
		// [] -> list
		// {} -> map
		// key와 value구조로 데이터를 저장한다.
		HashMap<String, String> map1 = new HashMap<>();
		// 값을 추가하는 방법
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		// null 값을 저장할 수 있다 키는 null불가
		map1.put("A04", null);
		// 키가 중복되면 덮어쓰기 됨
		map1.put("A04", "11");
		// map1.put("A07", new ArrayList<Integer>());
		System.out.println(map1);

		// 값을 꺼내는 방법
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("A02"));

		// 값 수정
		map1.put("A01", "값수정");
		// 삭제
		map1.remove("A01");
		// map1.clear();

		// 의미없음 키값을 받아야함
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}

		// map 계열을 반복문을 사용할 때 for each문 활용
		// map1 자체는 키와 벨류 구조로 되어있음
		// map1.keyset()하면 키들이 나옴
		for (String key : map1.keySet()) {
			System.out.println("key :" + key);
			System.out.println("value : " + map1.get(key));

		}

		//Entry 활용  import java.util.Map.Entry;
		
		
		for(Entry <String, String> entry : map1.entrySet()) {
			System.out.println("key : " +entry.getKey() + " value : " +entry.getValue());
			
		}
		
		
		
		// null값을 저장하지 않는 map계열
		Hashtable<String, String> hashtable = new Hashtable<>();
		// hashtable.put("h1", null); // 단점... 컴파일 시점에 확인되지 않는다 !! 안쓴다
		hashtable.put("h2", "안녕");
		System.out.println(hashtable);

	
	


}
}
package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainTest4 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < 45; i++) {
			arrayList.add(i);
		}

		Collections.shuffle(arrayList);
		System.out.println(arrayList.subList(0, 6));
		
//		for (int i = 0; i < 6; i++) {
//			arrayList.get(i);
//				
//		}
//		
		
		
	}

}

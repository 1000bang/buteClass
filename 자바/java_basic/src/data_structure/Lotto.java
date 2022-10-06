package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		// System.out.println(getRandomNumber());

		HashSet<Integer> hashSet = new HashSet<>();

		// 2.set계열에 데이터를 저장해보기

		boolean flag = true;
		while (flag) {
			if (hashSet.size() < 6) {
				hashSet.add(getRandomNumber());
			} else {
				flag = false;
			}
		}

		//이 방법도 있다 근데 버그
		Arrays.sort(hashSet.toArray());
		System.out.println(hashSet);
		System.out.println("-----------------");
		List<Integer> list = new ArrayList<>();
		list.addAll(hashSet);
		list.sort(null);
		System.out.println(list);

	}

	// 1. 랜덤숫자 뽑기 !!! 1 - 45
	public static int getRandomNumber() {
		Random random = new Random();
		int result = random.nextInt(45) + 1;
		return result;
	}

}

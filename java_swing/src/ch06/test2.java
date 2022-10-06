package ch06;

import java.util.Random;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int[] selectNum = new int[6];
		int[] lottoWinNum = new int[6];
		
		for (int i = 0; i < 6; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
				if (lottoWinNum[i] < lottoWinNum[j]) {
					int temp = lottoWinNum[i];
					lottoWinNum[i] = lottoWinNum[j];
					lottoWinNum[j] = temp;
				}
			}
		}
		System.out.println(lottoWinNum[0]);
		System.out.println(lottoWinNum[1]);
		System.out.println(lottoWinNum[2]);
		System.out.println(lottoWinNum[3]);
	}

}

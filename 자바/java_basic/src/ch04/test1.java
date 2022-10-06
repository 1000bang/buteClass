package ch04;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
				
		int randomResult;
		int userInput;
				
		randomResult = random.nextInt(5)+1;

		System.out.println("● ● ● 야구게임 ● ● ● ");
		System.out.println("랜덤으로 나오는 숫자 중 3개를 맞추면 안타, 틀리면 아웃입니다.");
		System.out.println("게임을 시작하려면 숫자키를 누른 후 엔터를 눌러주세요.");
		
		System.out.println("숫자를 입력해 게임 시작하기.");
		userInput = sc.nextInt();
		System.out.println("입력 숫자 : "+ userInput);
		System.out.println("랜덤 숫자 : "+ randomResult);
		int count = 0;
		while(userInput != randomResult) {
		      System.out.println("숫자를 입력해주세요.");
		      userInput = sc.nextInt();
		      count++;
		      System.out.println(count + "아웃");
		      System.out.println("입력 숫자 : "+ userInput);
		      System.out.println("랜덤 숫자 : "+ randomResult);
		if (count == 3) {
			break;
		}
		}
					
		System.out.println("게임이 종료되었습니다.");

	}

}

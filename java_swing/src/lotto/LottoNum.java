package lotto;

import java.util.Arrays;
import java.util.Random;

//로또 번호를 생성하는 클래스
public class LottoNum {

	final int LOTTO_NUMBER_SIZE = 6;

	//datatype int[]로 수정 리턴값을 설정
	public int[] createdLottoNum() {

		Random random = new Random();
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];

		// 로또 전체 번호 1~45개 중 랜덤 6개 , 중복 불가
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		//for문 끝나고 위치할 것 arrayssortasdfkljsfadjklasdfjlkasdflkj
		Arrays.sort(lottoWinNum);
		return lottoWinNum;
	}

}
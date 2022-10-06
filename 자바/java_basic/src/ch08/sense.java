package ch08;
import java.util.Random;


public class sense {
	//이름, 마법사, 레벨, mp, hp, fire순으로 작성
	Wizard wizard1 = new Wizard("김법사","마법사",12, 100, 100, 20);
	
	//이름, 전사, 레벨, hp, mp, hit 순으로 작성 
	Warrior worrior1 = new Warrior("박전사","전사", 10, 100, 100, 15);
	
public void fight () {
	Random rnd = new Random();
	int random = rnd.nextInt(2);	;
	if (random == 1) {
	//	worrior1.wSwing();
		
	}
}
	
	
	
	
}

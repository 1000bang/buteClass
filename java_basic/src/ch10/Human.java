package ch10;

public class Human{

	String name;
	String job;
	int age;
	String adress;
	
	public Human(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public Human(String name, String job, int age) {
		this(name, job);
		this.age = age;
	}
	public Human(String name, String job, int age, String adress) {
		this(name, job, age);
		this.adress = adress;
	}
	public Human() {
		this("김아무개","전사", 1, "대한민국");
	}
	


	public Human getHuman = new Human();
		// 자기 자신의 주소값 반환 시키는 방법 
		//1. public Human getHuman = new Human(); 
		//2. return new Human();
		//return this;  //3
		
			
	}
	
	


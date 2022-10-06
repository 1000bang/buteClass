package ch07; //2

public class MainTest {

	public static void main(String[] args) {

		//Student_01 student1 = new Student_01(10, "김개똥", 3);
		
		//기본생성자 활용해서 메모리 할당
		Student student1 = new Student();
		//사용자 정의 생성자 활용해서 메모리에 할당
		Student student2 = new Student(100, "김개똥", 3);
		System.out.println(student1.showInfo());
		System.out.println(student2.showInfo());
				
// 	아래처럼 하나하나 접근하지 않고 
// 	생성자를 통해 한줄에 수행할 수 있도록 함
		
//		student1.number = 1;
//		student1.name = "김개똥";		
//		student1.grade = 3;
		
		
		
		
	} 

}

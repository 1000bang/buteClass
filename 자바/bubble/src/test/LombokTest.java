package test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor  //멤버변수가 모두 들어가 있는 생성자
@NoArgsConstructor  // 기본 생성자
class Dog {
	private String name;
	private int age;
}

public class LombokTest {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.setName("별이");
		System.out.println(dog.getName());
	}

}

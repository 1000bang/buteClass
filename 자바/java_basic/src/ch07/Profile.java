package ch07;

public class Profile {

	int height;
	int weight;
	String gender;
	String name;
	int age;

	public Profile(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	public Profile(int height, int weight, String gender, String name) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;

	}

	public Profile(int height, int weight, String gender) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;

	}

	public Profile(int height, int weight) {

		this.height = height;
		this.weight = weight;

	}

//	public Profile(int height) {
//		
//		this.height = height;
//	}

	public String showInfo() {
		// if (Profile=true) {
		// if (this.name != null && this.height != null && this.age != null) {
		if (this.name == null && this.gender == null && this.age == 0 && this.weight == 0 && this.height == 0) {
			System.out.println("데이터가 부족합니다");
			return "df";
		} else {
			return "키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다.." + "이름은" + name + "이고 나이는 " + age
					+ "입니다.";

//		return  "키가 "+ height +"이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다.."
//			+ "이름은" + name + "이고 나이는 "+ age + "입니다.";   	}

		}

	}
	
}

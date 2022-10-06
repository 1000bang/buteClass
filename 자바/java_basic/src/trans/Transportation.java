package trans;

public class Transportation {
	String name;
	String destination;
	int price;
	String time;

	// 게터세터
	public String getName() {
		return name;
	}

	public String getDestination() {
		return destination;
	}

	public int getPrice() {
		return price;
	}

	public String getTime() {
		return time;
	}

	public void take() {
		System.out.println(name + "을 타고 " + destination + "까지 " + time + "걸리고 " + price + "원의 비용이 발생한다");
	}

}

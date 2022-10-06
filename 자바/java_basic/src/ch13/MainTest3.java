package ch13;

public class MainTest3 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(100);
		// 구매발생
		customerLee.calcPrice(10_000);
		System.out.println(customerLee.showCustomerInfo());

		
		//부모 클래스의 setCustomer를 사용 
		VipCustomer vipCustomerKim = new VipCustomer();
		vipCustomerKim.setCustomerName("김유신");
		vipCustomerKim.setCustomerID(200);
		// 구매발생
		vipCustomerKim.calcPrice(10_000);
		System.out.println(vipCustomerKim.showCustomerInfo());
	}

}

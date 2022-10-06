package ch10;

public class Employee {
	
	public static int serialNum;
	private  int employeeId;
	private String employeeName;
	private String department;
	
	//자기 고유 번호를 객체가 저장 하고 있어야함
	//변수를 활용
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeDepartment() {
		return department;
	}
	
	public void setEmployeeDepartment(String employeeDepartment) {
		this.department = employeeDepartment;
	}
}

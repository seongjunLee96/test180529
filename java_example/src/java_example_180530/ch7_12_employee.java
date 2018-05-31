package java_example_180530;

public class ch7_12_employee {
	//필드
	protected String name;
	protected double salary;
	
	//생성자
	ch7_12_employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	
	//Employee의 이름, 급여 정보를 가져오기 위한 메소드

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	void raiseSalary() {
		this.salary *= 1.1;
	}

}

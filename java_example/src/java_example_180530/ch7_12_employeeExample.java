package java_example_180530;

public class ch7_12_employeeExample {

	public static void main(String[] args) {
		ch7_12_employee employee = new ch7_12_employee("사원", 2400);
		employee.raiseSalary();
		ch7_12_manager manager = new ch7_12_manager("매니저", 3000, 200);
		manager.raiseSalary();
		ch7_12_excutive excutive = new ch7_12_excutive("임원", 8000, 1000, 500);
		excutive.raiseSalary();
		
		System.out.println(employee.name + employee.salary);
		System.out.println(manager.name + manager.salary + manager.bonus);
		System.out.println(excutive.name + excutive.salary + excutive.bonus + excutive.stockOption);
		
		
	}
	
	
}

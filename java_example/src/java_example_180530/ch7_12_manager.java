package java_example_180530;


public class ch7_12_manager extends ch7_12_employee {
	
	protected int bonus;
	
	ch7_12_manager(String name, double salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	void salaryUp() {
		this.salary *= 1.2;
	}
	
	//급여인상을 위한 메소드
	@Override
	public void raiseSalary() {
		this.salary = this.salary * 1.2;
	}
}

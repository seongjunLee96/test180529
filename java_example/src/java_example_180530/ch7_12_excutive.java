package java_example_180530;

public class ch7_12_excutive extends ch7_12_manager{
	public int stockOption;
	
	ch7_12_excutive(String name, double salary,int bonus, int StockOption) {
		super(name, salary,bonus);
		this.stockOption = stockOption;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void raiseSalary() {
		this.salary *= 1.3;
	}
}

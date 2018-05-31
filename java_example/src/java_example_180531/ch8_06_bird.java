package java_example_180531;

/*public class ch8_06_bird implements ch8_06_countable {
	String name;
	ch8_06_bird(String name){
		this.name = name;
	}
	void fly() {
		System.out.println(2 + "마리" + name + "가 날아간다.");
	}
	
	@Override
	public void count() {
		System.out.println(this.name + "가 " + 2 + "마리 있다.");
		
	}
}*/

public class ch8_06_bird extends ch8_06_countable{

	ch8_06_bird(String name, int num) {
		super(name, num);
		// TODO Auto-generated constructor stub
	}
	@Override
	void count() {
		System.out.println(this.name + "가 " + 2 + "마리 있다.");
		
	}
	
	void fly() {
		System.out.println(2 + "마리" + name + "가 날아간다.");
	}
	
}

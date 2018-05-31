package java_example_180531;

/*public class ch8_06_tree implements ch8_06_countable{

	String name;
	ch8_06_tree(String name){
		this.name = name;
	}
	
	void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
	
	@Override
	public void count() {
		System.out.println(this.name + "가 " + 5 + "그루 있다.");
		
	}

}*/

public class ch8_06_tree extends ch8_06_countable{

	ch8_06_tree(String name, int num) {
		super(name, num);
		// TODO Auto-generated constructor stub
	}

	void count() {
		System.out.println(this.name + "가 " + 2 + "마리 있다.");
		
	}
	
	void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
	
}
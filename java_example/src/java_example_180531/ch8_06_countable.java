package java_example_180531;

/*public interface ch8_06_countable {
	
	public void count();
}*/

public abstract class ch8_06_countable {
	
	//필드
	protected String name;
	protected int num;
	
	//생성자
	ch8_06_countable(String name, int num){
		this.name = name;
		this.num = num;
	}
	//추상메소드
	abstract void count();
}

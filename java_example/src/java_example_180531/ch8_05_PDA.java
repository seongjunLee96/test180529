package java_example_180531;

public class ch8_05_PDA {
	//덧셈 계산
	int a;
	int b;
	int c;
	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		c = a + b;
		
		System.out.println(a + " + " + b +" = " + c);
	}
}

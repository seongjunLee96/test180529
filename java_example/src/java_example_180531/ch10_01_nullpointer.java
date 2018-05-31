package java_example_180531;

public class ch10_01_nullpointer {
	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println("예외 발생전....");
			System.out.println(data.toString());
			System.out.println("예외 발생후....");
			System.out.println(data);
		} catch(NullPointerException e) {
			System.out.println("예외가 발생했으니 코드를 확인해 볼 것");
		}
		
	}
}

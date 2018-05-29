package java_example_180528;

public class ch7_03_computerExample {

	public static void main(String[] args) {
		int r = 10;
		
		//부모 클래스의 메소드 호출
		ch7_03_calcualator calcualator = new ch7_03_calcualator();
		System.out.println("부모 클래스 메소드 호출 : " + calcualator.areaCircle(r));
		
		//자식 클래스에서 재정의된 메소드 호출
		ch7_03_computer computer = new ch7_03_computer();
		System.out.println("자식 클래스 메소드 호출 : " + computer.areaCircle(r));
	}

}

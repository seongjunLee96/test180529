package java_example_180516;

public class ch3_StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이성준";
		String strVar2 = "이성준";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("이성준");
		System.out.println(strVar1 == strVar2);//true
		System.out.println(strVar1 == strVar3);//false
		System.out.println();//.equals()
		System.out.println(strVar1.equals("이성준"));
		System.out.println(strVar1.equals(strVar3));

	}

}

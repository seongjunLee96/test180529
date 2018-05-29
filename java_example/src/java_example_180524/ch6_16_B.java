package java_example_180524;

import java_example_180523.ch6_02_car;

public class ch6_16_B {
	public static void main(String[] args) {
		/*public ch6_16_B() {
	}*/
	ch6_16_A a1 = new ch6_16_A();
	System.out.println(a1.field1);
	System.out.println(a1.field2);
//	System.out.println(a1.field3);
	a1.field1 = 1;
	a1.field2 = 1;
//	a1.field3 = 1;	//private로 선언되서 보이지 않음.
	System.out.println(a1.field1);
	System.out.println(a1.field2);
//	System.out.println(a1.field3);
	
	a1.method1();
	a1.method2();
//	a1.method3();	//private로 선언되서 보이지 않음.
	}
}
}

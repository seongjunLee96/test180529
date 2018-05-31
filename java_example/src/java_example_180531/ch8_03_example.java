package java_example_180531;

public class ch8_03_example {

	public static void main(String[] args) {
		
		ch8_03_implementationC impl = new ch8_03_implementationC();
		
		ch8_03_interfaceA ia = impl;
		ia.methodA();
		ch8_03_interfaceB ib = impl;
		ib.methodB();
		
		ch8_03_interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}

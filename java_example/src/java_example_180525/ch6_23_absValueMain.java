package java_example_180525;

import java.util.Scanner;

public class ch6_23_absValueMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ch6_23_absValue C1 = new ch6_23_absValue();
		
		while(true) {
			C1.select();
			switch(C1.select) {
				case 1:{
					C1.distance();
					break;
				}
				case 2: {
					C1.abs();
				}
			}
		}
	}
}

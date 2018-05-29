package java_example_180517;

import java.util.Scanner;

public class ch4_12_ForExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("더하고 싶은 숫자 범위를 입력하세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum = 0;
		if(num1<=num2) {
		for(; num1 <= num2 ;num1++)
			{System.out.print(num1);
			if(num1 != num2)
				System.out.print(" + ");
			sum += num1;}
		}
		else {
			for(; num1 >= num2 ;num2++)
				{System.out.print(num2);
				if(num2 != num1)
					System.out.print(" + ");
				sum += num2;}
			}
		System.out.println(" = " + sum);
	}
}

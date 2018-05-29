package java_example_180517;

import java.util.Scanner;

public class ch4_18_ForExample {

	public static void main(String[] args) {
		//1부터 입력받은 수까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 계산하시오.
		int num, sum = 0;
		System.out.println("정수 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			if(i % 2 != 0 && i % 3 != 0)
				sum += i;
		}
		System.out.println(sum);
	}

}

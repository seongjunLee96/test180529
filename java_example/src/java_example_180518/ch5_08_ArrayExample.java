package java_example_180518;

import java.util.Scanner;

public class ch5_08_ArrayExample {
	public static void main(String[] args) {
		/*
		 * 3열짜리 1차원 배열을 선언하고
		 * 스캐너를 이요하여 값을 하나하나 입력하고
		 * 입력된 값의 총 합 및 평균 값을 구하시오.
		 */
		 int arr[] = new int[3];
		 int sum = 0, avg = 0;
		 Scanner scanner = new Scanner(System.in);
		 for(int i = 0 ; i < arr.length ; i++) {
			 System.out.print(i + 1 + "번째 숫자를 입력하세요 : ");
			 arr[i] = scanner.nextInt();
			sum += arr[i];
		 }
		avg = sum / arr.length;
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}

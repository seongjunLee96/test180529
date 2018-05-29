package java_example_180521;

import java.util.Scanner;

public class ch5_09_arrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고,
		 * 입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		int [] arr = new int[5];
//		int max = 0;
		
		int i = 0;
		int tmp = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		for(i = 0 ; i < arr.length ; i++)
			arr[i] = scanner.nextInt();
			/*if(arr[i]>=max)
				max = arr[i];*/
		for(i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(i=0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
//		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
}

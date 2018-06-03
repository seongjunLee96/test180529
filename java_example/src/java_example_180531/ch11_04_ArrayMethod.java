package java_example_180531;

import java.util.Arrays;
import java.util.Collections;

public class ch11_04_ArrayMethod {

	public static void main(String[] args) {
		String[] score = {"가나다", "하하하", "마바사"};
		for(int i = 0 ; i < score.length ; i++)
			System.out.println(score[i]);
	
	Arrays.sort(score,Collections.reverseOrder());
	for(int i = 0 ; i < score.length ; i++)
		System.out.println(score[i]);
	}
	
}

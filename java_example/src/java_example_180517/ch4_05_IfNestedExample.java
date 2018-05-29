package java_example_180517;

import java.util.Scanner;

public class ch4_05_IfNestedExample {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받고
		 * 95점 이상이면 A+
		 * 90점 이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 C
		 * 65~69 D+
		 * 60~64 D
		 * 60미만 F
		 * 
		 * if문이 끝나면 학점을 출력하는 print문 사용
		 * 주의할 점은 학점 값을 처리하는 Stirng 타입의 변수를 하나 사용
		 */
		System.out.println("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score= scanner.nextInt();
		String grade;
		
		if(score>=95)
			grade = "A+";
		else {
			if(score >=90)
				grade = "A";
			else {
				if(score >=85)
					grade = "B+";
				else {
					if(score >=80)
						grade = "B";
					else {
						if(score >=75)
							grade = "C+";
						else {
							if(score >=70)
								grade = "C";
							else {
								if(score >=65)
									grade = "D+";
								else {
									if(score >=60)
										grade = "D";
									else
										grade = "F";
								}
							}
						}
					}
				}
			}
		}
		System.out.println(grade);
	}
}

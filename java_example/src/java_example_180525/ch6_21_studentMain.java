package java_example_180525;

import java.util.Scanner;

import java_example_180524.ch6_18_exercise;

public class ch6_21_studentMain {

	/*학생 수를 입력 받고 이름과 국어, 영어, 수학 점수를 입력 받아
	평균과 등수를 구하라 */
	
	public static void main(String[] args) {
		int i = 0, j = 0;
		Scanner scan = new Scanner(System.in);
		ch6_21_student stud1 = new ch6_21_student();
		for(i = 0;i < 2 ; i++) {
			System.out.println("이름을 입력하세요 : ");
			stud1.name = scan.next();
			for(j = 0 ; j < 2; j++)
			System.out.println("성적을 입력하세요 : ");
			stud1.grade[i][j] = scan.nextInt();
			}
		ch6_21_student stud2 = new ch6_21_student();
		ch6_21_student stud3 = new ch6_21_student();
		
		
		stud1.result();
		stud2.result();
		stud3.result();
	}

}

package java_example_180524;

public class ch6_18_exercise {
	String name;			//이름
	int assignmentScore;	//과제점수
	int examScore;			//시험점수
	char grade;				//학점

	public char grade() {
		if((assignmentScore + examScore) / 2 >= 90)
			grade = 'A';
		else if((assignmentScore + examScore) / 2 >= 80)
			grade = 'B';
		else if((assignmentScore + examScore) / 2 >= 70)
			grade = 'C';
		else
			grade = 'F';
		return grade;
	}
	
	public void result() {
		System.out.println("이름 : " + name);
		System.out.println("과제 점수 : " + assignmentScore);
		System.out.println("시험 점수 : " + examScore);
		System.out.println("학점 : " + grade());
	}
}

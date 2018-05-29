package java_example_180524;

public class ch6_19_exercise {

	private String name;			//이름
	private int assignmentScore;	//과제점수
	private int examScore;			//시험점수
	private char grade;				//학점


    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

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
		System.out.println("이름 : " + getName());
		System.out.println("과제 점수 : " + getAssignmentScore());
		System.out.println("시험 점수 : " + getExamScore());
		System.out.println("학점 : " + getGrade());
	}
}

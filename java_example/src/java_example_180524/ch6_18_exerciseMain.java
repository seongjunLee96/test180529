package java_example_180524;

public class ch6_18_exerciseMain {

	public static void main(String[] args) {
		ch6_18_exercise stud1 = new ch6_18_exercise();
		stud1.name = "선남";			//이름
		stud1.assignmentScore = 91;	//과제점수
		stud1.examScore = 84;		//시험점수
//		System.out.println(stud1.toString());
		stud1.result();
		
		ch6_18_exercise stud2 = new ch6_18_exercise();
		stud2.name = "선녀";			//이름
		stud2.assignmentScore = 86;	//과제점수
		stud2.examScore = 95;		//시험점수
//		System.out.println(stud1.toString());
		stud2.result();
		
	}

}

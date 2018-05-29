package java_example_180528;

public class ch7_02_studentExample {

	public static void main(String[] args) {
		//student 클래스에 대한 객체 생성
		ch7_02_student student = new ch7_02_student("이성준","123456-1234567",10);
		
		//부모클래스의 필드
		System.out.println(student.name);
		System.out.println(student.ssn);
		
		//자식클래스의 필드
		System.out.println(student.studentNo);
				
		
	}

}

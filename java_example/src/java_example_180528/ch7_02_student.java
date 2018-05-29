package java_example_180528;

public class ch7_02_student extends ch7_02_people{
	public int studentNo;
	
	public ch7_02_student(String name, String ssn, int studentNo){
		super(name,ssn); //부모 클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.studentNo = studentNo;
	}

}

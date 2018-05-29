package java_example_180523;
//method overloading 232p
public class ch6_09_calculator {
	double width;
	double height;

	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle 
	//직사각형의 넓이를 구하는 메소드 
	double areaRectangel(double width){
		this.width = width;
		double area = width * width;
		println("정사각형의 넓이 : " + area);
		return area;
	}
	
	double areaRectangel(double width, double height){
		this.width = width;
		this.height = height;
		double area = width * height;
		println("직사각형의 넓이 : " + area);
		return area;
	}
	
	
	void println(String message) {
		System.out.println(message);
	}
	
}


//main클래스의 실행 내용
/*
 *객체 생성해서
 *정사각형 넓이 구하는 메소드 호출하고 결과 출력
 *직사각형 넓이 구하는 메소드 호출하고 결과 출력 
 */

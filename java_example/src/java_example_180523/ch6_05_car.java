package java_example_180523;
//생성자 (constructor) overloading 에제
public class ch6_05_car {
	
	//field 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//여러 종류의 생성자 선언해보기
	/*
	 * 1.기본생성자
	 * 2.model을 매개변수로 하는 생성자
	 * 3.model, color를 매개변수로 하는 생성자
	 * 4.model, color, maxSpeed를 매개변수로 하는 생성자
	 */
	ch6_05_car(){}
	/*ch6_05_car(String model){
	}*/
	
	ch6_05_car(String model){
//		this.model= model;
		this(model, "은색", 300)
	}
	
	//model, color를 매개변수로 하는 생성자
	ch6_05_car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//model, color, maxSpeed를 매개변수로 하는 생성자
	
	ch6_05_car(String model, String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

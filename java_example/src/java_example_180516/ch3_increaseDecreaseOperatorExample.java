package java_example_180516;
//증감연산제 예제 p.71
/*++, 00
변수 앞에 ++이 붙으면 1을 증가시키고 계산에 사용
변수 뒤에 ++이 붙으면 일단 변수값을 사용하고 1을 증가시켜 놓음*/
public class ch3_increaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;	//x = 11
		++x;	//x = 11
		System.out.println("x = " + x);	//x = 12
		
		System.out.println("---------------");
		y--;	//y = 9
		--y;	//y = 9
		System.out.println("y = " + y);	//y = 8;
		
		System.out.println("---------------");
		z = x++;	//z = 12
		System.out.println("z = " + z); //z = 12
		System.out.println("x = " + x); //x = 13
		
		System.out.println("---------------");
		z = ++x;	//z = 13
		System.out.println("z = " + z);	//z = 14
		System.out.println("x = " + x);	//x = 14
		
		System.out.println("---------------");
		z = ++x + y++;	//z = 14 + 8 = 22
		System.out.println("z = " + z);	//z = 23 
		System.out.println("x = " + x); //x = 15
		System.out.println("y = " + y); //y = 8
	
	}

}

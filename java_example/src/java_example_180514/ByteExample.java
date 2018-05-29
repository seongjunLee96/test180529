package java_example_180514;

public class ByteExample {

	public static void main(String[] args) {
		/*
		 * byte 타입은 -128 ~ 127 범위의 정수만 사용할 수 있음.
		 * var 변수는 모두 byte 타입으로 선언
		 * var1에 -128대입
		 * var2에 -30대입
		 * var3에 0 대입
		 * var4에 30대입
		 * var5에 127대입
		 * var6에 128대입
		 * 그리고 각각 변수 값을 출력하세요.
		 */
		byte var1 = -128, var2 = -30, var3 = 0,
				var4 = 30, var5 = 127, var6 = 128;
		System.out.println(var1, var2, var3, var4, var5, var6);
	
	}

}

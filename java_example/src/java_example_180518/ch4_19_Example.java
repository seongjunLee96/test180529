package java_example_180518;

public class ch4_19_Example {

	public static void main(String[] args) {
		//문제 : 1 + (-2) + 3 + (-4) ... 형태로 더했을 때 얼마까지 더해야 총합이 100이상이 되는지 구해보시오.
		int i = 0, sum = 0, sw = 1;
		do{
			i++;
			sum += i * sw;
				if(i * sw < 0) {
					if (sum == 100)
						System.out.print("(" + i * sw + ")");
					else
						System.out.print("(" + i * sw + ")" + " + ");
				}
				else {
					if(sum == 100)
						System.out.print(i * sw);
					else
						System.out.print(+ i * sw + " + ");
				}
				sw *= -1;
			/*for(i = 1 ; i <= max ; i++)
			{
				sum += i * sw;
				if(i <= max) {
					if(i * sw < 0) {
						if ( i == max)
							System.out.println("(" + i * sw + ")");
						else
							System.out.print("(" + i * sw + ")" + " + ");
					}
					else {
						if(i == max)
							System.out.print(i * sw);
						else
							System.out.print(+ i * sw + " + ");
					}
					sw *= -1;
				}
			}
		}*/
		}while(sum != 100);
		System.out.println(" = " + sum);
		System.out.println("숫자 : " + i);
		System.out.println("합계 : " + sum);
		
	}
}
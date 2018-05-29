package java_example_180523;

import java.util.Scanner;

public class ch6_09_calculatorExample {

	public static void main(String[] args) {
		ch6_09_calculator area = new ch6_09_calculator();

		/*Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();*/
		area.width = 10;
		area.height = 20;
		area.areaRectangel(area.width);
		area.areaRectangel(area.width, area.height);
	}

}

package Assignments;

public class ScientificCalculator extends Calculator {

	double x = Math.PI / 2;

	public void getSinOfNumber() {
		x = Math.toRadians(x);
		System.out.println("Math.asin(" + x + ")=" + Math.asin(x));
	}

	public void getCosOfNumber() {
		x = Math.toRadians(x);
		System.out.println("Math.asin(" + x + ")=" + Math.acos(x));
	}
}

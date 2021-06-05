package Assignments;

//Assignment 9
public class Calculator {

	int a = 10;
	int b = 20;

	public void addition() {
		int sum = a + b;
		System.out.println("Addition of 2 numbers is :" + sum);
	}

	public void subtraction() {
		int subtraction = a - b;
		System.out.println("Subtraction of 2 numbers is :" + subtraction);
	}

	public void multiplication() {
		int multiplication = a * b;
		System.out.println("Multiplication of 2 numbers is :" + multiplication);
	}

	public void division() {
		int division = a / b;
		System.out.println("Division of 2 numbers is :" + division);
	}

	public void modulus() {
		int modulus = a % b;
		System.out.println("Modulus of 2 numbers is :" + modulus);
	}
}

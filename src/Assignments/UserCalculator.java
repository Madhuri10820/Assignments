package Assignments;

import java.util.Scanner;

public class UserCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int number1 = scan.nextInt();
		System.out.println("Entered number is:" + number1);
		
		System.out.println("Enter 2nd number");
		int number2 = scan.nextInt();
		System.out.println("Entered number is:" + number2);

		int addition = number1 + number2;
		System.out.println("Addition of 2 numbers is:" + addition);
		
		int subtraction = number1 - number2;
		System.out.println("Subtraction of 2 numbers is:" + subtraction);
		
		int multiplication = number1 * number2;
		System.out.println("Multiplication of 2 numbers is:" + multiplication);
		
		int division = number1 / number2;
		System.out.println("Division of 2 numbers is:" + division);
		
		int modulus = number1 % number2;
		System.out.println("Modulus of 2 numbers is:" + modulus);
	}

}

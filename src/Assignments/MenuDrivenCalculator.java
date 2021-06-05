package Assignments;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Select any 1 option....");
		menu();
		
		
		int option = scan.nextInt();
		
		switch (option) {

		case 1:
			System.out.println("Addition function calling..");
			int no1 = getFirstInput(scan);
			int no2 = getSecondInput(scan);
			int addition = Addition(no1, no2);
			System.out.println("Addition of 2 numbers are: " + addition);
			break;

		case 2:
			System.out.println("Substraction function calling..");
			int no3 = getFirstInput(scan);
			int no4 = getSecondInput(scan);
			int subtraction = Substraction(no3, no4);
			System.out.println("Substraction of 2 numbers are: " + subtraction);
			break;

		case 3:
			System.out.println("Multiplication function calling..");
			int no5 = getFirstInput(scan);
			int no6 = getSecondInput(scan);
			int multiplication = Multiplication(no5, no6);
			System.out.println("Multiplication of 2 numbers are: " + multiplication);
			break;

		case 4:
			System.out.println("Divison function calling..");
			int no7 = getFirstInput(scan);
			int no8 = getSecondInput(scan);
			int divison = Division(no7, no8);
			System.out.println("Divison of 2 numbers are: " + divison);
			break;

		case 5:
			System.out.println("Modulus function calling..");
			int no9 = getFirstInput(scan);
			int no10 = getSecondInput(scan);
			int modulus = Modulus(no9, no10);
			System.out.println("Modulus of 2 numbers are: " + modulus);
			break;

		default:
			System.out.println("None of the above!");
			break;
		}

	}

	private static int getFirstInput(Scanner scan) {
		System.out.println("Enter 1st number");
		int no1 = scan.nextInt();
		return no1;
	}

	private static int getSecondInput(Scanner scan) {
		System.out.println("Enter 2nd number");
		int no2 = scan.nextInt();
		return no2;
	}

	private static void menu() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
	}

	public static int Addition(int a, int b) {
		return a + b;
	}

	public static int Substraction(int a, int b) {
		return a - b;
	}

	public static int Multiplication(int a, int b) {
		return a * b;
	}

	public static int Division(int a, int b) {
		if (b == 0) {
			System.out.println("Divisdion not allowed ");
			return 0;
		} else {
			int div = a / b;
			return div;
		}
	}

	public static int Modulus(int a, int b) {
		return a % b;
	}
}

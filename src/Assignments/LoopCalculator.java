package Assignments;

import java.util.Scanner;

public class LoopCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 6; i++) {
			System.out.println("Select any one option..");
			menu();
			int selection = scan.nextInt();

			switch (selection) {

			case 1:
				int addition = addition(getFirstInput(scan), getSecondInput(scan));
				System.out.println("Addition of 2 no's are :" + addition);
				break;

			case 2:
				int subtraction = subtraction(getFirstInput(scan), getSecondInput(scan));
				System.out.println("Subtraction of 2 no's are :" + subtraction);
				break;

			case 3:
				int multiplication = multiplication(getFirstInput(scan), getSecondInput(scan));
				System.out.println("Multiplication of 2 no's are :" + multiplication);
				break;

			case 4:
				int divison = divison(getFirstInput(scan), getSecondInput(scan));
				System.out.println("Divison of 2 no's are :" + divison);
				break;

			case 5:
				int modulus = modulus(getFirstInput(scan), getSecondInput(scan));
				System.out.println("Modulus of 2 no's are :" + modulus);
				break;

			case 6:
				System.exit(0);
			}

		}

	}

	public static int getFirstInput(Scanner scan) {
		System.out.println("Enter 1st number");
		int num1 = scan.nextInt();
		return num1;
	}

	public static int getSecondInput(Scanner scan) {
		System.out.println("Enter 2nd number");
		int num2 = scan.nextInt();
		return num2;
	}

	public static void menu() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		System.out.println("5. Modulus");
		System.out.println("6. Exit");
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int divison(int a, int b) {
		return a / b;
	}

	public static int modulus(int a, int b) {
		return a % b;
	}
}

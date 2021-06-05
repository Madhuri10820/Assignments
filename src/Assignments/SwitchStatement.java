package Assignments;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int days = scan.nextInt();

		switch (days) {

		case 1:
			System.out.println("Day is MONDAY");
			break;
		case 2:
			System.out.println("Day is TUESDAY");
			break;
		case 3:
			System.out.println("Day is WEDNESDAY");
			break;
		case 4:
			System.out.println("Day is THUSRDAY");
			break;
		case 5:
			System.out.println("Day is FRIDAY");
			break;
		case 6:
			System.out.println("Day is SATURDAY");
			break;
		case 7:
			System.out.println("Day is SUNDAY");
			break;
		default:
			System.out.println("None of the above!");
			break;
		}

	}

}

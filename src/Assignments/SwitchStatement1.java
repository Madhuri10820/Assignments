package Assignments;

import java.util.Scanner;

public class SwitchStatement1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int day = scan.nextInt();

		switch (day) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Day is Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Day is Weekend");
			break;
		default:
			System.out.println("None of the above!");
			break;
		}

	}

}

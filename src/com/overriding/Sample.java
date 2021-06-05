package com.overriding;

import java.util.Scanner;

public class Sample {

	static Shape create() {// Factory Method - method which creates and returns the object
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select your choice");
		int choice = scan.nextInt();

		if (choice == 1) {
			return new Circle();
		}
		if (choice == 2) {
			return new Rectangle();
		}
		if (choice == 3) {
			return new Square();// Annonymous object
		}
		return new Shape();

	}

	public static void main(String[] args) {
		//Sample s = new Sample();
		Shape obj = create();
		obj.draw();
	}

}

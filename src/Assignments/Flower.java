package Assignments;

import java.util.Scanner;

public class Flower {

	static int quantityOfRoses = 20;
	static int quantityOfSunflowers = 30;
	static int quantityOfTulips = 40;

	static int costOfRoses = 100;
	static int costOfSunflower = 200;
	static int costOfTulips = 300;

	static int tempRoseCount;
	static int tempSunflowerCount;
	static int tempTulipCount;

	public static int Menu() {
		System.out.println("Please select the Options..!!");
		System.out.println("1. Show Inventory");
		System.out.println("2. Purchase of flowers");
		System.out.println("3. Exit");
		Scanner scan = new Scanner(System.in);
		int selectionOfMenu = scan.nextInt();
		if (selectionOfMenu > 0 && selectionOfMenu < 3) {
			switch (selectionOfMenu) {
			case 1:
				showInventoryOfAllFlowers();
				break;
			case 2:
				subMenu();
				break;

			case 3:
				System.exit(0);

			}
		}
		return selectionOfMenu;
	}

	public static void subMenu() {
		System.out.println("Select the flower you want to purchase..!!");
		System.out.println("1. Roses");
		System.out.println("2. Sunflowers");
		System.out.println("3. Tulips");
		System.out.println("4. Go to Main Menu");
		Scanner scan = new Scanner(System.in);
		int flowerSelection = scan.nextInt();
		if (flowerSelection == 1) {
			Rose rose = new Rose();
			rose.buyflowers(quantityOfRoses);
		} else if (flowerSelection == 2) {
			Sunflower sunflower = new Sunflower();
			sunflower.buyflowers();
		} else if (flowerSelection == 3) {
			Tulips tulip = new Tulips();
			tulip.buyflowers();
		} else if (flowerSelection == 4) {
			Menu();
		}
	}

	public static void showInventoryOfAllFlowers() {
		System.out.println("Available Roses are: " + quantityOfRoses);
		System.out.println("Available Sunflowers are: " + quantityOfSunflowers);
		System.out.println("Available Tulips are: " + quantityOfTulips);
		contineMenuSelection();
	}

	public static void contineMenuSelection() {
		System.out.println("Do you want to contineu?");
		System.out.println("1 Yes");
		System.out.println("2. No");
		Scanner scan = new Scanner(System.in);
		int selection = scan.nextInt();
		if (selection > 0 && selection <= 2) {
			switch (selection) {
			case 1:
				Menu();
				break;
			case 2:
				System.out.println("Thanks for visiting Ferns and Petals..!!!");
				System.out.println("Your total bill is ");
				break;

			}
		} else {
			System.out.println("Please select correct option..");
			contineMenuSelection();
			scan.close();
		}
	}

	public static void generateBills() {
		System.out.println("Bill for Roses Purchase :" + (tempRoseCount * costOfRoses));
		System.out.println("Bill for Sunflower Purchase :" + (tempSunflowerCount * costOfSunflower));
		System.out.println("Bill for Tulips Purchase :" + (tempTulipCount * costOfTulips));
	}
}

package Assignments;

import java.util.Scanner;

public class FernsAndPetals {

	static int rosesQuantity = 10;
	static int sunflowerQuantity = 5;
	static int tulipsQuantity = 25;

	static int rosesPrice = 10;
	static int sunflowerPrice = 20;
	static int tulipsPrice = 30;

	static int tempRoseCount;
	static int tempSunflowerCount;
	static int tempTulipCount;

	public static void main(String[] args) {
		Menu();
	}

	public static void Menu() {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("!! WELCOME TO FERNS AND PETALS !!");
		System.out.println("Please select your choice..");
		System.out.println("1. Show Inventory");
		System.out.println("2. Purchase");
		System.out.println("3. Exit");

		int selection = scan.nextInt();
		if (selection > 0 && selection <= 4) {
			switch (selection) {
			case 1:
				InventoryOftheFlowers();
				break;
			case 2:
				purchaseOrder();
				break;
			case 3:
				generatebills();
				break;
			case 4:
				System.exit(0);
			}
		}
	}

	private static void purchaseOrder() {
		System.out.println("Please select a flower which you want to buy..");
		System.out.println("1. Roses");
		System.out.println("2. Sunflowers");
		System.out.println("3. Tulips");
		System.out.println("4. Go to Main menu");
		Scanner scan = new Scanner(System.in);
		int subMenuSelection = scan.nextInt();
		if (subMenuSelection > 0 && subMenuSelection <= 4) {
			switch (subMenuSelection) {
			case 1:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Please enter the Roses quatity you want to purchase..");
				int rosesQty = scan1.nextInt();
				if (rosesQty > 0 && rosesQty <= rosesQuantity) {
					System.out.println("You are ordering Roses :" + rosesQty);
					tempRoseCount = tempRoseCount + rosesQty;

				} else {
					System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
				}
				ContinueSelection();
				break;
			case 2:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Please enter the Sunflower quatity you want to purchase..");
				int sunflowerQty = scan2.nextInt();
				if (sunflowerQty > 0 && sunflowerQty <= sunflowerQuantity) {
					System.out.println("You are ordering Sunflowers :" + sunflowerQuantity);
					tempSunflowerCount = tempSunflowerCount+sunflowerQuantity;
					
				} else {
					System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
				}
				ContinueSelection();
				break;
			case 3:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Please enter the Tulips quatity you want to purchase..");
				int tulipsQuantity = scan3.nextInt();
				if (tulipsQuantity > 0 && tulipsQuantity <= tulipsQuantity) {
					System.out.println("You are ordering Tuplis :" + tulipsQuantity);
					tempTulipCount = tempTulipCount+tulipsQuantity;
					
				} else {
					System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
				}
				ContinueSelection();
				break;
			case 4:
				System.out.println("Returning to Main menu");
				Menu();
				break;
			}
		}
	}

	public static void InventoryOftheFlowers() {
		System.out.println("Total Count of the flowers available..");
		System.out.println("Roses available quantity is: " + rosesQuantity);
		System.out.println("Sunflower available quantity is: " + sunflowerQuantity);
		System.out.println("Tulips available quantity is: " + tulipsQuantity);
		ContinueSelection();
	}

	private static void ContinueSelection() {
		System.out.println("Do you want to contine? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		if (option > 0 && option <= 2) {
			switch (option) {
			case 1:
				Menu();
				break;
			case 2:
				System.out.println("Thanks for visiting Ferns and Petals..!!!");
				System.out.println("Your total bill is ");
				generatebills();
				break;

			}
		} else {
			System.out.println("Please select correct option..");
			ContinueSelection();
		}

	}

	private static void generatebills() {
		System.out.println("Bill for Roses Purchase :" + (tempRoseCount * rosesPrice));
		System.out.println("Bill for Sunflower Purchase :" + (tempSunflowerCount * sunflowerPrice));
		System.out.println("Bill for Tulips Purchase :" + (tempTulipCount * tulipsPrice));

	}

}

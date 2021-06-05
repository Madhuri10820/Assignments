package Assignments;

import java.util.Scanner;

public class Sunflower extends Flower{

	public void buyflowers() {
		System.out.println("Enter the Sunflower quantity you want to purchase..!!");
		Scanner scan = new Scanner(System.in);
		int sunflowerQty = scan.nextInt();
		if (sunflowerQty > 0 && sunflowerQty <= quantityOfSunflowers) {
			System.out.println("You are ordering Roses :" + sunflowerQty);
			tempSunflowerCount = tempSunflowerCount + sunflowerQty;
			quantityOfSunflowers = quantityOfSunflowers - tempSunflowerCount;
			System.out.println("After buying Roses current available Roses are: " + quantityOfSunflowers);
			generateBills();
			tempSunflowerCount = 0;
		} else {
			System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
		}
		contineMenuSelection();
	}
}

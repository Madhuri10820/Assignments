package Assignments;

import java.util.Scanner;

public class Tulips extends Flower{

	public void buyflowers() {
		System.out.println("Enter the Tulips quantity you want to purchase..!!");
		Scanner scan = new Scanner(System.in);
		int tulipQty = scan.nextInt();
		if (tulipQty > 0 && tulipQty <= quantityOfTulips) {
			System.out.println("You are ordering Roses :" + tulipQty);
			tempTulipCount = tempTulipCount + tulipQty;
			quantityOfTulips = quantityOfTulips - tempTulipCount;
			System.out.println("After buying Roses current available Roses are: " + quantityOfTulips);
			generateBills();
			tempTulipCount = 0;
		} else {
			System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
		}
		contineMenuSelection();
	}
}

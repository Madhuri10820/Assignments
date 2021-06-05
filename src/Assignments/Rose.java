package Assignments;

import java.util.Scanner;

public class Rose extends Flower {

	

	public void buyflowers(int quantity) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the quantity do you want purchase..");
		int rosesQty = scan.nextInt();
		if (rosesQty > 0 && rosesQty <= quantityOfRoses) {
			System.out.println("You are ordering Roses :" + rosesQty);
			tempRoseCount = tempRoseCount + rosesQty;
			quantityOfRoses = quantityOfRoses - tempRoseCount;
			System.out.println("After buying Roses current available Roses are: " + quantityOfRoses);
			generateBills();
			tempRoseCount = 0;
		} else {
			System.out.println("Please enter the less number of quantity..Currently we do not have stock.");
		}
		contineMenuSelection();
	}
}

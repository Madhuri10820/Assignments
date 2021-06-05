package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberFrequencyCheck {

	public static void main(String args[]) {
		List<Integer> numberList = new ArrayList<>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(1);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(2);
		numberList.add(3);
		numberList.add(5);
		numberList.add(10);
		numberList.add(20);
		
		Collections.sort(numberList);	
		System.out.println("Sorted Arraylist is: " + numberList);
		int temp;
		for (int i = 0; i < numberList.size(); i++) {
			temp = numberList.get(i);
			int count = 1;
			for (int j = i + 1; j < numberList.size(); j++) {
				if (numberList.get(i) == numberList.get(j) && temp == numberList.get(i)) {
					count++;
				}
			}
			System.out.println("Frequency of the " + numberList.get(i) + " is : " + count);
		}
		/*
		 * int visitedArr[] = new int[numberList.size()]; int visited = -1; // If
		 * element visited then we make it as -1
		 * 
		 * for (int i = 0; i < numberList.size(); i++) { int count = 1; for (int j = i +
		 * 1; j < numberList.size(); j++) { if(numberList.get(i) == numberList.get(j))
		 * {//10 ==20 count++;//2 visitedArr[j] = visited;//0 = -1 } }
		 * 
		 * if(visitedArr[i] != visited) { visitedArr[i] = count; } }
		 * 
		 * for(int i = 0; i< visitedArr.length;i++) { if(visitedArr[i] != visited) {
		 * System.out.println("Frequency of " + numberList.get(i) + " : " +
		 * visitedArr[i]); } }
		 */
	}

}

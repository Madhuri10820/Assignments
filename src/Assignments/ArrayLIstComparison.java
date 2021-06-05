package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLIstComparison {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		System.out.println("List 1 is: " + list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(20);
		list2.add(10);

		System.out.println("List 2 is: " + list2);

		// sorting of arraylist 2
		Collections.sort(list2);
		System.out.println("Sorted arraylist is : " + list2);

		boolean comparison = list1.equals(list2);
		System.out.println("2 list are equal :" + comparison);

		list2.add(60);

		boolean comparison1 = list1.equals(list2);
		System.out.println("2 list are equal :" + comparison1);

	}

}

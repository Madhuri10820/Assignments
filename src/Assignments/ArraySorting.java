package Assignments;
//Assignment 12
public class ArraySorting {

	public static void main(String[] args) {

		int array[] = { 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				count++;
		}
		System.out.println("Count of 0 is :" + count);
		
		for (int i = 0; i < count; i++) {
				array[i] = 0;
		}
		 
		for (int i = count; i < array.length; i++) {
			array[i] = 1;
	}

		System.out.print("Array after sorting ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " "); 
	}
}

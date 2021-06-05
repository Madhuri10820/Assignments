package com.String;

import java.util.Scanner;

public class CountOccurancesOfCharachters {

	public static void main(String[] args) {
		String s;
		int ch, c;
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		s = scan.next();
		System.out.println("Enter a Char");
		ch = scan.next().charAt(0);
		scan.close();

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (ch == c) {
				count++;
			}

		}
		System.out.println(ch + "occures " + count + " times" + s);

	}

}

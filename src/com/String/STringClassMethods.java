package com.String;

public class STringClassMethods {

	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2= "Hello How Are you?";
		String str3 = "Bad-Luck";
		
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf("l"));
		System.out.println(str2.contains("Are"));
		System.out.println(str1.length());
		System.out.println(str2.substring(6));
		System.out.println(str2.substring(7,9));
		System.out.println(str1.startsWith("We"));
		System.out.println(str2.endsWith("you?"));
		System.out.println(str3.replace("Bad", "Good"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

	}

}

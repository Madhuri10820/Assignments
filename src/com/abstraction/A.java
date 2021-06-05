package com.abstraction;

abstract public class A {

	static int a;

	A() {
		a = 20;
		System.out.println("A constructor called");
	}

	void m1() {
		System.out.println("m1 method called");
	}

	static void m2() {
		System.out.println("m2 methos called");
	}

	abstract void m3();
	
	public static void main(String[] args) {
		m2();
		System.out.println(a);
	}

}

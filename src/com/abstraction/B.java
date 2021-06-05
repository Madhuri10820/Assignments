package com.abstraction;

public class B extends A{

	B() {
		super();
		System.out.println("B constructor called");
	}

	void m1() {
		System.out.println("m1 method override");
	}

	void m3() {
		System.out.println("m3 called from B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m3();
		m2();
		
	}

}

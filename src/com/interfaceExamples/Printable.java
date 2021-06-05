package com.interfaceExamples;
//final->data member->constant->mandatory to initialize->at the time of declaration/constructor
//final->method->cannot be overriden
//final->class->cannot be extended


public interface Printable {
	int data = 10;// public static final by default

	void Print();// public abstract // Should have to override

	default void m1() {// may or may not be overridden
		System.out.println("M1 calling from Printable");
	}

	static void m2() {// Cn not be overridden
		System.out.println("m2 calling from Printable");
	}
}

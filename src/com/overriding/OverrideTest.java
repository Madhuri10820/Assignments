package com.overriding;

class Shape {
	void draw() {
		System.out.println("No Shape Drawing..!!");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle..!!");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle..!!");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing Square..!!");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Shape s;// s=null
		s = new Shape(); // Actual object creation
		s.draw();
		s = new Circle();// Upcasting
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Square();
		s.draw();
	}

}

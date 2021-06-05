package com.abstraction;

abstract class Shape {

	abstract void draw();
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Traingle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Traingle");
	}

}

class LowerTraingle extends Traingle {

	@Override
	void draw() {
		System.out.println("Drwaing Lower Traingle");

	}

}

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle();
		Traingle t = new Traingle();
		LowerTraingle l = new LowerTraingle();
		c.draw();
		l.draw();
		t.draw();
	}

}

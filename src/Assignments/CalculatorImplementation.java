package Assignments;

public class CalculatorImplementation {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Methods calling from Parent class..");
		System.out.println("");
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.multiplication();
		calculator.modulus();

		
		System.out.println("");
		System.out.println("Methods calling from Child class using Inheritance..");
		System.out.println("");
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		scientificCalculator.getSinOfNumber();
		scientificCalculator.getCosOfNumber();
		scientificCalculator.addition();
		scientificCalculator.subtraction();
		scientificCalculator.multiplication();
		scientificCalculator.multiplication();
		scientificCalculator.modulus();

	}

}

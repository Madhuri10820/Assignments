package com.interfaceExamples;

public class Sample implements Printable,Showable{

	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.Print();
		System.out.println(Printable.data);
		System.out.println(Showable.data);
		s.Show();
		s.m1();
		Printable.m2();
	}

	@Override
	public void Print() {
		System.out.println("Print from Sample");
		//System.out.println(data);
		
	}

	@Override
	public void Show() {
		System.out.println("Show from Sample ");
		
	}

}

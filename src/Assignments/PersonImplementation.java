package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonImplementation {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.fileReading();
		System.out.println("Json file values are: " + p.toString());
		}
	
	

}
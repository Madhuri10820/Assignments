package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Person {
	
	String name;
	int age;
	String contact;
	String address;
	String emp_Id;
	String salary;
	String height;
	String weight;
	
	public String toString() {
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return name + " " + contact + " " + age + " " + address + " " + emp_Id + " " + salary + " " + height + " " + weight;
	}
	
	public void fileReading() throws IOException {
		FileReader fr = new FileReader("D:\\API class Stuff\\Test\\sample.json");
		BufferedReader reader = new BufferedReader(fr);
		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			
			if(line.contains("name")) {
				String[] value = line.split(":");
				name = value[1];
				//System.out.println("name is : " + p.name);
			}
			
			if(line.contains("contact")) {
				String[] value = line.split(":");
				contact = value[1];
				//System.out.println("contact is : " + p.contact);
			}
			
			if(line.contains("age")) {
				String[] value = line.split(":");
				int ageValue = Integer.parseInt(value[1].trim());
				age = ageValue;
				//System.out.println("age is : " + p.age);
			}
			
			if(line.contains("address")) {
				String[] value = line.split(":");
				address = value[1];
				//System.out.println("address is : " + p.address);
			}
			
			if(line.contains("emp_Id")) {
				String[] value = line.split(":");
				emp_Id = value[1];
				//System.out.println("emp_Id is : " + p.emp_Id);
			}
			
			if(line.contains("salary")) {
				String[] value = line.split(":");
				salary = value[1];
				//System.out.println("salary is : " + p.salary);
			}
			
			if(line.contains("height")) {
				String[] value = line.split(":");
				height = value[1];
				//System.out.println("height is : " + p.height);
			}
			
			if(line.contains("weight")) {
				String[] value = line.split(":");
				weight = value[1];
				//System.out.println("weight is : " + p.weight);
			}
		}
	
	}
}

package Assignments;

import java.util.ArrayList;
import java.util.List;
//Assignment 17
import java.util.Scanner;

public class EmployeeDirectoryImpl extends EmployeeDirectory {

	static List<EmployeeDirectory> emplist = new ArrayList<EmployeeDirectory>();

	public static void menu() {

		System.out.println("1. Add Employee");
		System.out.println("2. Search Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Show/Print all Employee");
		System.out.println("5. Exit");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please select the Option..");
		int option = scan.nextInt();
		if (option > 0 && option < 6) {
			switch (option) {
			case 1:
				AddEmployee();
				break;
			case 2:
				searchEmployee();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				showAllEmployees();
				break;
			case 5:
				System.exit(0);
			}

		}
	}

	private static void AddEmployee() {
		EmployeeDirectory empDirectory = new EmployeeDirectory();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		empDirectory.seteNo(scan.nextInt());
		System.out.println("Enter Employee Name : ");
		empDirectory.setName(scan.next());
		System.out.println("Enter Employee Address : ");
		empDirectory.setAddress(scan.next());
		System.out.println("Enter Employee Age : ");
		empDirectory.setAge(scan.nextInt());
		System.out.println("Enter Employee Gender : ");
		empDirectory.setGender(scan.next());
		emplist.add(empDirectory);
		System.out.println(emplist);
	
		System.out.println("Do you want to Contineu?");
		System.out.println("1. YES");
		System.out.println("2. NO");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			AddEmployee();
			break;
		case 2:
			menu();
			break;
		}
		scan.close();
	}

	private static void showAllEmployees() {
		// TODO Auto-generated method stub

	}

	private static void deleteEmployee() {
		// TODO Auto-generated method stub

	}

	private static void searchEmployee() {
		EmployeeDirectory employee = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Employee Id to search the details..");
		int empId = scan.nextInt();
		for(EmployeeDirectory emp : emplist) {
			if(emp.geteNo() == empId) {
				employee = emp;
			}
		}

	}

	public static void main(String[] args) {
		menu();
	}

}

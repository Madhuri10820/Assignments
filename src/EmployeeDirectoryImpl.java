
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDirectoryImpl {

	static List<Employee> empList = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		
		int choice, choice2, choice3;
		
		Scanner scanner = new Scanner(System.in);
		
		while((choice = menu(scanner)) < 5) {
			System.out.println("Choice >>> "+ choice);
			
			switch(choice) {
				case 1:
					empList.add(add(scanner));
					break;
				case 2:
					System.out.println("Please enter Employee No : ");
					choice3 = scanner.nextInt();
					if(search(choice3) != null) {
						System.out.println(search(choice3).toString());
					} else {
						System.out.println("Record not found");
					}
					
					break;
				case 3:
					System.out.println("Please enter Employee No : ");
					choice2 = scanner.nextInt();
					if(search(choice2) != null) {
						System.out.println(search(choice2).toString()+" will be deleted");
						empList.remove(search(choice2));
					} else {
						System.out.println("Record not found");
					}
					break;
				case 4:
					print();
					break;
				default:
					System.out.println("Please try again");
					break;
			}
		}
		
		scanner.close();
	}
	
		
	private static int menu(Scanner scanner) {
		System.out.println("1. Add Employee ") ;
		System.out.println("2. Search Employee ") ;
		System.out.println("3. Delete Employee ") ;
		System.out.println("4. Show All employees ") ;
		System.out.println("5. Exit ") ;
		
		System.out.println("Enter your choice ") ;
		
		int  number = scanner.nextInt();
		
		return number;
	}
	
	
	private static Employee add(Scanner scanner) {
		Employee employee = new Employee();
		
		for(int i = 0; i < 5; i++) {
			if(i==0) {
				System.out.println("Please enter Employee No : ");
				employee.setEno(scanner.nextInt());
			} else if(i==1) {
				System.out.println("Please enter Employee Name : ");
				employee.setName(scanner.next());
			} else if(i==2) {
				System.out.println("Please enter Employee Address : ");
				employee.setAddress(scanner.next());
			} else if(i==3) {
				System.out.println("Please enter Employee Age : ");
				employee.setAge(scanner.nextInt());
			} else if(i==4) {
				System.out.println("Please enter Employee Gender : ");
				employee.setGender(scanner.next());
			} else {
				System.out.println("Please try again");
			}
		}
		return employee;
	}
	
	private static Employee search(int number) {
		Employee employee = null;
		
		if(empList != null && !empList.isEmpty() && empList.size() > 0) {
			for(Employee emp : empList){
				if(emp.getEno() == number) {
					employee = emp;
				}
			}
		}
		return employee;
	}
	
	private static void print() {
		if(empList != null && !empList.isEmpty() && empList.size() > 0) {
			System.out.println("List Contains Following Records: ");
			for(Employee emp : empList){
				System.out.println(emp.toString());
			}
		}
	}
}

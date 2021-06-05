package Assignments;

public class EmployeeImplementation {
	static Manager manager;				
	public static void main(String[] args) {
		
		manager = new Manager();
		manager.setEmpId(101);
		manager.setEmpName("abc");
		manager.setManagerId(10001);
		manager.setManagerName("xyz");
		manager.setManagerRefId(50001);
		displayEmployeesAndManagersDetails();
		System.out.println("");
		
		manager.setEmpId(102);
		manager.setEmpName("efg");
		manager.setManagerId(10002);
		manager.setManagerName("lmn");
		manager.setManagerRefId(50002);
		displayEmployeesAndManagersDetails();
		System.out.println("");
		
		manager.setEmpId(103);
		manager.setEmpName("hij");
		manager.setManagerId(10003);
		manager.setManagerName("opq");
		manager.setManagerRefId(50003);
		displayEmployeesAndManagersDetails();
		System.out.println("");
		
		manager.setEmpId(104);
		manager.setEmpName("klm");
		manager.setManagerId(10004);
		manager.setManagerName("rst");
		manager.setManagerRefId(50004);
		displayEmployeesAndManagersDetails();
		System.out.println("");
		
		manager.setEmpId(105);
		manager.setEmpName("nop");
		manager.setManagerId(10005);
		manager.setManagerName("uvw");
		manager.setManagerRefId(50005);
		displayEmployeesAndManagersDetails();
		System.out.println("");
	}
	
	public static void displayEmployeesAndManagersDetails() {
		System.out.println("Multiple Emloyees and Managers details are: ");
		System.out.println(manager.getEmpId());
		System.out.println(manager.getEmpName());
		System.out.println(manager.getManagerId());
		System.out.println(manager.getManagerName());
		System.out.println(manager.getManagerRefId());
	}

}

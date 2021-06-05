package Assignments;
//Assignment 11
public class Manager extends Employee {
	int managerID;
	String managerName;
	int employeeRepoteeId;

	
	public Manager() {
		super();
	}
	
	public int getManagerId() {
		return managerID;
	}
	
	public void setManagerId(int managerID) {
		this.managerID = managerID;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public int getManagerRefId() {
		return employeeRepoteeId;
	}
	
	public void setManagerRefId(int employeeRepoteeId) {
		this.employeeRepoteeId = employeeRepoteeId;
	}
	
}

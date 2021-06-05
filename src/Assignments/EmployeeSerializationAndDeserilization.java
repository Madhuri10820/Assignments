package Assignments;

public class EmployeeSerializationAndDeserilization {
	String name;
	String contact;
	String age;
	String address;
	String emp_Id;
	String salary;
	String height;
	String weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "EmployeeSerializationAndDeserilization [name=" + name + ", contact=" + contact + ", age=" + age
				+ ", address=" + address + ", salary=" + salary + ", height=" + height + ", weight=" + weight + "]";
	}

}
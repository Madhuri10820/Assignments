package Assignments;
//Assignment 17

public class EmployeeDirectory {
	int eNo;
	String name;
	String address;
	int age;
	String gender;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "EmployeeDirectory [eNo=" + eNo + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

package Assignments;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationAndDeserializationEx {

	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();

		EmployeeSerializationAndDeserilization e = new EmployeeSerializationAndDeserilization();
		e.setName("abc");
		e.setContact("1234567890");
		e.setAge("34");
		e.setAddress("Pune");
		e.setEmp_Id("123");
		e.setSalary("324234");
		e.setHeight("5.4");
		e.setWeight("54");
		
		String empJson = mapper.writeValueAsString(e);
		//System.out.println(empJson);
		
		EmployeeSerializationAndDeserilization emp = mapper.readValue(new File("D:\\\\API class Stuff\\\\Test\\\\sample.json"), EmployeeSerializationAndDeserilization.class);
		
		System.out.println(emp);
		

	}

}

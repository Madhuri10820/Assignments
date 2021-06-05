package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
/*		FileReader fr = new FileReader("D:\\API class Stuff\\Test\\Test.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("D:\\API class Stuff\\Test\\FileWriter.txt");
		BufferedWriter writer = new BufferedWriter(fw);
		
		String line = null;
		while((line = reader.readLine()) != null) {
			writer.write(line);
			//writer.write("\n");
			writer.newLine();
			writer.flush();
		}
		reader.close();
		System.out.println("Program Completed");*/
		
		FileUtils.copyFile(new File("D:\\\\API class Stuff\\\\Test\\\\Test.txt"), new File("D:\\\\API class Stuff\\\\Test\\\\FileWriter.txt"));
	}
		
}
 
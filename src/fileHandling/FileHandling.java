package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader("D:\\API class Stuff\\Test\\Test.txt");
		BufferedReader reader = new BufferedReader(fr);
		String line = null;

		if ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

}

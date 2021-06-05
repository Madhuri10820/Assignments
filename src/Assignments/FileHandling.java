package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public void fileReading() throws IOException {
		
		String line = null;
		int noOfWords = 0;
		int numberOfLines = 0;
		int javaWordCount = 0;
		
		FileReader fr = new FileReader("D:\\API class Stuff\\Test\\Input.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		while ((line = reader.readLine()) != null) {
			// No. Of lines in the files
			numberOfLines++;
			System.out.println(line);
			
			// No. of words in the files
			String[] noOfWordsInFile = line.split(" ");
			noOfWords = noOfWords + noOfWordsInFile.length;
											
			

			// Count of the Java word
			if (line.contains("Java")) {
				System.out.println("Line which has Java word: " + line);
				javaWordCount++;
			} else {
				System.out.println("Line which do not have Java word: : " + line);
			}

		}
		System.out.println("Number of words in the file: " + noOfWords);
		System.out.println("No. of lines in the file : " + numberOfLines);
		System.out.println("Count of the Java words in the file : " + javaWordCount);
		reader.close();
	}
}

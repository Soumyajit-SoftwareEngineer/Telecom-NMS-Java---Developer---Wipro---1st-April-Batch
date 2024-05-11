package Java_AdvanceTraining_Day2_Wipro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try {
			FileReader fr = new FileReader("C:\\\\\\\\TELECOM NMS JAVA\\\\\\\\FileWriter.JAVA");
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		while((i = br.read()) != -1) {
			System.out.println((char)i);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException ex) {
			System.out.println("Exception is :" + ex);
		}

	}

}

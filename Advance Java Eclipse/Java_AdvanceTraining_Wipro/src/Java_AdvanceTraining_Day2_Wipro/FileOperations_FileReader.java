package Java_AdvanceTraining_Day2_Wipro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations_FileReader { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader ("C:\\\\TELECOM NMS JAVA\\\\FileWriter.JAVA");
			
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

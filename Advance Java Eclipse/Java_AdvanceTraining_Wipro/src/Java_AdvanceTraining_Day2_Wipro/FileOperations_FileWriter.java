package Java_AdvanceTraining_Day2_Wipro;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperations_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		FileWriter fw = new FileWriter("C:\\TELECOM NMS JAVA");
		
		fw.write("hello, welcome to java..");
		System.out.println("Data writting into a file successfully..");
		
		fw.close();
	}

}
  
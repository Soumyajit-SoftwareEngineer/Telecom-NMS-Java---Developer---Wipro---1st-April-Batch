package Java_AdvanceTraining_Day2_Wipro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("C:\\\\\\\\TELECOM NMS JAVA\\\\\\\\FileWriter.JAVA");
			BufferedWriter buffer  = new BufferedWriter (fw);
			buffer.write("Writing using buffers into a file..");
			System.out.println("Data written into the file successfully using BufferedWriter..");
			buffer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

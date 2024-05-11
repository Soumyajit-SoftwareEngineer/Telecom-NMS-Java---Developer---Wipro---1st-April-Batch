package Java_AdvanceTraining_Day2_Wipro;

import java.io.File;

public class Directory_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String directoryPath = "C:SoumyaPractice.txt";

		//Defining the directory path. 
		File directory = new File (directoryPath);

		//Get all the files from a directory and store in files array.

		File files[] = directory.listFiles();

		//Display all the files in the given directory. 
	 System.out.println("List of file in the directory: "+
		 directoryPath);

		if (files!= null) {
		 for (File file: files)
			 //For each loop.. for (<data type> <Object N System.out.println(file.getName());
			 System.out.println(file.getName());
	}

}
}

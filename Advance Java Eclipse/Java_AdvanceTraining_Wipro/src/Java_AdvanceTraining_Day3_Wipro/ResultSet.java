package Java_AdvanceTraining_Day3_Wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

//Load the driver.

Class.forName ("com.mysql.cj.jdbc.Driver");

//Connect with the database.

Connection con = DriverManager.getConnection
("jdbc:mysql://127.0.0.1:3306/test", "root", "admin"); 
				System.out.println("Connected to the database...");

Statement st = con.createStatement();

java.sql.ResultSet rs = st.executeQuery("SELECT * FROM emp");

System.out.println("List of records in emp table are: ");

 while (rs.next()) {

System.out.print(rs.getString(1)); 
System.out.println(" "+ rs.getInt(2));

con.close();
System.out.println("Closed the database connection successfully...");

 }}
		catch (ClassNotFoundException e) {

} catch (SQLException ex) {

System.out.println(ex); 
	}

   
}

	public static String getInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean next() {
		// TODO Auto-generated method stub
		return false;
	}
}


	

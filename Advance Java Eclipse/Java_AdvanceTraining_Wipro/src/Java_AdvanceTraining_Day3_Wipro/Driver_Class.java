package Java_AdvanceTraining_Day3_Wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		// Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect with the database
		Connection con = DriverManager.getConnection
				("jdbc:mysql://127.0.0.1:3306/test", "root", "admin" );
		System.out.println("Connected to the database....");
		
		Statement st = con.createStatement();
st.executeUpdate("INSERT INTO Employee(name,  Employee_ID) VALUES('Soumyajit',40000)");
		con.close();
	}catch(ClassNotFoundException e) {
		
	}catch (SQLException ex) {
		System.out.println(ex);
	}

}
}

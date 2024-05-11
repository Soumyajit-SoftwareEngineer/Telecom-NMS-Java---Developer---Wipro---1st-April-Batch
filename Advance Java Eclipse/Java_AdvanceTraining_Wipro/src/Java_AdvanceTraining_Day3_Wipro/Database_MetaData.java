package Java_AdvanceTraining_Day3_Wipro;

import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Connection;

public class Database_MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

		//Load the driver.

		Class.forName ("com.mysql.cj.jdbc.Driver");

		//Connect with the database.

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "admin"); 
		System.out.println("Connected to the database...");

		DatabaseMetaData dbMeta = con.getMetaData();

		

		System.out.println("Name of the database: "+dbMeta.getDatabaseProductName()); 
		System.out.println("Name of the driver: "+dbMeta.getDriverName());

		System.out.println("Driver version:" + dbMeta.getDriverVersion());

		System.out.println("Table length name: "+dbMeta.getMaxTableNameLength());

		System.out.println("Maximum number of columns in a table: "+dbMeta.getMaxColumnsInTable());

		con.close();

		System.out.println("Closed the database connection successfully...");

		System.out.println("Closed the database connection successfully...");
		} catch (ClassNotFoundException e) {

		} catch (SQLException ex) {

		System.out.println(ex);

		}



		}
	}



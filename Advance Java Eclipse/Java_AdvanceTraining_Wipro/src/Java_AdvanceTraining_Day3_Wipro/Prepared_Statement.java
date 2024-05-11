package Java_AdvanceTraining_Day3_Wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prepared_Statement {

	private static String strQry;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		//Load the driver.
		Class.forName ("com.mysql.cj.jdbc.Driver");

		//Connect with the database.
		Connection con = DriverManager.getConnection
				("jdbc:mysql://127.0.0.1:3306/test", "root", "admin");
		System.out.println("Connected to the database...");

		String strory = "INSERT INTO emp (name, sal) VALUES (?,?)";
		PreparedStatement ps = con.prepareStatement(strQry);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a name: ");
		String strName = sc.next();
		System.out.println("Enter Salary: ");
		int sal = sc.nextInt();

		ps.setString(1, strName);

		ps.setInt(2, sal);

		ps.executeUpdate();

		System.out.println("Inserted Record in the db Successfully..");

		con.close();

		System.out.println("Closed the database connection successfully...");

		}catch (ClassNotFoundException e) {

		} catch (SQLException ex) { 
			System.out.println(ex);
		}

		}

	}



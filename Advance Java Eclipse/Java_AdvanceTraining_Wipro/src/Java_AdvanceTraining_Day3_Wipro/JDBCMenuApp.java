package Java_AdvanceTraining_Day3_Wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.lang.AutoCloseable;
import java.sql.ResultSet;

public class JDBCMenuApp {
	
	// Database connection details
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test"; // Modify as needed
    private static final String DB_USER = "root"; // Modify as needed
    private static final String DB_PASSWORD = "admin"; // Modify as needed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
            while (!exit) { 
                System.out.println("Menu:");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Display data (Select)");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: (1-5) ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 
                switch (choice) {
                case 1:
                    insertRecord(conn, scanner);
                    break;
                case 2:
                    updateRecord(conn, scanner);
                    break;
                case 3:
                    deleteRecord(conn, scanner);
                    break;
                case 4:
                    displayRecords(conn);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

        scanner.close();
    } catch (SQLException e) {
        System.err.println("Database connection error: " + e.getMessage());
    }
}
	private static void insertRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        String sql = "INSERT INTO your_table (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        }
    }

    private static void updateRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter record ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();

        String sql = "UPDATE your_table SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, newAge);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully.");
        }
    }

    private static void deleteRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter record ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM your_table WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Record deleted successfully.");
        }
    }
    private static void displayRecords(Connection conn) throws SQLException {
        String sql = "SELECT * FROM your_table"; // Replace 'your_table' with your actual table name
        try (Statement stmt = conn.createStatement();
        		ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("ID | Name | Age");
            while (rs.next()) {
            	System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
            }

	}

}
}

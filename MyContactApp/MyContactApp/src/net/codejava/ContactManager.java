package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactManager {

	public static void main(String[] args) {
		String databaseURL = "jdbc:ucanaccess://C:/Users/Student.DESKTOP-D77PGCR/Downloads/MyContactApp/MyContactApp/Contact2016.accdb";

		
		try {
			Connection connection = DriverManager.getConnection(databaseURL);
			
			System.out.println("Connect to MS Access database.");
			
			String sql = "SELECT * FROM Contacts";
			
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			System.out.println("Enter the info for ID, full name, Email, phone");
					
			
			while (result.next()) {
				int id = result.getInt("Contact_ID");
				String fullName = result.getString("Full_Name");
				String email = result.getString("Email");
				String phone = result.getString("Phone");
				
				System.out.println(id + " , " + fullName + ", " + email + ", " + phone);
			}
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

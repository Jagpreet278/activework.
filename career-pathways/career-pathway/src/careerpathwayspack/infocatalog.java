package careerpathwayspack;

import java.sql.ResultSet;

public class infocatalog {

	public static void main(String[] args) {
		String sqlcount = "SELECT COUNT(1) FROM Contacts";
		ResultSet result1 = sqlstate.executeQuery(sqlcount);
		result1.next();
		int numrows = result1.getInt(1);
		System.out.println("Number of rows: " + numrows);
		
		String sqlinfo = "SELECT * FROM Contacts";
		ResultSet result2 = sqlstate.executeQuery(sqlinfo);
		
		while(result2.next())
		{
			id = result2.getInt("ID");
			fullname = result2.getString("Full_Name");
			email = result2.getString("Email");
			phone = result2.getString("Phone");
			System.out.println(id + ", " + fullname + ", " + email + ", " + phone);
		}
		
		conn.close();
		

	}

}

package careerpathpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentinfo {
	public static void main(String[] args) {
		
		System.out.println("Welcom");
		String Table = "Student_Info_TB";
		Quest question = new Quest();
		String databaseURL = "jdbc:ucanaccess://C:/Users/student/Documents/"
				+ "JCareerPathways/CareerPathway/dbCareerPathways.accdb";
		
		try {
		        Connection connection = DriverManager.getConnection(databaseURL);
		        Statement statement = connection.createStatement();
		        System.out.println("Connected to dbCareerPathways database.");
		        try {
		            String SQL = "CREATE TABLE " + Table + " (id COUNTER, PRIMARY KEY(id), "
		                    + "Full_name TEXT, School TEXT, Grade INT, Osis INT, "
		                    + "SSN5 INT, Gender TEXT, Pronoun TEXT, Nickname TEXT, Race TEXT, "
		                    + "GradMonth TEXT, GradYear INT, ELL TEXT, Disability_IEP TEXT, "
		                    + "AllergyYN TEXT, AllergySpec TEXT, Other_language TEXT, "
		                    + "School_Email TEXT, Perm_Email TEXT, "
		                    + "Home_Number INT, Address TEXT, City TEXT, "
		                    + "State TEXT, ZipCode INT, P_G_Full_Name TEXT, P_G_Relationship TEXT,"
		                    + "P_G_Email TEXT, P_G_Home_Number INT, P_G_Work_Number INT,"
		                    + "P_G_Cell_Number INT, EmC_Full_Name TEXT, EmC_Home_Number INT, "
		                    + "EmC_Cell_Number INT, Bank TEXT, Direct_Deposit TEXT, CFM TEXT,"
		                    + "Electronic TEXT, InternetAcc TEXT, InternshipEnvir TEXT)";
		            statement.execute(SQL);
		    } catch (SQLException e) {
		        // Handle SQL-related exceptions
		        
		    }
		} catch (Exception e) {
		    // Handle other exceptions
		    e.printStackTrace();
		}
	}
}


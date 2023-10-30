package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();

		// Step 1: Register the driver
		DriverManager.registerDriver(driver);

		// Step 2: Get Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

		// Step 3: issue create statement
		Statement state = con.createStatement();

		// Step 4: execute a query -- provide table name
		String query = "insert into table empinfo (name,address,id)values('Spiderman','london',5);";
		int result = state.executeUpdate(query);
		if (result == 1) {
			System.out.println("data added successfully");
		}

		// Step 5: close db
		con.close();
	}
}

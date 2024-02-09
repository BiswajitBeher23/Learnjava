package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dbconfig.Myconn;

public class Schemas {

	private static final String createTableSQL = "create table users (\r\n" + "     id  int(3) primary key,\r\n"
			+ "     name varchar(20),\r\n" + "     email varchar(20),\r\n" + "     country varchar(20),\r\n"
			+ "     password varchar(20)\r\n" + "  );";

	private static final String INSERT_MULTIPLE_USERS_SQL = "INSERT INTO Users "
			+ "VALUES (1, 'Pramod', 'pramod@gmail.com', 'India', '123'),"
			+ "(2, 'Deepa', 'deepa@gmail.com', 'India', '123')," + 
			"(3, 'Tom', 'top@gmail.com', 'India', '123');";
	
	
	//Table creation
	public boolean createTable() throws SQLException {

		// System.out.println(createTableSQL);

		try (Connection dbcon = Myconn.createConnection();

				Statement stmt = dbcon.createStatement();) {

			stmt.execute(createTableSQL);

		} catch (SQLException e) {
			// TODO: handle exception
			e.toString();
		}
		return false;
	}
	
	//Insert records
	public void insertRecords() throws SQLException {
		
		
	}

}


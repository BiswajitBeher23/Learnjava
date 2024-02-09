package app;

import java.sql.Connection;
import java.sql.SQLException;

import dbconfig.Myconn;

public class Main {

	public static void main(String[] args) throws SQLException {

		@SuppressWarnings("unused")
		Connection connection = Myconn.createConnection();
		System.out.println("Database successfully connected");

		// create a table
		try {
			Schemas schemasexp = new Schemas();

			if (schemasexp.createTable()) {
				System.out.println("Table created successfully");
			} else {
				System.out.println("Table name already exist");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void printSQLException(SQLException ex)
	
	{
		for(Throwable e : ex){
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t=ex.getCause();
				while(t != null){
					System.out.println("cause: "+t);
					t = t.getCause();
				}
			} 
		}
	}
}

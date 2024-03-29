package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import dbconfig.Myconn;

class Main extends Myconn {

	public static void main(String[] args) throws SQLException {

		@SuppressWarnings("unused")
		Connection connection = Myconn.createConnection();
		System.out.println("Database successfully connected");

		// create a table
		/*
		 * try { Schemas schemasexp = new Schemas();
		 * 
		 * if (schemasexp.createTable()) {
		 * System.out.println("Table created successfully"); } else {
		 * System.out.println("Table name already exist"); }
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */
		Schemas obj = new Schemas();
		try (Scanner rd = new Scanner(System.in)) {
			obj.readSuser(rd.nextInt(), rd.next());
		} catch (SQLException e) {
			// TODO: handle exception
			printSQLException(e);
		}
		// Insert records
		// obj.recinsert();
		// obj.read();
		// obj.updateRecords();
		// obj.deleteRecord();

	}

	public static void printSQLException(SQLException ex)

	{
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}

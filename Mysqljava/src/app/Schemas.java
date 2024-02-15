package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dbconfig.Myconn;

public class Schemas extends Myconn {

	private static String createTableSQL = "create table users (\r\n" + "     id  int(3) primary key,\r\n"
			+ "     name varchar(20),\r\n" + "     email varchar(20),\r\n" + "     country varchar(20),\r\n"
			+ "     password varchar(20)\r\n" + "  );";

	private static String INSERT_MULTIPLE_USERS_SQL = "INSERT INTO Users "
			+ "VALUES (7, 'Damodar', 'damo@gmail.com', 'India', '123'),"
			+ "(8, 'Joash', 'joash@gmail.com', 'India', '123')," + "(9, 'Dibya', 'dibya@gmail.com', 'India', '123');";

	// Table creation
	/*
	 * public boolean createTable() throws SQLException {
	 * 
	 * // System.out.println(createTableSQL);
	 * 
	 * try (Connection dbcon = Myconn.createConnection();
	 * 
	 * Statement stmt = dbcon.createStatement();) {
	 * 
	 * stmt.execute(createTableSQL); } catch (SQLException e) { // TODO: handle
	 * exception e.toString(); } return false; }
	 */

	// Insert records
	public boolean insertRecords() throws SQLException {

		try (Connection dbconn = Myconn.createConnection(); Statement stmt2 = dbconn.createStatement();) {
			stmt2.execute(INSERT_MULTIPLE_USERS_SQL);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}

}

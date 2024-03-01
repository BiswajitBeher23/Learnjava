package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


import dbconfig.Myconn;

class Schemas extends Myconn {

	protected static String createTableSQL = "create table users (\r\n" + "     id  int(3) primary key,\r\n"
			+ "     name varchar(20),\r\n" + "     email varchar(20),\r\n" + "     country varchar(20),\r\n"
			+ "     password varchar(20)\r\n" + "  );";

	protected static String INSERT_MULTIPLE_USERS_SQL = "INSERT INTO Users "
			+ "VALUES (10, 'Biswajit', 'biswa@gmail.com', 'India', '123'),"
			+ "(11, 'prasenjit', 'prasen@gmail.com', 'India', '123'),"
			+ "(12, 'Soumya', 'somu@gmail.com', 'India', '123');";
	protected static String READUSERS_data = "select * from users; ";
	protected static String select_userbyid = "select * from users where id = ? or name = ? ;";
	protected static String FINDUSER = "select * from users where id = ?;";
	protected static String UPDATE_USERS_DATA = "update users set name = ? where id = ?;";
	protected static String DELETE_USERS_DATA = "delete from users where id = ?;";

	// Table creation
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

	// Insert records
	public void recinsert() throws SQLException {
		try (Connection conn = Myconn.createConnection(); Statement stm = conn.createStatement();) {
			int result = stm.executeUpdate(INSERT_MULTIPLE_USERS_SQL);
			System.out.println("number of records " + result);

		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	// Read records
	public void read() throws SQLException {
		try (Connection conn = Myconn.createConnection();
		    Statement stm = conn.createStatement()) {

			ResultSet res = stm.executeQuery(READUSERS_data);
			while (res.next()) {
				int id = res.getInt("id");
				String Fullname = res.getString("name");
				String Email = res.getString("email");
				String country = res.getString("country");
				String password = res.getString("password");
				System.out.println(
						id + "\r\n" + Fullname + "\r\n" + Email + "\r\n" + country + "\r\n" + password + "\r\n");

			}
		} catch (SQLException e) { // TODO: handle exception printSQLException(e);
		}
	}

	//Read single user
	void readSuser(int i, String string) throws SQLException {
		try (Connection conn = Myconn.createConnection();
				PreparedStatement stm = conn.prepareStatement(select_userbyid);) {

			stm.setInt(1, i);
			stm.setString(2, string);

			System.out.println(stm);

			ResultSet res = stm.executeQuery();

			while (res.next()) {

				int id = res.getInt("id");
				String Fullname = res.getString("name");
				String Email = res.getString("email");
				String country = res.getString("country");
				String password = res.getString("password");
				System.out.println(
						id + "\r\n" + Fullname + "\r\n" + Email + "\r\n" + country + "\r\n" + password + "\r\n");

			}
		} catch (SQLException e) {
			// TODO: handle exception
			printSQLException(e);
		}
	}

	// Update records
	public boolean updateRecords() throws SQLException {
		try (Connection conn = Myconn.createConnection();
				PreparedStatement stm2 = conn.prepareStatement(UPDATE_USERS_DATA);
				PreparedStatement readuser = conn.prepareStatement(select_userbyid);) {

			readuser.setInt(1, 3);
			readuser.setString(2, "");
			stm2.setString(1, "Biswajit");
			stm2.setInt(2, 3);

			ResultSet rd = readuser.executeQuery();

			if (rd.next()) {
				stm2.executeUpdate();
				System.out.println("success");
			} else {
				System.out.println("No record found");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			printSQLException(e);
		}
		return false;
	}

	// Delete Records
	public boolean deleteRecord() throws SQLException {

		try (Connection conn = Myconn.createConnection();
				PreparedStatement readuser = conn.prepareStatement(select_userbyid);
				PreparedStatement deleteuser = conn.prepareStatement(DELETE_USERS_DATA);) {

			readuser.setInt(1, 12);
			readuser.setString(2, "");
			deleteuser.setInt(1, 12);

			ResultSet rd = readuser.executeQuery();

			if (rd.next()) {
				deleteuser.executeUpdate();
				System.out.println("Success");
			} else {
				System.out.println("No record found");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			printSQLException(e);
		}
		return false;
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
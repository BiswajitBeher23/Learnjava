package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconn {

	private static String jdbcurl = "jdbc:mysql://localhost:3306/college";
	private static String username = "root";
	private static String pass = "Biswa2024";
 
	public static Connection createConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection(jdbcurl, username, pass);
		//if(conn == null) {
			//System.out.println("unable to connect to database");
		//}else {
			//System.out.println("successfully connected");
		//}
		return conn;
		
	}
}

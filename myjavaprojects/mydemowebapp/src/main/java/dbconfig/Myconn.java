package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconn {
	private static final String jdbcurl = "jdbc:mysql://localhost:3306/tipudb?useSSL=false&allowPublicKeyRetrieval=true";
	private static final String username = "root";
	private static final String pass = "Biswa2024";
	
	protected static Connection createConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
	       System.out.println("Driver not found");
		}
		
		Connection conn = DriverManager.getConnection(jdbcurl, username, pass);
		/*
		 * if(conn == null) { System.out.println("unable to connect to database"); }else
		 * { System.out.println("successfully connected"); }
		 */
		return conn;
	}
}

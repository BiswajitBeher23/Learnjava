package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Webcontent;
import dbconfig.Myconn;

public class Webdao extends Myconn {
	
	private static final String HERO_DATA= "select id, home_title, home_para from webcontent where id = 1;";
	
	
	public Webdao() {
				
	}

	public List<Webcontent> HomePage(){
		
		List<Webcontent> contents = new ArrayList<>();
		
		try(Connection conn = createConnection();
				PreparedStatement pst = conn.prepareStatement(HERO_DATA);){
			
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String home_title = rs.getString("home_title");
				String home_para = rs.getString("home_para");
				contents.add(new Webcontent(id, home_title, home_para));
			}
		} catch(SQLException e) {
			printSQLException(e);
		}
		return contents;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}

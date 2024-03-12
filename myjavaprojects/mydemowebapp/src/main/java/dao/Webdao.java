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
	
	private static final String HERO_DATA= "select * from webcontent;";
	
	
	public Webdao() {
				
	}

	public List<Webcontent> HomePage(){
		
		List<Webcontent> contents = new ArrayList<>();
		
		try(Connection conn = createConnection();
				PreparedStatement pst = conn.prepareStatement(HERO_DATA);){
			
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String feature_title= rs.getString("feature_title");
				String feature_para = rs.getString("feature_para");
				String faq_question= rs.getString("faq_question");
				String faq_answer= rs.getString("faq_answer");
				String about_title= rs.getString("about_title");
				String aboutus_desc= rs.getString("aboutus_desc");
				String home_title= rs.getString("home_title");
				String home_para= rs.getString("home_para");
				contents.add(new Webcontent(id, feature_title, feature_para, faq_question, faq_answer, about_title, aboutus_desc, home_title, home_para));
			//System.out.println(id+ "" + feature_title + "" + feature_para +""+ faq_question +""+faq_answer+""+about_title+""+aboutus_desc +""+home_title+""+home_para);
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

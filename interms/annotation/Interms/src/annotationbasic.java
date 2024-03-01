
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class annotationbasic {

    private static final String jdbcurl = "jdbc:mysql://localhost:3306/tipudb";
    private static final String username = "root";
    private static final String pass = "Biswa2024";

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcurl, username, pass);
            if(conn == null){
                System.out.println("Database connection failed");
            } else {
                System.out.println("Database connection success");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

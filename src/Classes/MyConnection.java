package Classes;
import java.sql.DriverManager;

public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/PR1";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "Chau.2608";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

}
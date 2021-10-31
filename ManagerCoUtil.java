import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ManagerCoUtil {

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try (FileInputStream f = new FileInputStream("C:\\Users\\Bruker\\IdeaProjects\\DataMan project\\src\\db.properties")) {

            // load the properties file
            Properties pros = new Properties();
            pros.load(f);

            // assign db parameters
            String url = pros.getProperty("urlMan");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");

            // create a connection to the database
            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException |SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    public static void main(String[]args){
        System.out.println("Hello World");
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Create {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
            String user = "suthagar";
            String password = "luffy2";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 Statement s=connection.createStatement(); )
            {
                String s1="CREATE TABLE Book1"+
                        "(id INTEGER not NULL,"+
                        "title VARCHAR(255),"+
                        "authur VARCHAR(255))";
                s.executeUpdate(s1);
                System.out.println("Created table in given database...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }





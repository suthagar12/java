
import java.sql.*;
import java.util.Scanner;
public class Retrive {
        public static void main(String[] args) {
            String url ="jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
            String user = "suthagar";
            String password = "luffy2";
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the authur  you wanted to search: ");
            String a = sc.nextLine();
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement("select * from Book1 where authur = ?");
                statement.setString(1, a);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()){
                    System.out.println("The title is "+resultSet.getString("title"));
                }
            } catch (SQLException e) {
                System.out.println("The title not found Please try available authur"+e);
            }
        }
    }


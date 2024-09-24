import java.sql.*;
import java.util.Scanner;
public class Whole {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
        String user = "suthagar";
        String password = "luffy2";
        String query ="select * from Book1 where title = ?";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title name you wanted to search: ");
        String title = sc.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, title);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("id\t\ttitle\t\tauthur");
            while (resultSet.next()){
                int id  = resultSet.getInt(1);
                String authur = resultSet.getString(3);
                System.out.println(id+"\t\t"+title+"\t\t"+authur);

            }
        } catch (SQLException e) {
            System.out.println("The authur not found Please try available title"+e);
        }
    }
}
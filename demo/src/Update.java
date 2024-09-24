import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Update {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
        String user = "suthagar";
        String password = "luffy2";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id of record you wanted to update: ");
        int id =scanner.nextInt();
        System.out.print("Enter the title: ");
        String title =scanner.next();
        System.out.print("Enter the authur: ");
        String authur =scanner.next();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String updateQuery = "update Book1 set  authur =?,title=?  where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, authur);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
            System.out.println("Record updated Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
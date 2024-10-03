import java.sql.*;
import java.util.Scanner;
    public class Delete {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
            String user = "suthagar";
            String password = "luffy2";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the record you wanted to delete:");
            int bookId =scanner.nextInt();
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String deleteQuery = "delete from book where id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
                System.out.println("Record Deleted Successfully");
                preparedStatement.setInt(1,bookId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("no record deleted");
            }
        }

    }


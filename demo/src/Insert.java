import java.sql.*;
public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
        String user = "suthagar";
        String password = "luffy2";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            String insertElement="insert into Book1 values " +
                    "(1,'luffy','dragon')," +
                    "(2,'chopper','doctreen')," +
                    "(3,'zoro','sanji')";
            statement.execute(insertElement);
            System.out.println("Record inserted Successfully ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.sql.*;
public class Count {
    public static void main(String[] args) {
        String url ="jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
        String user = "suthagar";
        String password = "luffy2";
        String countElement ="select count (*) As count from Book1";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery(countElement);
            resultSet.next();
            System.out.println("  we have "+resultSet.getInt("count")+" records");
        } catch (SQLException e) {
            System.out.println("no record");
        }
    }
}

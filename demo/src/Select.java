import java.sql.*;
public class Select {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
            String user = "suthagar";
            String password = "luffy2";
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement =connection.createStatement();
                String query ="select * from Book1 ";
                ResultSet resultSet = statement.executeQuery(query);
                System.out.println("id\t\ttitle\t\tauthur");
                while (resultSet.next()){
                    int id  = resultSet.getInt(1);
                    String title= resultSet.getString(2);
                    String authur = resultSet.getString(3);
                    System.out.println(id+"\t\t"+title+"\t\t"+authur);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


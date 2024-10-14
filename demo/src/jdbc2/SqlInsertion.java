package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SqlInsertion {
    public static void main(String[] args) {
        String url =  "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=intern_Su;encrypt=true;trustServerCertificate=true";
        String user = "suthagar";
        String password = "luffy2";
//        String createQuery= "CREATE TABLE CCEmployeess(EmployeeId VARCHAR(50) PRIMARY KEY NOT NULL," +
//                "FirstName VARCHAR(50) NOT NULL," +
//                " LastName VARCHAR(50) NOT NULL," +
//                " MiddleName VARCHAR(50)," +
//                " DateofBirth VARCHAR(50) ," +
//                " Gender VARCHAR(50) ," +
//                " EmailAddress VARCHAR(50) ," +
//                " PhoneNumber VARCHAR(50) ," +
//                " Address VARCHAR(50)," +
//                "  jobtitle VARCHAR(50) ," +
//                " department VARCHAR(50)," +
//                "  managerID VARCHAR(50)," +
//                "  dateofjoining VARCHAR(50)," +
//                "employmentstatus VARCHAR(50), " +
//                "salary VARCHAR(50) ," +
//                " worklocation VARCHAR(50)," +
//                "employmenteligibilityverification VARCHAR(50),"+
//                "backgroundcheckstatus VARCHAR(50),"+
//                "pannumber VARCHAR(50) UNIQUE NOT NULL," +
//                " aadhaarnumber VARCHAR(50) UNIQUE NOT NULL," +
//                " BankAccountDetails VARCHAR(50) UNIQUE NOT NULL,"+
//                " emergencycontact VARCHAR(50) ," +
//                " skills VARCHAR(50) , " +
//                "education VARCHAR(50)," +
//                "certifications VARCHAR(50)," +
//                ")";
//String insert ="insert into CCEmployeess values('4'," +
//        "'suthagar'," +
//        "'S'," +
//        "''," +
//        "'28-09-2003'," +
//        "'male'," +
//        "'ssuthagar277@gmail.com'," +
//        "'8870541159'," +
//        "'ramanatham'," +
//        "'trainee'," +
//        "'cse'," +
//        "'14'," +
//        "'28-09-2024'," +
//        "'trainee'," +
//        "'15000'," +
//        "'madavakkam'," +
//        "'12th pass'," +
//        "'poor'," +
//        "'0766'," +
//        "'9866'," +
//        "'56478'," +
//        "'8098230973'," +
//        "'java'," +
//        "'college'," +
//        "'degree')";

        String add="alter table CCEmployeess add height VARCHAR(50)";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement= connection.createStatement();
            statement.executeUpdate(add);
            System.out.println("new column Successfully. ");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

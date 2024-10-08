package jdbc2;

public class CCEmployee {
    public String employeeId;
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String gender;
    public String emailAddress;
    public String phoneNumber;
    public Address address;
    public CCEmployee(String EmployeeID,
                     String FirstName,
                     String LastName,
                     String MiddleName,
                     String DateofBirth,
                     String Gender,
                     String EmailAddress,
                     String PhoneNumber,
                     Address Address){
        this.employeeId =EmployeeID;
        this.firstName =FirstName;
        this.lastName =LastName;
        this.middleName =MiddleName;
        this.dateOfBirth =DateofBirth;
        this.gender =Gender;
        this.phoneNumber =PhoneNumber;
        this.address =Address;
        this.emailAddress =EmailAddress;
    }

    // @Override
    public String toString(){
        return "EmployeeID: "+ employeeId
                +"\nFirstname :"+ firstName +
                "\nlastname :"+ lastName +
                "\nmiddlename :"+ middleName +
                "\ndateofbirth :"+ dateOfBirth +
                "\ngender :"+ gender +
                "\nphonenumber :"+ phoneNumber +
                "\naddress :"+ address +
                "\nemailaddress :"+ emailAddress;
    }

    public static void main(String[] args) {
        Address d=new Address("japan","thailand","tokyo","london","egypt","606303");
        CCEmployee e=new CCEmployee("1234",
                "luffy",
                "monkey",
                "d",
                "28-9-2003",
                "male",
                "luffy@gmail.com",
                "8870541159",
                d
        );
        System.out.println(e);
    }

}

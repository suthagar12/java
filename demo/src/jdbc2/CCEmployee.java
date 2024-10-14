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
    public String jobtitle;
    public String department;
    public String managerID;
    public String dateofjoining;
    public String employmentstatus;
    public int salary;
    public String worklocation;
    private String pannumber;
    private String aadhaarnumber;
    private String bankaccountdetails;
    public String employmenteligibilityverification;
    public String backgroundcheckstatus;
    public String emergencycontact;
    public String skills;
    public String education;
    public String certifications;
    public String performancereviews;

    public CCEmployee(String EmployeeID,
                      String FirstName,
                      String LastName,
                      String MiddleName,
                      String DateofBirth,
                      String Gender,
                      String EmailAddress,
                      String PhoneNumber,
                      Address Address,
                      String jobtitle,
                      String department,
                      String managerID,
                      String dateofjoining,
                      String employmentstatus,
                      int salary,
                      String worklocation,
                      String employmenteligibilityverification,
                      String backgroundcheckstatus,
                      String emergencycontact,
                      String skills,
                      String education,
                      String certifications,
                      String performancereviews) {
        this.employeeId = EmployeeID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.middleName = MiddleName;
        this.dateOfBirth = DateofBirth;
        this.gender = Gender;
        this.phoneNumber = PhoneNumber;
        this.address = Address;
        this.emailAddress = EmailAddress;
        this.jobtitle = jobtitle;
        this.department = department;
        this.managerID = managerID;
        this.dateofjoining = dateofjoining;
        this.employmentstatus = employmentstatus;
        this.salary = salary;
        this.worklocation = worklocation;
        this.employmenteligibilityverification = employmenteligibilityverification;
        this.backgroundcheckstatus = backgroundcheckstatus;
        this.emergencycontact = emergencycontact;
        this.skills = skills;
        this.education = education;
        this.certifications = certifications;
        this.performancereviews = performancereviews;
    }

    public String getPannumber() {
        return pannumber;
    }

    public String getAadhaarnumber() {
        return aadhaarnumber;
    }

    public String getBankaccountdetails() {
        return bankaccountdetails;
    }

    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }

    public void setAadhaarnumber(String aadhaarnumber) {
        this.aadhaarnumber = aadhaarnumber;
    }

    public void setBankaccountdetails(String bankaccountdetails) {
        this.bankaccountdetails = bankaccountdetails;
    }

    public String toString() {
        return "EmployeeID: " + employeeId
                + "\nFirstname :" + firstName +
                "\nlastname :" + lastName +
                "\nmiddlename :" + middleName +
                "\ndateofbirth :" + dateOfBirth +
                "\ngender :" + gender +
                "\nphonenumber :" + phoneNumber +
                "\naddress :" + address +
                "\nemailaddress :" + emailAddress +
                "\nJob Title :" + jobtitle +
                "\nDepartment :" + department +
                "\nManagerID :" + managerID +
                "\nDateofJoining :" + dateofjoining +
                "\nEmployeeStatus :" + employmentstatus +
                "\nSalary :" + salary +
                "\nWorkLocation :" + worklocation +
                "\nEmergencyContact :" + emergencycontact +
                "\nSkills :" + skills +
                "\nEducation :" + education +
                "\nCertification :" + certifications +
                "\nPerformanceReviews :" + performancereviews;
    }

    public static void main(String[] args) {
        Address d = new Address("japan", "thailand", "tokyo", "london", "egypt", "606303");
        CCEmployee e = new CCEmployee("1234",
                "luffy",
                "monkey",
                "d",
                "28-9-2003",
                "male",
                "luffy@gmail.com",
                "8870541159",
                d,
                "Engineer",
                "CSE",
                "C4210",
                "20-9-2003",
                "Good",
                20000,
                "Madavakkam",
                "Java master",
                "japan",
                "8870541159",
                "Quick Learning",
                "College",
                "Degree",
                "Good"

        );
        System.out.println(e);

        e.setPannumber("987550");
        e.setAadhaarnumber("0987 9876 5432");
        e.setBankaccountdetails("8479332");
        System.out.println(e);
        System.out.println("PANNumber :" + e.getPannumber());
        System.out.println("AadharNumber :" + e.getAadhaarnumber());
        System.out.println("BankaccountDetials :" + e.getBankaccountdetails());
    }


}

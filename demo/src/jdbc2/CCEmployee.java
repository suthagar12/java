package jdbc2;

public class CCEmployee {
        public String  jobtitle;
        public  String department;
        public  String  managerID;
        public  String dateofjoining;
        public  String employmentstatus;
        public  int salary;
        public   String worklocation;
        private String  pannumber;
        private String  aadhaarnumber;
        private String bankaccountdetails;
        public String employmenteligibilityverification;
        public String  backgroundcheckstatus;
        public  String emergencycontact;
        public  String skills;
        public  String  education;
        public  String  certifications;
        public  String performancereviews;
        public CCEmployee(String jobtitle,
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
                                 String performancereviews){
            this.jobtitle=jobtitle;
            this.department=department;
            this.managerID=managerID;
            this.dateofjoining=dateofjoining;
            this.employmentstatus=employmentstatus;
            this.salary=salary;
            this.worklocation=worklocation;
            this.emergencycontact=emergencycontact;
            this.skills=skills;
            this.education=education;
            this.certifications=certifications;
            this.performancereviews=performancereviews;
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
        public String toString(){
            return "\nJob Title :"+jobtitle+
                    "\nDepartment :"+department+
                    "\nManagerID :"+managerID+
                    "\nDateofJoining :"+dateofjoining+
                    "\nEmployeeStatus :"+employmentstatus+
                    "\nSalary :"+salary+
                    "\nWorkLocation :"+worklocation+
                    "\nEmergencyContact :"+emergencycontact+
                    "\nSkills :"+skills+
                    "\nEducation :"+education+
                    "\nCertification :"+certifications+
                    "\nPerformanceReviews :"+performancereviews;


        }

        public static void main(String[] args) {
            CCEmployee  a=new  CCEmployee("Engineer",
                    "CSE",
                    "C4210",
                    "20-9-2003",
                    "Good",
                    25000,
                    "Madavakkam",
                    "Java master",
                    "No blackmark",
                    "8870541159",
                    "Quick Learning",
                    "College",
                    "Degree",
                    "Good");
            a.setPannumber("987550");
            a.setAadhaarnumber("0987 9876 5432");
            a.setBankaccountdetails("8479332");
            System.out.println(a);
            System.out.println("PANNumber :"+a.getPannumber());
            System.out.println("AadharNumber :"+a.getAadhaarnumber());
            System.out.println("BankaccountDetials :"+a.getBankaccountdetails());

        }

}

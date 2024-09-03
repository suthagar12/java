import java.time.LocalDate;
import java.time.Period;

public class Contact {
    String name;
    int phonenumber;
    String emailid;
    public  Contact(String name, int phonenumber, String emailid){
        this.name=name;
        this.phonenumber=phonenumber;
        this.emailid=emailid;
    }
    public void printcontact(){
        System.out.println("Name :"+name);
        System.out.println("Phonenumber :"+phonenumber);
        System.out.println("Emailid :"+emailid);
    }
}
class Person extends Contact{
//    private final String curDate;
    String dateofbirth;
    int calculateAge;
    public Person(String name,int phonenumber,String emailid){
        super(name,phonenumber,emailid);
        this.dateofbirth=dateofbirth;
    
    }

     public void printPersondetial(){
        LocalDate today=LocalDate.now();
        LocalDate dateofbirth=LocalDate.of(2003,9,28);
        int years=Period.between(dateofbirth,today).getYears();

        printcontact();
         System.out.println("DateOfBirth :"+dateofbirth);
//         boolean years = false;
         System.out.println(years);
     }

//   
}
class Company extends Contact{
    String GSTnumber;
    int establishedYear;
    public Company(String name,int phonenumber,String emailid,String GSTnumber,int establishedYear){
        super(name,phonenumber,emailid);
        this.GSTnumber=GSTnumber;
        this.establishedYear=establishedYear;
    }
    public void printCompanydetial(){
        printcontact();
        System.out.println("GSTnumber :"+GSTnumber);
        System.out.println("establishednYEAR :"+establishedYear);
    }
}
class Employee extends Company{
    String designation;
    int salary;
    public Employee(String name,int phonenumber,String emailid,String GSTnumber,int establishedYear,String dateofbirth, String designation, int salary){
        super(name, phonenumber, emailid, GSTnumber, establishedYear);
         this.designation=designation;
         this.salary=salary;
    }
    public void printEmployeedetial(){
        printCompanydetial();
        System.out.println("Designation :"+designation);
        System.out.println("Salary :"+salary);
    }

    public static void main(String[] args) {
        Contact c=new Contact("suthagar",2543647,"ss@gmail.com");
        Person p=new Person("luffy",9876,"ftr@gmail.com");
        Company v=new Company("lux",876,"xx@gmail.com","yt345",2000);
        Employee e=new Employee("kaido",98754,"iuy@gmail.com","gf764",2000,"87-09-2000","intern",1000000);
        Contact w=new Employee("Kaidoo",9866,"hhhhh","jsjjj",2000,"28-09-2003","farmer",8754);
        Employee y=(Employee)w;
        c.printcontact();
        p.printPersondetial();
        v.printCompanydetial();
        e.printEmployeedetial();
         y.printEmployeedetial();
      
    }
}
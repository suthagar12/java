abstract class School {
     String  name;
     String dept;

}
class Rep extends School{
    void name(){
        System.out.println("chopper");
    }
    void dept(){
        System.out.println("cse");
    }
}
class Topper extends School{
    void name(){
        System.out.println("franky");
    }
    void dept(){
        System.out.println("cse");
    }

    public static void main(String[] args) {
        Topper t=new Topper();
        Rep r=new Rep();
        t.dept();
        t.name();
        r.dept();
        r.name();
    }
}

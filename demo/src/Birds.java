public class Birds {
    void fly(){
        System.out.println("flying");
    }
    void eat(){
        System.out.println("warms");
    }
}
class Eagle extends Birds{
    void fly(){
        System.out.println("flying");
    }
    void eat(){
        System.out.println("eagle dont eat warm");
    }

    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.eat();
        e.fly();
    }
}

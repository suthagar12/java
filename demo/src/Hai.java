public class Hai {
    public static void father(){
        System.out.println("talk politely");
    }
}
class Hello extends Hai{
    public static void father(){
        System.out.println("eat properly");
    }

    public static void main(String[] args) {
//    Hai h=new Hai();
//    h.father();
//    Hello k=new Hello();
//    k.father();
        Hai hai=new Hello();
        Hello hello=(Hello)hai;
        hai.father();
        hello.father();
    }
}

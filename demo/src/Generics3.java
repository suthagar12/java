public class Generics3 {
    public static Integer sum(Integer num1,Integer num2){
        return num1+num2;
    }public static Double sum(Double num1,Double num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Integer a=sum(10,20);
        System.out.println("Sum of Integer: "+a);
        Double b=sum(10.8,11.9);
        System.out.println("Sum of Double :"+b);
    }

}




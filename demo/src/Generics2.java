import java.util.Arrays;
public class Generics2 {
    public static <T> void show(T[]t){
        for (T x:t){
            System.out.println(x );
        }
    }
    public static void main(String[] args) {
       Integer [] i={1,2,3,4,5};
        System.out.println("integer set "+ Arrays.toString(i));
       String [] s={"luffy","kaido","nami","brook","zoro"};
        System.out.println("string set "+ Arrays.toString(s));
       Character [] c={'a','b','c','d','e'};
        System.out.println("character set "+ Arrays.toString(c));
    }
}

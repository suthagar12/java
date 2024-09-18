import java.util.HashSet;

public class Set5 {
    public static void main(String[] args) {
        HashSet<String> hashset =new HashSet<>();
        hashset.add("anabell");
        hashset.add("bon");
        hashset.add("chopper");
        hashset.add("dadan");
       hashset.add("edward");
        System.out.println("before clearing hashset :"+hashset);
       hashset.clear();
        System.out.println("after clearing hashset :"+hashset);

    }
}

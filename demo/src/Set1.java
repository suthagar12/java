import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("anabell");
        set.add("bon");
        set.add("chopper");
        set.add("dadan");
        set.add("edward");
        System.out.println("befor adding string:"+ set);
        set.add("zoro");
        System.out.println("after adding string:"+ set);
    }
}

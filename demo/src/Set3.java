import java.util.HashSet;
import java.util.Set;

public class Set3 {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("anabell");
        set.add("bon");
        set.add("chopper");
        set.add("dadan");
        set.add("edward");
        HashSet<String> copyset=new HashSet<>(set);
        System.out.println("befor copy string:"+ set);
        System.out.println("after copy string:"+ copyset);
    }
}

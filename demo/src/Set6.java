import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Set6 {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
       Set<String> set1 =new HashSet<>();
        set.add("luffy");
        set.add("kaido");
        set.add("lucci");
        set.add("crock");
        set1.add("luffy");
        set1.add("kaido");
        set1.add("doffy");
        set1.add("nami");
        System.out.println("first set:"+set);
        System.out.println("second set:"+set1);
        set.retainAll(set1);
        System.out.println("retained set :"+set);
    }

}

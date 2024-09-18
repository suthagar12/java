import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedhashset =new LinkedHashSet<>();
        linkedhashset.add("anabell");
        linkedhashset.add("bon");
        linkedhashset.add("chopper");
        linkedhashset.add("dadan");
        linkedhashset.add("edward");
        System.out.println("before clearing set :"+linkedhashset);
        linkedhashset.clear();
        System.out.println("after clearing set :"+linkedhashset);
        System.out.println("Is LinkedHashSet empty: " + linkedhashset.isEmpty());
    }
}

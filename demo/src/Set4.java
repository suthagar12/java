import java.util.LinkedHashSet;

public class Set4 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("anabell");
        set.add("bon");
        set.add("chopper");
        set.add("dadan");
        set.add("edward");
        String[] array = new String[set.size()];
        array = set.toArray(array);
        System.out.println("Array contains:");
        for (String strColor : array) {
            System.out.println(strColor);
        }
    }}

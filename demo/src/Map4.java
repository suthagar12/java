import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        Map<Integer,String> treemap =new TreeMap<>();
        treemap.put(1,"jacky");
        treemap.put(2,"jully");
        treemap.put(3,"beema");
        treemap.put(4,"peethabaram");
        Set<Integer> keys=treemap.keySet();
        System.out.println("Keys:"+keys);

    }


}

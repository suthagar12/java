import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map5 {
    public static void main(String[] args) {
        TreeMap<String,Integer> treemap =new TreeMap<>();
        treemap.put("jacky",1);
        treemap.put("jully",2);
        treemap.put("beema",3);
        treemap.put("peethabaram",4);
        String firstkey=treemap.firstKey();
        System.out.println("Firstkey :"+firstkey);
        String lastkey= treemap.lastKey();
        System.out.println("LastKey :"+lastkey);
    }
}

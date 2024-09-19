import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        HashMap<Integer,String> Map=new HashMap<>();
        Map.put(1,"luffy");
        Map.put(2,"zoro");
        Map.put(3,"ussop");
        Map.put(4,"nana");
        System.out.println("oorginal values:"+Map);
        System.out.println("is their value 'luffy'?"+Map.containsValue("luffy"));
        System.out.println("is their value 'kaido' ?"+Map.containsValue("kaido"));
    }
}

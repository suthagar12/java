import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer,String> Map=new HashMap<>();
        Map.put(1,"luffy");
        Map.put(2,"zoro");
        Map.put(3,"ussop");
        Map.put(4,"nana");
        System.out.println("before removing:"+Map);
        Map.clear();
        System.out.println("After removing:"+Map);

    }
}

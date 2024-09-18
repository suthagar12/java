import java.util.LinkedList;

public class List5 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        LinkedList<String> list1 =new LinkedList<>();
        list.add("luffy");
        list.add("kaido");
        list1.add("whitebeard");
        list1.add("gol d roger");
      list.addAll(list1);
        System.out.println(list);
    }
}

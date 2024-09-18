import java.util.LinkedList;

public class List4 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        LinkedList<String> list1 =new LinkedList<>();
        list.add("luffy");
        list.add("kaido");
        list1.add("luffy");
        list1.add("kaido");
      if(list.equals(list1)){
          System.out.println("true");
      }else {
          System.out.println("false");
      }
    }
}

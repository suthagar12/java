import java.util.LinkedList;

public class List2 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(0,2);
        for(int l = 0; l< list.size(); l++)
            System.out.println(list.get(l)+" ");
    }
}

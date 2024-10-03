import java.util.Arrays;

public class Generics4 {
        public static <T> void swap(T[] array, int index1, int index2){
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        public static void main(String[] args) {
            Integer[] i = {1, 2, 3, 4, 5};
            System.out.println("Before swap: " + Arrays.toString(i));
            swap(i, 1, 3);
            System.out.println("After swap: " + Arrays.toString(i));

            String[] s = {"A", "B", "C", "D"};
            System.out.println("Before swap: " + Arrays.toString(s));
            swap(s, 0, 2);
            System.out.println("After swap: " + Arrays.toString(s));
        }
    }


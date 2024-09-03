import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String[] words = {"apple", "application", "banana", "appreciate", "pineapple"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first two word :");
        String app = sc.next();
        System.out.println("enter last two word :");
        String blue = sc.next();
        boolean isFound=false;
        for (String a : words) {

            if (a.startsWith(app) && a.endsWith(blue)) {
                System.out.println(a);
        return ;
            }

        }
        if(!isFound){
            System.out.println("The word not found");

    }


    }}

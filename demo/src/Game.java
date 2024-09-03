import java.util.Scanner;

public class Game {
    public static int Number(String a, String b, String c, String d){
        if(a.equals("yes") && b.equals("yes") && c.equals("yes") && d.equals("yes")){
            return 15;
        } else if (a.equals("yes")&& b.equals("yes") && c.equals("yes") && d.equals("no")) {
            return 14;
        }else if (a.equals("yes")&&b.equals("yes")&&c.equals("no")&&d.equals("yes")){
            return 13;
        }else if(a.equals("yes")&&b.equals("yes")&&c.equals("no")&&d.equals("no")){
            return 12;
        } else if (a.equals("yes")&&b.equals("no")&&c.equals("yes")&&d.equals("yes")) {
            return 11;
        }else if(a.equals("yes")&&b.equals("no")&&c.equals("yes")&&d.equals("no")){
            return 10;
        } else if (a.equals("yes") && b.equals("no") && c.equals("no") && d.equals("yes")) {
            return 9;
        } else if(a.equals("yes")&&b.equals("no")&&c.equals("no")&&d.equals("no")){
            return 8;
        }else if(a.equals("no")&&b.equals("yes")&&c.equals("yes")&&d.equals("yes")){
            return 7;
        }else if(a.equals("no")&&b.equals("yes")&&c.equals("yes")&&d.equals("no")){
            return 6;
        }else if(a.equals("no")&&b.equals("yes")&&c.equals("no")&&d.equals("yes")){
            return 5;
        }else if(a.equals("no")&&b.equals("yes")&&c.equals("no")&&d.equals("no")){
            return 4;
        }else if(a.equals("no")&&b.equals("no")&&c.equals("yes")&&d.equals("yes")){
            return 3;
        }else if(a.equals("no")&&b.equals("no")&&c.equals("yes")&&d.equals("no")){
            return 2;
        } else if (a.equals("no")&&b.equals("no")&&c.equals("no")&&d.equals("yes")) {
            return 1;
        }else {
            System.out.println("invalid");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Am muzan kibutsuji going to find the number u think.....");
        System.out.println("lets start...");
        System.out.println("think any number between 1 to 15...");
        System.out.println("Box A:8,9,10,11,12,13,14,15");
        System.out.println("Box B:4,5,6,7,12,13,14,15");
        System.out.println("Box C:2,3,6,7,10,11,14,15");
        System.out.println("Box D:1,3,5,7,9,13,15");
        Scanner sc=new Scanner(System.in);
        System.out.println("is number in box A?(yes/no):");
        String a=sc.next();
        System.out.println("is number in box B?(yes/no):");
        String b=sc.next();
        System.out.println("is number in box C?(yes/no):");
        String c=sc.next();
        System.out.println("is number in box D?(yes/no):");
        String d=sc.next();
        int number=Number(a, b, c, d);
        System.out.println("the number is :"+ number);
    }
}

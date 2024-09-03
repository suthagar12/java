import java.util.Scanner;
public class Number{
    private static int getValue(String C){
        switch(C){
            case"a":
                return 1;
            case"b":
                return 3;
            case"c":
                return 5;
            case"d":
                return 7;
            case"e":
                return 9;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first character(a,b,c,d,e):");
        String char1= String.valueOf(scanner.next().charAt(0));
        System.out.println("Enter the second Character(a,b,c,d,e):");
        String char2= String.valueOf(scanner.next().charAt(0));
        int value1=getValue(char1);
        int value2=getValue(char2);
        if(value1==-1||value2==-1){
            System.out.println("invalid");
            return;
        }
        int difference=Math.abs(value1-value2);
        System.out.println("Difference :"+difference);
    }
}
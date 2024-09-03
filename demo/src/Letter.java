import java.util.Scanner;
public class Letter {
    public static String tree(int num){
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine"};
        String[]teens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[]tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[]thousand={"thousand"};
        String[]million={"million"};
        if(num<10){
            return ones[num];

        } else if (num<20) {
            return teens[num-10];
        } else if (num<100) {
            return tens[num/10]+ones[num%10];
        } else if (num<1000) {
            return ones[num/100 ]+ " hundred " +  " and " +tree(num%100);
        } else if (num<10000) {
            return ones[num/1000] + " thousands " +tree(num%1000);
        }
        else if (num>10000){
            return tens[num/1000] + " " +thousand[num%10];
        }
        else if(num<=100000){
           return ones[num/100000]+ " " +million[num%10000];
        }
        else{
            return "number is out of range";
        }
    } public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = scanner.nextInt();
        System.out.println(tree(num));
}
}
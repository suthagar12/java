import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex0 {
    void isValidEmail(String eMail){
        String validRegex="([\\w._]+@[\\w]+.[A-Z a-z]{2,3})";
        Pattern p = Pattern.compile(validRegex);
        Matcher matcher = p.matcher(eMail);
        if( matcher.matches()){
            System.out.println("valid email");
        }
        else
            System.out.println("InValid Email");
    }
    public static void main(String[] args) {
       Regex0  emailRegex = new Regex0();
        System.out.print("email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        emailRegex.isValidEmail(email);
    }
}
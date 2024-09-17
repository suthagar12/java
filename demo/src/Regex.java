import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
     boolean isValidEmail(String email){
        String regex="^(\\w+)@(\\w+)\\.(.+)$";
        return email.matches(regex);
    }
    public static void main(String[] args) {
        Regex r=new Regex();
        System.out.println(r.isValidEmail("ssuthagar277@gma.c@m"));
        System.out.println(r.isValidEmail("ssuthagar277@gmail.fgh"));
        System.out.println(r.isValidEmail("ssuthagar277@gmail.com"));
    }
}
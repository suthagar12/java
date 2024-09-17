import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
     String extractPhoneNumbers(String text){
        String phone="\\(\\+(\\d){2}\\)(\\s)?(\\d{5})-(\\d{5})|(\\d){3}-(\\d){3}-(\\d){4}$";
        Pattern p=Pattern.compile(phone);
        Matcher m=p.matcher(text);
        if(m.find()){
            return m.group();
        }else{
            return null;
        }
    }
    public static void main(String[] args) {
        Regex1 r=new Regex1();
        System.out.println(r.extractPhoneNumbers("Call me at (+91)23456-72890 or at 987-424-4124"));
//        System.out.println(extractPhoneNumbers("No phone number here!"));
    }
}

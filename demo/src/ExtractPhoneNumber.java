import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractPhoneNumber {
     String extractPhoneNumbers(String text) {
        String phoneRegex = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5} | \\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" or ");
        }
        if (!result.toString().equals(""))
            return result.toString();
        else
            return "null";
    }
    public static void main(String[] args) {
         ExtractPhoneNumber r=new ExtractPhoneNumber();
        System.out.println(r.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));
    }
}
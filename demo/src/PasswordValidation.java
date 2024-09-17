import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordValidation {
    boolean isValidPassword(String password) {
                Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@,#,&,*])).{12,}");
                Matcher matcher = pattern.matcher(password);
                if(matcher.matches()) {
                    for (int i = 0; i < password.length(); i++) {
                        for (int j = 0; j < password.length(); j++) {
                            if (password.charAt(i) == password.charAt(j)) {
                               return true;
                            }}}}
                return false;
            }

            public static void main(String[] args) {
                PasswordValidation passwordValidation=new PasswordValidation();
                System.out.println(passwordValidation.isValidPassword("123ACBdbf@#$&"));
            }
        }

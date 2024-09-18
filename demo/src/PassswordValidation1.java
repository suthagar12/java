import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PasswordValidation1 {
    boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@,#,&,*])).{12,}");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) {
            for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (password.charAt(i) == password.charAt(j)) {
                        System.out.println("valid password");
                        return true;
                    }
                    }}}
        System.out.println("invalid password");
        return false;

    }

    public static void main(String[] args) {
        PasswordValidation1 passwordValidation=new PasswordValidation1();
        System.out.println(passwordValidation.isValidPassword("123ACBd"));
    }
}
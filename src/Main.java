import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
        try {
            newUser("Alex55", "Zxcvbnm1234", "Zxcvbnm1234");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void newUser(String username, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {

        String RegexLogin = "^[a-zA-Z0-9_]\\w{3,20}$";
        Pattern p = Pattern.compile(RegexLogin);
        Matcher m = p.matcher(username);


        String RegexPassword = "^[a-zA-Z0-9_]\\w{3,20}$";
        Pattern p2 = Pattern.compile(RegexPassword);
        Matcher m2 = p2.matcher(password);

        if (!m.matches()) {
            throw new WrongLoginException();

        }
        if (!m2.matches()) {
            throw new WrongPasswordException();
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

}

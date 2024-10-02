public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Try another password");
    }


}

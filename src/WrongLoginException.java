public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Try another login");
    }
}

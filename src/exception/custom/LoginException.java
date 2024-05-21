package exception.custom;

public class LoginException extends RuntimeException {

    public LoginException() {

          super("Invalid User Id..!!!");
    }

}

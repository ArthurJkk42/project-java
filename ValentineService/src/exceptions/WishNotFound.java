package exceptions;

public class WishNotFound extends RuntimeException{

    public WishNotFound(String message) {
        super(message);
    }
}
package data.exception;

public class StoreException extends RuntimeException {
    public StoreException(String message, Throwable cause) {
        super(message, cause);
    }
}

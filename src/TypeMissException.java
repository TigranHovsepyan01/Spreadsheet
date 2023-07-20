public class TypeMissException  extends RuntimeException{
    public TypeMissException() {
    }

    public TypeMissException(String message) {
        super(message);
    }

    public TypeMissException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeMissException(Throwable cause) {
        super(cause);
    }

    public TypeMissException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

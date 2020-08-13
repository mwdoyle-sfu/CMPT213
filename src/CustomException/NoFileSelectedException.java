package CustomException;

public class NoFileSelectedException extends RuntimeException {
    public NoFileSelectedException(){
        super();
    }

    public NoFileSelectedException(String message) {
        super(message);
    }
}

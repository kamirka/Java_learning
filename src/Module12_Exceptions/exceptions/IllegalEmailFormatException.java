package Module12_Exceptions.exceptions;

public class IllegalEmailFormatException extends RuntimeException{
    public IllegalEmailFormatException() {
    }

    public IllegalEmailFormatException(String message) {
        super(message);
    }
}

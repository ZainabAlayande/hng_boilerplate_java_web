package hng_java_boilerplate.user.exception;

public class InvalidPageNumberException extends RuntimeException{

    public InvalidPageNumberException(String mesage) {
        super(mesage);
    }
}

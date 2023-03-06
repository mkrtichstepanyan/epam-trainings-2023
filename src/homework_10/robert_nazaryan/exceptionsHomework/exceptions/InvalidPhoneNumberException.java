package homework_10.robert_nazaryan.exceptionsHomework.exceptions;

public class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException() {
        super("Phone Number isn't correct!");
    }

}

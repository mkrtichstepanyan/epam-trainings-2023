package homework_7.garik_gharibyan.exceptions;

public class PhoneNumberException extends PizzaException{
    public PhoneNumberException() {
        super("invalid phone number\n Example for phone number (+374) + (98) or (77) + (123456)");
    }
}

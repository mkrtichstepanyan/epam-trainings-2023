package homework_10.Karen_Sargsyan.pizza.productException;

public class PhoneNumberException extends RuntimeException {
    public String getMessage() {
        return "Phone number must be valid ! \nExample: +37498000000";
    }
}

package homework_7.Karen_Mikayelyan;

public class InvalidPhoneNumberException extends RuntimeException {

    @Override
    public String toString() {
        return "The phone number format is not correct";
    }
}

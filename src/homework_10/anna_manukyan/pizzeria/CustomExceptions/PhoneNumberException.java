package homework_10.anna_manukyan.pizzeria.CustomExceptions;

public class PhoneNumberException extends Exception {
    @Override
    public String toString() {
        return "Please provide correct phone number";
    }
}

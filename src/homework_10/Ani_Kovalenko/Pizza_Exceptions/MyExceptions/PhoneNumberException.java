package homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions;

public class PhoneNumberException extends Exception {
    @Override
    public String toString() {
        return "Please enter a valid phone number";
    }
}

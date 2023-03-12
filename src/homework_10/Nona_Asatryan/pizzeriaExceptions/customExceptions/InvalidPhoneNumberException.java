package homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions;

public class InvalidPhoneNumberException extends Exception {
    @Override
    public String toString() {
        return "Please, provide correct phone number!";
    }
}

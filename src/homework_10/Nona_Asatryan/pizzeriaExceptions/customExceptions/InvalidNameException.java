package homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions;

public class InvalidNameException extends Exception {
    @Override
    public String toString() {
        return "Please, provide correct format for name!";
    }
}

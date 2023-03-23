package homework_7.TatevKocharyan.exceptions;

public class InvalidNameException extends Exception{
    @Override
    public String toString() {
        return "Please provide correct name";
    }
}

package homework_7.gohar_hakobyan.exception;

public class ObjectNotFoundException extends Exception {

    @Override
    public String toString() {
        return "Not found. There is nothing for your request. ";
    }
}

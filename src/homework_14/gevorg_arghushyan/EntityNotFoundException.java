package homework_14.gevorg_arghushyan;

public class EntityNotFoundException extends RuntimeException {

    private String msg;

    public EntityNotFoundException(String msg) {
        super(msg);
    }
}
